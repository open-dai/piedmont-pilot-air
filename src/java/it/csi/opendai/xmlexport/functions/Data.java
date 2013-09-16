// $Id: Data.java,v 1.5 2013/07/26 14:14:36 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DataUtils;
import it.csi.aria.dbmanager.engine.Datum;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.DbTree;
import it.csi.aria.dbmanager.engine.DbTreeEx;
import it.csi.aria.dbmanager.engine.DbmanEngineException;
import it.csi.aria.dbmanager.engine.MeasureUnit;
import it.csi.aria.dbmanager.engine.MiniDatum;
import it.csi.aria.dbmanager.engine.Network;
import it.csi.aria.dbmanager.engine.ParameterRecord;
import it.csi.aria.dbmanager.engine.Sensor;
import it.csi.aria.dbmanager.engine.Station;
import it.csi.opendai.xmlexport.ExportCfgItem;
import it.csi.opendai.xmlexport.Pollutant;
import it.csi.opendai.xmlexport.XmlExport;

import java.math.BigInteger;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletException;

import net.opengis.gml.x32.AbstractFeatureType;
import net.opengis.gml.x32.FeatureCollectionDocument;
import net.opengis.gml.x32.FeatureCollectionType;
import net.opengis.gml.x32.FeaturePropertyType;
import net.opengis.gml.x32.ReferenceType;
import net.opengis.gml.x32.TimeInstantPropertyType;
import net.opengis.gml.x32.TimeInstantType;
import net.opengis.gml.x32.TimePeriodDocument;
import net.opengis.gml.x32.TimePeriodType;
import net.opengis.gml.x32.TimePositionType;
import net.opengis.om.x20.NamedValuePropertyType;
import net.opengis.om.x20.NamedValueType;
import net.opengis.om.x20.OMObservationDocument;
import net.opengis.om.x20.OMObservationType;
import net.opengis.om.x20.OMProcessPropertyType;
import net.opengis.om.x20.TimeObjectPropertyType;
import net.opengis.swe.x20.CategoryDocument;
import net.opengis.swe.x20.CategoryType;
import net.opengis.swe.x20.CountPropertyType;
import net.opengis.swe.x20.CountType;
import net.opengis.swe.x20.DataArrayType;
import net.opengis.swe.x20.DataArrayType.ElementType;
import net.opengis.swe.x20.DataArrayType.Encoding;
import net.opengis.swe.x20.DataRecordDocument;
import net.opengis.swe.x20.DataRecordType;
import net.opengis.swe.x20.DataRecordType.Field;
import net.opengis.swe.x20.EncodedValuesPropertyType;
import net.opengis.swe.x20.QuantityDocument;
import net.opengis.swe.x20.QuantityType;
import net.opengis.swe.x20.TextEncodingDocument;
import net.opengis.swe.x20.TextEncodingType;
import net.opengis.swe.x20.TimeDocument;
import net.opengis.swe.x20.TimeType;
import net.opengis.swe.x20.UnitReference;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;

public class Data extends Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Data.class.getSimpleName());

	private static final String TIME_FMT_BEG = "yyyy-MM-dd'T'HH:mm:ss'+01:00'";
	private static final String TIME_FMT_END = "yyyy-MM-dd'T'kk:mm:ss'+01:00'";

	private DbCreateParams dbConfig;
	private ExportCfgItem expConfig;
	private Map<Integer, Pollutant> mapPollutants;
	private long maxDataPerRequest;

	public Data(String servletPath, boolean useChildId,
			DbCreateParams dbConfig, ExportCfgItem expConfig,
			Map<Integer, Pollutant> mapPollutants) {
		super(servletPath, useChildId);
		this.dbConfig = dbConfig;
		this.expConfig = expConfig;
		this.mapPollutants = mapPollutants;
		this.maxDataPerRequest = expConfig.getMaxDataPerRequest();
	}

	@Override
	protected XmlObject makeXmlDocument(String childId,
			Map<String, String[]> mapParams) throws Exception {
		DbTreeEx tree = parseRequestParams(mapParams);
		cleanAndLogMemory();
		readData(tree);
		if (!checkData(tree))
			throw new ServletException("Data read error");
		cleanAndLogMemory();
		FeatureCollectionDocument doc = FeatureCollectionDocument.Factory
				.newInstance();
		FeatureCollectionType featureColl = doc.addNewFeatureCollection();
		featureColl.setId("observation");
		addSchemaLocation(
				featureColl,
				"http://aqd.ec.europa.eu/aqd/0.3.7c"
						+ " http://dd.eionet.europa.eu/schemas/id2011850eu/AirQualityReporting.xsd"
						+ " http://www.opengis.net/swe/2.0"
						+ " http://schemas.opengis.net/sweCommon/2.0/swe.xsd");
		int timePeriodCounter = 0;
		int timeInstanceCounter = 0;
		@SuppressWarnings("unchecked")
		List<Station> stationList = tree.listStations;
		for (Station station : stationList) {
			@SuppressWarnings("unchecked")
			List<Sensor> sensorList = station.listSensors;
			for (Sensor sensor : sensorList) {
				FeaturePropertyType fpt = featureColl.addNewFeatureMember();
				timePeriodCounter++;
				timeInstanceCounter++;
				@SuppressWarnings("unchecked")
				Map<String, MeasureUnit> measureUnits = tree.measureUnits;
				fillObservation(fpt.addNewAbstractFeature(), station, sensor,
						tree.startDate, tree.endDate, measureUnits,
						timePeriodCounter, timeInstanceCounter);
			}
		}
		cleanAndLogMemory();
		tree = null;
		cleanAndLogMemory();
		return doc;
	}

	private void fillObservation(AbstractFeatureType aft, Station station,
			Sensor sensor, Date begin, Date end,
			Map<String, MeasureUnit> measureUnits, int timePeriodCounter,
			int timeInstanceCounter) throws ServletException {
		DateFormat timeFmtBeg = new SimpleDateFormat(TIME_FMT_BEG);
		DateFormat timeFmtEnd = new SimpleDateFormat(TIME_FMT_END);
		OMObservationType observation = (OMObservationType) aft.substitute(
				OMObservationDocument.type.getDocumentElementName(),
				OMObservationType.type);
		String stId = station.codice_eoi != null ? station.codice_eoi : "LID"
				+ station.codice_istat_comune + "." + station.progr_punto_com;
		String seId = sensor.component_number == null
				|| sensor.component_number < 0 ? "LID" + sensor.id_parametro
				: sensor.component_number.toString();
		Pollutant pollutant = mapPollutants.get(sensor.component_number);
		observation.setId("Observation_" + stId + "_" + seId);
		TimeObjectPropertyType timeProperty = TimeObjectPropertyType.Factory
				.newInstance();
		TimePeriodType timePeriod = (TimePeriodType) timeProperty
				.addNewAbstractTimeObject().substitute(
						TimePeriodDocument.type.getDocumentElementName(),
						TimePeriodType.type);
		timePeriod.setId("ObservationTimePeriod_" + timePeriodCounter++);
		TimePositionType beginPosition = TimePositionType.Factory.newInstance();
		beginPosition.setStringValue(timeFmtBeg.format(begin));
		timePeriod.setBeginPosition(beginPosition);
		TimePositionType endPosition = TimePositionType.Factory.newInstance();
		endPosition.setStringValue(timeFmtEnd.format(end));
		timePeriod.setEndPosition(endPosition);
		observation.setPhenomenonTime(timeProperty);

		TimeInstantPropertyType instantProperty = TimeInstantPropertyType.Factory
				.newInstance();
		TimeInstantType timeInstant = TimeInstantType.Factory.newInstance();
		timeInstant.setId("ObservationResultInstance_" + timeInstanceCounter++);
		TimePositionType nowPosition = TimePositionType.Factory.newInstance();
		nowPosition.setStringValue(timeFmtBeg.format(new Date()));
		timeInstant.setTimePosition(nowPosition);
		instantProperty.setTimeInstant(timeInstant);
		observation.setResultTime(instantProperty);

		OMProcessPropertyType procedureProperty = OMProcessPropertyType.Factory
				.newInstance();
		procedureProperty.setHref("Process_1");
		observation.setProcedure(procedureProperty);

		NamedValuePropertyType paramProperty = observation.addNewParameter();
		NamedValueType namedValue = NamedValueType.Factory.newInstance();
		ReferenceType paramName = ReferenceType.Factory.newInstance();
		paramName
				.setHref("http://dd.eionet.europa.eu/vocabulary/aq/processparameter/AT/");
		namedValue.setName(paramName);
		XmlString xs = XmlString.Factory.newInstance();
		xs.setStringValue("Fixed measurement");
		namedValue.setValue(xs);
		paramProperty.setNamedValue(namedValue);

		NamedValuePropertyType paramProperty2 = observation.addNewParameter();
		NamedValueType namedValue2 = NamedValueType.Factory.newInstance();
		ReferenceType paramName2 = ReferenceType.Factory.newInstance();
		paramName2
				.setHref("http://dd.eionet.europa.eu/vocabulary/aq/processparameter/SP/");
		namedValue2.setName(paramName2);
		XmlString xs2 = XmlString.Factory.newInstance();
		xs2.setStringValue("Samplingpoint_" + stId + "_sp1");
		namedValue2.setValue(xs2);
		paramProperty2.setNamedValue(namedValue2);

		ReferenceType observedProp = ReferenceType.Factory.newInstance();
		observedProp.setHref(pollutant != null ? pollutant.getName()
				: sensor.parameter.denominazione);
		observation.setObservedProperty(observedProp);

		FeaturePropertyType featureOfInterest = FeaturePropertyType.Factory
				.newInstance();
		featureOfInterest.setHref("SampleFeature_" + stId + "_sp1");
		observation.setFeatureOfInterest(featureOfInterest);

		DataArrayType result = DataArrayType.Factory.newInstance();

		CountPropertyType countProperty = CountPropertyType.Factory
				.newInstance();
		CountType count = CountType.Factory.newInstance();
		count.setValue(BigInteger.valueOf(sensor.data.size()));
		countProperty.setCount(count);
		result.setElementCount(countProperty);

		ElementType element = ElementType.Factory.newInstance();
		element.setName("Components");
		DataRecordType recordType = (DataRecordType) element
				.addNewAbstractDataComponent().substitute(
						DataRecordDocument.type.getDocumentElementName(),
						DataRecordType.type);
		Field field0 = recordType.addNewField();
		field0.setName("StartTime");
		TimeType fieldTime0 = (TimeType) field0.addNewAbstractDataComponent()
				.substitute(TimeDocument.type.getDocumentElementName(),
						TimeType.type);
		fieldTime0
				.setDefinition("http://www.opengis.net/def/property/OGC/0/SamplingTime");
		UnitReference ref0 = UnitReference.Factory.newInstance();
		ref0.setHref("http://www.opengis.net/def/uom/ISO-8601/0/Gregorian");
		fieldTime0.setUom(ref0);
		Field field1 = recordType.addNewField();
		field1.setName("EndTime");
		TimeType fieldTime1 = (TimeType) field1.addNewAbstractDataComponent()
				.substitute(TimeDocument.type.getDocumentElementName(),
						TimeType.type);
		fieldTime1
				.setDefinition("http://www.opengis.net/def/property/OGC/0/SamplingTime");
		UnitReference ref1 = UnitReference.Factory.newInstance();
		ref1.setHref("http://www.opengis.net/def/uom/ISO-8601/0/Gregorian");
		fieldTime1.setUom(ref1);
		Field field2 = recordType.addNewField();
		field2.setName("Validity");
		CategoryType fieldCategory2 = (CategoryType) field2
				.addNewAbstractDataComponent().substitute(
						CategoryDocument.type.getDocumentElementName(),
						CategoryType.type);
		fieldCategory2
				.setDefinition("http://dd.eionet.europa.eu/vocabulary/aq/observationvalidity/");
		Field field3 = recordType.addNewField();
		field3.setName("Verification");
		CategoryType fieldCategory3 = (CategoryType) field3
				.addNewAbstractDataComponent().substitute(
						CategoryDocument.type.getDocumentElementName(),
						CategoryType.type);
		fieldCategory3
				.setDefinition("http://dd.eionet.europa.eu/vocabulary/aq/observationverification/");
		Field field4 = recordType.addNewField();
		field4.setName(pollutant != null ? pollutant.getAcronym()
				: sensor.parameter.denominazione);
		QuantityType fieldQuantity4 = (QuantityType) field4
				.addNewAbstractDataComponent().substitute(
						QuantityDocument.type.getDocumentElementName(),
						QuantityType.type);
		fieldQuantity4.setDefinition(pollutant != null ? pollutant.getURI()
				+ "/" : "");
		UnitReference ref4 = UnitReference.Factory.newInstance();
		MeasureUnit mu = measureUnits.get(sensor.parameter.id_unita_misura);
		String muSymbol = mu == null ? "" : mu.simbolo;
		// TODO: use UCUM format for measure units
		ref4.setCode(muSymbol);
		fieldQuantity4.setUom(ref4);
		result.setElementType(element);

		Encoding encoding = Encoding.Factory.newInstance();
		TextEncodingType textEncoding = (TextEncodingType) encoding
				.addNewAbstractEncoding().substitute(
						TextEncodingDocument.type.getDocumentElementName(),
						TextEncodingType.type);
		textEncoding.setDecimalSeparator(".");
		textEncoding.setTokenSeparator(",");
		textEncoding.setBlockSeparator("@@");
		result.setEncoding(encoding);

		NumberFormat nf = null;
		if (sensor.num_decimale_mce != null) {
			int numDec = sensor.num_decimale_mce;
			if (numDec < 0)
				numDec = 0;
			nf = DecimalFormat.getInstance(Locale.US);
			nf.setGroupingUsed(false);
			nf.setMaximumFractionDigits(numDec);
			nf.setMinimumFractionDigits(numDec);
		}
		EncodedValuesPropertyType values = EncodedValuesPropertyType.Factory
				.newInstance();
		StringBuilder dataString = new StringBuilder();
		@SuppressWarnings("unchecked")
		List<MiniDatum> data = sensor.data;
		for (MiniDatum md : data) {
			Datum datum = md.getDatum();
			int verif = getVerification(datum);
			int validity = getValidity(datum);
			String measure = printValue(datum, verif, nf);
			Date datumEndDate;
			try {
				datumEndDate = DataUtils.makeTrueDate(datum);
			} catch (DbmanEngineException e) {
				throw new ServletException(e);
			}
			Calendar cal = new GregorianCalendar();
			cal.setTime(datumEndDate);
			cal.add(Calendar.MINUTE, -sensor.tempo_registrazione);
			Date datumStartDate = cal.getTime();
			dataString.append(timeFmtBeg.format(datumStartDate) + ","
					+ timeFmtEnd.format(datumEndDate) + "," + validity + ","
					+ verif + "," + measure + "@@");
		}
		values.newCursor().setTextValue(dataString.toString());
		result.setValues(values);
		observation.setResult(result);
	}

	private int getValidity(Datum datum) {
		int validity; // 1: valid, -1: not valid
		if (datum.flag_gestore_sistema != null) {
			validity = "0".equals(datum.flag_gestore_sistema) ? 1 : -1;
		} else {
			validity = (datum.flag_validaz_autom != null && "1"
					.equals(datum.flag_validaz_autom))
					|| "MMM".equals(datum.tipologia_validaz)
					|| "A75".equals(datum.tipologia_validaz)
					|| datum.valore_originale == null ? -1 : 1;
		}
		return validity;
	}

	private int getVerification(Datum datum) {
		int verification;
		if ("0".equals(datum.flag_regione))
			verification = 1; // Verified
		else if (datum.flag_gestore_sistema != null)
			verification = 2; // Preliminary verified
		else
			verification = 3; // Not verified
		return verification;
	}

	private String printValue(Datum datum, int verification, NumberFormat nf) {
		Double value = verification == 3 ? datum.valore_originale
				: datum.valore_validato;
		if (value == null)
			return "";
		return nf == null ? value.toString() : nf.format(value);
	}

	@Override
	protected Map<String, String> getSuggestedPrefixes() {
		Map<String, String> map = super.getSuggestedPrefixes();
		map.put("http://aqd.ec.europa.eu/aqd/0.3.7c", "aqd");
		map.put("http://www.opengis.net/gml/3.2", "gml");
		map.put("http://www.opengis.net/om/2.0", "om");
		map.put("http://www.opengis.net/swe/2.0", "swe");
		map.put("http://www.opengis.net/samplingSpatial/2.0", "sams");
		map.put("http://www.opengis.net/sampling/2.0", "sam");
		map.put("http://www.isotc211.org/2005/gmd", "gmd");
		map.put("http://www.isotc211.org/2005/gco", "gco");
		map.put("http://www.isotc211.org/2005/gss", "gss");
		map.put("http://www.isotc211.org/2005/gts", "gts");
		map.put("http://www.isotc211.org/2005/gsr", "gsr");
		map.put("http://inspire.jrc.ec.europa.eu/schemas/ef/2.0", "ef");
		map.put("http://inspire.jrc.ec.europa.eu/schemas/base2/0.1", "base2");
		map.put("http://inspire.jrc.ec.europa.eu/schemas/am/2.0", "am");
		map.put("http://inspire.jrc.ec.europa.eu/schemas/am-ru/2.0", "am-ru");
		return map;
	}

	private DbTreeEx parseRequestParams(Map<String, String[]> mapParams)
			throws Exception {
		DbTreeEx tree = new DbTreeEx();
		Date startDate = getMapDate(mapParams, "startDate");
		Date endDate = getMapDate(mapParams, "endDate");
		if (endDate == null)
			endDate = new Date();
		if (startDate == null)
			startDate = endDate;
		tree.startDate = DataUtils.thisDay(startDate);
		tree.startDateIncluded = true;
		tree.endDate = DataUtils.nextDay(endDate);
		tree.endDateIncluded = true;
		if (tree.endDate.after(new Date()))
			tree.endDate = new Date();
		// stations=(ID_stazione1:ID_par1,ID_par2;ID_stazione2:ID_par2,ID_par3)
		String dataRequest = getMapString(mapParams, "stations");
		lg.debug("Data request: '" + dataRequest + "'");
		if (dataRequest == null)
			throw new BadParameterException("Data request missing");
		String dataReqStr = dataRequest.trim();
		String prefix = "(";
		if (!dataReqStr.startsWith(prefix))
			throw new BadParameterException("Data request does not start"
					+ " with '" + prefix + "': " + dataRequest);
		dataReqStr = dataReqStr.substring(prefix.length());
		String suffix = ")";
		if (!dataReqStr.endsWith(suffix))
			throw new BadParameterException("Data request does not end with '"
					+ suffix + "': " + dataRequest);
		dataReqStr = dataReqStr.substring(0, dataReqStr.length()
				- suffix.length());
		dataReqStr = dataReqStr.trim();
		List<Station> listStations = new ArrayList<Station>();
		String[] strStationSensorsReq = dataReqStr.split(";");
		String errorMessage = "Invalid data request: " + dataRequest;
		for (int i = 0; i < strStationSensorsReq.length; i++) {
			String[] fields = strStationSensorsReq[i].split(":", 2);
			if (fields.length != 2)
				throw new BadParameterException(errorMessage);
			String[] stationFields = fields[0].split("\\.", 2);
			if (stationFields.length != 2)
				throw new BadParameterException(errorMessage);
			Station station = new Station();
			station.codice_istat_comune = stationFields[0];
			try {
				station.progr_punto_com = new Integer(stationFields[1]);
			} catch (NumberFormatException e) {
				throw new BadParameterException(errorMessage);
			}
			List<Sensor> listSensors = new ArrayList<Sensor>();
			station.listSensors = listSensors;
			listStations.add(station);
			String[] strSensors = fields[1].split(",");
			for (int j = 0; j < strSensors.length; j++) {
				Sensor sensor = new Sensor();
				sensor.id_parametro = strSensors[j];
				listSensors.add(sensor);
			}
		}
		tree.listStations = listStations;
		tree.listParameters = null;
		return tree;
	}

	private void readData(DbTreeEx tree) throws ServletException {
		DB db = null;
		try {
			db = new DB(dbConfig);
			db.setDbTree(tree);
			// Verifica stazioni e sensori e lettura dati
			lg.debug("Reading information for station and sensors... ");
			db.connect();
			db.getDbReader().setMinimumFields(true);
			db.updateTree(tree.startDate, tree.endDate, true);
			@SuppressWarnings("unchecked")
			List<Network> networks = db.getDbReader().readNetworkList(
					tree.startDate, tree.endDate, true);
			applyAnagraphicFilters(tree, networks);
			long numData = tree.countDataForPeriod();
			if (numData > maxDataPerRequest)
				throw new RuntimeException("The number of data requested "
						+ numData + " is more than the maximum allowed "
						+ maxDataPerRequest);
			db.readMeasureUnits();
			tree.measureUnits = db.getMeasureUnits();
			lg.debug("Reading data... ");
			lg.debug("Time period: " + formatDate(tree.startDate) + " -> "
					+ formatDate(tree.endDate));
			db.readData(tree.startDate, tree.startDateIncluded, tree.endDate,
					tree.endDateIncluded, true, true, true, true);
		} catch (Exception ex) {
			lg.error(ex);
			throw new ServletException(ex);
		} finally {
			if (db != null) {
				try {
					db.disconnect();
				} catch (SQLException e) {
					lg.error(e);
				}
			}
		}
	}

	private void applyAnagraphicFilters(DbTreeEx tree, List<Network> networks) {
		boolean pubNet = expConfig.getPublicStations();
		boolean pubManagedNet = expConfig.getPublicManagedPrivateStations();
		boolean privNet = expConfig.getPrivateStations();
		boolean nationalSt = expConfig.getOnlyNationalStations();
		boolean nationalSe = expConfig.getOnlyNationalSensors();
		boolean chemical = expConfig.getChemicalSensors();
		boolean meteo = expConfig.getMeteoSensors();
		boolean aux = expConfig.getAuxSensors();
		Map<String, Network> mapNets = new HashMap<String, Network>();
		for (Network n : networks)
			mapNets.put(n.id_rete_monit, n);
		@SuppressWarnings("unchecked")
		Iterator<Station> itSt = tree.listStations.iterator();
		while (itSt.hasNext()) {
			Station st = itSt.next();
			Network n = mapNets.get(st.id_rete_monit);
			if (n == null || n.fl_privata == null) {
				itSt.remove();
			} else if ((n.fl_privata == 0 && !pubNet)
					|| (n.fl_privata == 1 && !pubManagedNet)
					|| (n.fl_privata == -1 && !privNet)) {
				itSt.remove();
			} else if (st.progr_punto_com == XmlExport.PROGR_PUNTO_COM_WAREHOUSE) {
				itSt.remove();
			} else if (nationalSt && !Boolean.TRUE.equals(st.fl_prop_nazionale)) {
				itSt.remove();
			} else {
				@SuppressWarnings("unchecked")
				Iterator<Sensor> itSe = st.listSensors.iterator();
				while (itSe.hasNext()) {
					Sensor se = itSe.next();
					ParameterRecord p = se.parameter;
					if (p == null) {
						itSe.remove();
					} else if (("C".equals(p.tipologia) && !chemical)
							|| ("M".equals(p.tipologia) && !meteo)
							|| ("A".equals(p.tipologia) && !aux)) {
						itSe.remove();
					} else if (nationalSe
							&& (se.component_number == null || se.component_number < 0)) {
						itSe.remove();
					}
				}
			}
		}
	}

	private boolean checkData(DbTree tree) {
		lg.debug("Checking read data...");
		int errorCount = 0;
		@SuppressWarnings("unchecked")
		ListIterator<Station> li_st = tree.listStations.listIterator();
		while (li_st.hasNext()) {
			Station st = li_st.next();
			boolean first = true;
			@SuppressWarnings("unchecked")
			ListIterator<Sensor> li_se = st.listSensors.listIterator();
			while (li_se.hasNext()) {
				Sensor se = li_se.next();
				if (se.data == null) {
					if (first) {
						lg.warn("station " + st.denominazione
								+ ", discarded sensors for data read errors:");
						first = false;
					}
					lg.warn(se.parameter.denominazione);
					li_se.remove();
					errorCount++;
				}
			}
		}
		if (errorCount == 0)
			lg.debug("No errors found");
		return errorCount == 0;
	}

	private void cleanAndLogMemory() {
		if (!lg.isDebugEnabled())
			return;
		System.gc();
		Runtime r = Runtime.getRuntime();
		long free = r.freeMemory();
		long total = r.totalMemory();
		long used = total - free;
		lg.debug("Used/total memory [MB]: " + used / 1048576 + "/" + total
				/ 1048576);
	}

}
