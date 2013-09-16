// $Id: Stations.java,v 1.5 2013/07/26 13:26:06 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.airquality.aqa.x100.StationListDocument;
import it.csi.airquality.aqa.x100.StationListDocument.StationList;
import it.csi.airquality.aqa.x100.StationType;
import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.HstStationRecord;
import it.csi.aria.dbmanager.engine.Network;
import it.csi.aria.dbmanager.engine.Station;
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

public class Stations extends Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Stations.class.getSimpleName());

	private DbCreateParams dbConfig;
	private ExportCfgItem expConfig;

	public Stations(String servletPath, boolean useChildId,
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
		StationListDocument doc = StationListDocument.Factory.newInstance();
		StationList stationList = doc.addNewStationList();
		addSchemaLocation(stationList, XmlExport.ANAGRAPHIC_SCHEMA_NAMESPACE
				+ " " + expConfig.getAnagraphicSchemaUri());
		List<Station> listStations = readStations(startDate, endDate);
		for (Station station : listStations) {
			if (childId != null && !childId.equals(station.id_rete_monit))
				continue;
			StationType stationType = stationList.addNewStation();
			fillStationType(stationType, station);
		}
		return doc;
	}

	private void fillStationType(StationType st, Station s) {
		st.setId(s.codice_istat_comune + "." + s.progr_punto_com);
		st.setName(s.denominazione);
		st.setAddress(s.indirizzo_localita);
		st.setLatitude(toBigDecimal(s.latitudine));
		st.setLongitude(toBigDecimal(s.longitudine));
		st.setAltitude(toBigDecimal(s.quota_stazione));
		st.setMobile(s.isMobile());
		st.setType(toBigInteger(s.id_tp_stazione));
		st.setStartDate(toCalendar(getStartDate(s)));
		Calendar end = toCalendar(getEndDate(s));
		if (end != null)
			st.setEndDate(end);
		st.setNetworkId(s.id_rete_monit);
		st.setZoneType(s.id_tp_zona);
		st.setZoneInfo(toBigInteger(s.id_caratt_zona));
		st.setNationalRelevance(Boolean.TRUE.equals(s.fl_prop_nazionale));
		st.setNationalName(s.codice_eoi);
		st.setUEZone(s.zona_ue);
	}

	private List<Station> readStations(Date startDate, Date endDate)
			throws ServletException {
		lg.debug("Reading station list... ");
		DB db = null;
		try {
			boolean pubNet = expConfig.getPublicStations();
			boolean pubManagedNet = expConfig.getPublicManagedPrivateStations();
			boolean privNet = expConfig.getPrivateStations();
			boolean national = expConfig.getOnlyNationalStations();
			db = new DB(dbConfig);
			db.setLogger(new it.csi.util.logger.Logger(lg));
			db.connect();
			@SuppressWarnings("unchecked")
			List<Station> stations = db.getDbReader().readHstStationList(
					startDate, endDate);
			@SuppressWarnings("unchecked")
			List<Network> networks = db.getDbReader().readNetworkList(
					startDate, endDate, true);
			Map<String, Network> mapNets = new HashMap<String, Network>();
			for (Network n : networks)
				mapNets.put(n.id_rete_monit, n);
			Iterator<Station> itSt = stations.iterator();
			while (itSt.hasNext()) {
				Station s = itSt.next();
				Network n = mapNets.get(s.id_rete_monit);
				if (n == null || n.fl_privata == null) {
					itSt.remove();
				} else if ((n.fl_privata == 0 && !pubNet)
						|| (n.fl_privata == 1 && !pubManagedNet)
						|| (n.fl_privata == -1 && !privNet)) {
					itSt.remove();
				} else if (s.progr_punto_com == XmlExport.PROGR_PUNTO_COM_WAREHOUSE) {
					itSt.remove();
				} else if (national
						&& !Boolean.TRUE.equals(s.fl_prop_nazionale)) {
					itSt.remove();
				}
			}
			return stations;
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

	private Date getStartDate(Station s) {
		if (s.listHstInstances == null || s.listHstInstances.isEmpty())
			return s.data_validita;
		HstStationRecord hsr = (HstStationRecord) s.listHstInstances.get(0);
		return hsr.data_inizio;
	}

	private Date getEndDate(Station s) {
		if (s.listHstInstances == null || s.listHstInstances.isEmpty())
			return null;
		HstStationRecord hsr = (HstStationRecord) s.listHstInstances
				.get(s.listHstInstances.size() - 1);
		return hsr.data_fine;
	}

}
