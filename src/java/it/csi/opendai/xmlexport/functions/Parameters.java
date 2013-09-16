// $Id: Parameters.java,v 1.5 2013/07/26 13:26:06 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.airquality.aqa.x100.ParameterListDocument;
import it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList;
import it.csi.airquality.aqa.x100.ParameterType;
import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.MeasureUnit;
import it.csi.aria.dbmanager.engine.ParameterRecord;
import it.csi.opendai.xmlexport.ExportCfgItem;
import it.csi.opendai.xmlexport.XmlExport;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;

public class Parameters extends Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Parameters.class.getSimpleName());

	private DbCreateParams dbConfig;
	private ExportCfgItem expConfig;

	public Parameters(String servletPath, boolean useChildId,
			DbCreateParams dbConfig, ExportCfgItem expConfig) {
		super(servletPath, useChildId);
		this.dbConfig = dbConfig;
		this.expConfig = expConfig;
	}

	@Override
	protected XmlObject makeXmlDocument(String childId,
			Map<String, String[]> mapParams) throws ServletException {
		ParameterListDocument doc = ParameterListDocument.Factory.newInstance();
		ParameterList parameterList = doc.addNewParameterList();
		addSchemaLocation(parameterList, XmlExport.ANAGRAPHIC_SCHEMA_NAMESPACE
				+ " " + expConfig.getAnagraphicSchemaUri());
		List<ParameterRecord> listParameters = readParameters();
		for (ParameterRecord parameter : listParameters) {
			ParameterType parameterType = parameterList.addNewParameter();
			fillParameterType(parameterType, parameter);
		}
		return doc;
	}

	private void fillParameterType(ParameterType pt, ParameterRecord p) {
		pt.setId(p.id_parametro);
		pt.setName(p.denominazione);
		pt.setType(p.tipologia);
		pt.setMeasureUnit(p.id_unita_misura);
	}

	private List<ParameterRecord> readParameters() throws ServletException {
		lg.debug("Reading parameter list... ");
		DB db = null;
		try {
			boolean chemical = expConfig.getChemicalSensors();
			boolean meteo = expConfig.getMeteoSensors();
			boolean aux = expConfig.getAuxSensors();
			db = new DB(dbConfig);
			db.setLocale("en");
			db.setLogger(new it.csi.util.logger.Logger(lg));
			db.connect();
			@SuppressWarnings("unchecked")
			List<ParameterRecord> parameters = db.getDbReader()
					.readParameterList();
			@SuppressWarnings("unchecked")
			List<MeasureUnit> measureUnits = db.getDbReader()
					.readMeasureUnitList();
			Map<String, String> mapMeasureUnits = new HashMap<String, String>();
			for (MeasureUnit mu : measureUnits)
				mapMeasureUnits.put(mu.id_unita_misura, mu.simbolo);
			Iterator<ParameterRecord> itPa = parameters.iterator();
			while (itPa.hasNext()) {
				ParameterRecord p = itPa.next();
				if (("C".equals(p.tipologia) && !chemical)
						|| ("M".equals(p.tipologia) && !meteo)
						|| ("A".equals(p.tipologia) && !aux)) {
					itPa.remove();
				} else {
					p.id_unita_misura = mapMeasureUnits.get(p.id_unita_misura);
				}
			}
			return parameters;
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
