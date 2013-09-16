// $Id: Sensors.java,v 1.5 2013/07/26 13:26:06 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.airquality.aqa.x100.SensorListDocument;
import it.csi.airquality.aqa.x100.SensorListDocument.SensorList;
import it.csi.airquality.aqa.x100.SensorType;
import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.HstSensorRecord;
import it.csi.aria.dbmanager.engine.ParameterRecord;
import it.csi.aria.dbmanager.engine.Sensor;
import it.csi.aria.dbmanager.engine.StationKey;
import it.csi.opendai.xmlexport.ExportCfgItem;
import it.csi.opendai.xmlexport.XmlExport;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;

public class Sensors extends Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Sensors.class.getSimpleName());

	private DbCreateParams dbConfig;
	private ExportCfgItem expConfig;

	public Sensors(String servletPath, boolean useChildId,
			DbCreateParams dbConfig, ExportCfgItem expConfig) {
		super(servletPath, useChildId);
		this.dbConfig = dbConfig;
		this.expConfig = expConfig;
	}

	@Override
	protected XmlObject makeXmlDocument(String childId,
			Map<String, String[]> mapParams) throws Exception {
		Date startDate = getMapDate(mapParams, "startDate");
		Date endDate = getMapDate(mapParams, "endDate");
		if (endDate == null)
			endDate = new Date();
		if (startDate == null)
			startDate = endDate;
		StationKey stationKey = new StationKey();
		if (childId != null) {
			String[] keyFields = childId.split("\\.", 2);
			if (keyFields.length == 2) {
				stationKey.codice_istat_comune = keyFields[0];
				stationKey.progr_punto_com = new Integer(keyFields[1]);
			} else {
				throw new BadParameterException("Bad syntax for station ID '"
						+ childId + "'");
			}
		}
		SensorListDocument doc = SensorListDocument.Factory.newInstance();
		SensorList sensorList = doc.addNewSensorList();
		addSchemaLocation(sensorList, XmlExport.ANAGRAPHIC_SCHEMA_NAMESPACE
				+ " " + expConfig.getAnagraphicSchemaUri());
		List<Sensor> listSensors = readSensors(stationKey, startDate, endDate);
		for (Sensor sensor : listSensors) {
			SensorType sensorType = sensorList.addNewSensor();
			fillSensorType(sensorType, sensor);
		}
		return doc;
	}

	private void fillSensorType(SensorType st, Sensor s) {
		st.setId(s.id_parametro);
		st.setStartDate(toCalendar(getStartDate(s)));
		Calendar end = toCalendar(getEndDate(s));
		if (end != null)
			st.setEndDate(end);
		st.setAcquisitionPeriod(toBigInteger(s.tempo_registrazione));
		st.setNationalId(toBigInteger(s.component_number));
	}

	private List<Sensor> readSensors(StationKey stationKey, Date startDate,
			Date endDate) throws ServletException {
		lg.debug("Reading sensor list... ");
		DB db = null;
		try {
			boolean national = expConfig.getOnlyNationalSensors();
			boolean chemical = expConfig.getChemicalSensors();
			boolean meteo = expConfig.getMeteoSensors();
			boolean aux = expConfig.getAuxSensors();
			db = new DB(dbConfig);
			db.setLogger(new it.csi.util.logger.Logger(lg));
			db.connect();
			@SuppressWarnings("unchecked")
			List<Sensor> sensors = db.getDbReader().readHstSensorList(
					stationKey, startDate, endDate);
			@SuppressWarnings("unchecked")
			List<ParameterRecord> parameters = db.getDbReader()
					.readParameterList();
			Map<String, ParameterRecord> mapParams = new HashMap<String, ParameterRecord>();
			for (ParameterRecord p : parameters)
				mapParams.put(p.id_parametro, p);
			Iterator<Sensor> itSe = sensors.iterator();
			while (itSe.hasNext()) {
				Sensor s = itSe.next();
				ParameterRecord p = mapParams.get(s.id_parametro);
				if (p == null) {
					itSe.remove();
				} else if (("C".equals(p.tipologia) && !chemical)
						|| ("M".equals(p.tipologia) && !meteo)
						|| ("A".equals(p.tipologia) && !aux)) {
					itSe.remove();
				} else if (national
						&& (s.component_number == null || s.component_number < 0)) {
					itSe.remove();
				} else
					s.parameter = p;
			}
			return sensors;
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

	private Date getStartDate(Sensor s) {
		if (s.listHstInstances == null || s.listHstInstances.isEmpty())
			return s.data_inizio_validita;
		HstSensorRecord hsr = (HstSensorRecord) s.listHstInstances.get(0);
		return hsr.data_inizio;
	}

	private Date getEndDate(Sensor s) {
		if (s.listHstInstances == null || s.listHstInstances.isEmpty())
			return null;
		HstSensorRecord hsr = (HstSensorRecord) s.listHstInstances
				.get(s.listHstInstances.size() - 1);
		return hsr.data_fine;
	}

}
