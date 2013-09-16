// $Id: Networks.java,v 1.5 2013/07/26 13:26:06 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.airquality.aqa.x100.NetworkListDocument;
import it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList;
import it.csi.airquality.aqa.x100.NetworkType;
import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.Network;
import it.csi.opendai.xmlexport.ExportCfgItem;
import it.csi.opendai.xmlexport.XmlExport;

import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;

public class Networks extends Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Networks.class.getSimpleName());

	private DbCreateParams dbConfig;
	private ExportCfgItem expConfig;

	public Networks(String servletPath, boolean useChildId,
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
		NetworkListDocument doc = NetworkListDocument.Factory.newInstance();
		NetworkList networkList = doc.addNewNetworkList();
		addSchemaLocation(networkList, XmlExport.ANAGRAPHIC_SCHEMA_NAMESPACE
				+ " " + expConfig.getAnagraphicSchemaUri());
		List<Network> listNetworks = readNetworks(startDate, endDate);
		for (Network net : listNetworks) {
			NetworkType networkType = networkList.addNewNetwork();
			fillNetworkType(networkType, net);
		}
		return doc;
	}

	private void fillNetworkType(NetworkType nt, Network n) {
		nt.setId(n.id_rete_monit);
		nt.setName(n.denominazione);
		nt.setType(toBigInteger(n.fl_privata));
	}

	private List<Network> readNetworks(Date startDate, Date endDate)
			throws ServletException {
		lg.debug("Reading network list... ");
		DB db = null;
		try {
			boolean pubNet = expConfig.getPublicStations();
			boolean pubManagedNet = expConfig.getPublicManagedPrivateStations();
			boolean privNet = expConfig.getPrivateStations();
			db = new DB(dbConfig);
			db.setLogger(new it.csi.util.logger.Logger(lg));
			db.connect();
			@SuppressWarnings("unchecked")
			List<Network> networks = db.getDbReader().readNetworkList(
					startDate, endDate, true);
			Iterator<Network> itNet = networks.iterator();
			while (itNet.hasNext()) {
				Network net = itNet.next();
				if (net.fl_privata == null) {
					itNet.remove();
				} else if ((net.fl_privata == 0 && !pubNet)
						|| (net.fl_privata == 1 && !pubManagedNet)
						|| (net.fl_privata == -1 && !privNet)) {
					itNet.remove();
				}
			}
			return networks;
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

}
