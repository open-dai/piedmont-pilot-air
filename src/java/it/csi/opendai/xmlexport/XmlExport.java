// $Id: XmlExport.java,v 1.6 2013/07/26 14:14:36 pfvallosio Exp $

package it.csi.opendai.xmlexport;

import it.csi.aria.dbmanager.engine.DB;
import it.csi.aria.dbmanager.engine.DbConnParams;
import it.csi.aria.dbmanager.engine.DbCreateParams;
import it.csi.aria.dbmanager.engine.DbToolkit;
import it.csi.opendai.xmlexport.functions.BadRequestException;
import it.csi.opendai.xmlexport.functions.Data;
import it.csi.opendai.xmlexport.functions.Function;
import it.csi.opendai.xmlexport.functions.Networks;
import it.csi.opendai.xmlexport.functions.Parameters;
import it.csi.opendai.xmlexport.functions.Sensors;
import it.csi.opendai.xmlexport.functions.Stations;
import it.csi.opendai.xmlexport.functions.UnknownFunctionException;
import it.csi.opendai.xmlexport.functions.Version;
import it.csi.util.config.ParametricConfigItem;
import it.csi.util.conn.DBConnCfgItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet per export XML
 * 
 * @author Pierfrancesco.Vallosio@consulenti.csi.it
 * @version $Revision: 1.6 $
 */
public class XmlExport extends HttpServlet {

	private static final long serialVersionUID = -8356940737188092236L;

	// Configurazione di default
	public static final int APP_VERSION_MAJOR = 1;
	public static final int APP_VERSION_MINOR = 0;
	public static final int APP_VERSION_BUGFIX = 0;
	private static final String CFG_FILE = "opendai/config.txt";
	private static final String POLLUTANT_FILE = "opendai/pollutant.csv";
	public static final String ANAGRAPHIC_SCHEMA_NAMESPACE = "http://airquality.csi.it/aqa/1.0.0";
	public static final int PROGR_PUNTO_COM_WAREHOUSE = 880;
	public static final String LOGGER_BASENAME = "opendaiexport.";

	private static Logger lg = Logger.getLogger(LOGGER_BASENAME
			+ XmlExport.class.getSimpleName());

	private List<Function> functions = new ArrayList<Function>();

	public XmlExport() {
		PropertyConfigurator.configure(getClass().getResource(
				"/log4j.properties"));
	}

	@Override
	public void init() throws ServletException {
		// Lettura parametri di inizializzazione
		ServletContext sc = getServletContext();
		String cfgFileName = sc.getInitParameter("cfgFile");
		if (cfgFileName == null || cfgFileName.isEmpty())
			cfgFileName = CFG_FILE;
		String pollutantFileName = sc.getInitParameter("pollutantFile");
		if (pollutantFileName == null || pollutantFileName.isEmpty())
			pollutantFileName = POLLUTANT_FILE;
		// Lettura configurazione di accesso al DB
		try {
			ParametricConfigItem[] configItems = readConfigFile(cfgFileName);
			DbCreateParams dbcp = initDbConfig((DBConnCfgItem) configItems[0]);
			ExportCfgItem cfg = (ExportCfgItem) configItems[1];
			Map<Integer, Pollutant> mapPollutants = readPollutantFile(pollutantFileName);
			functions.add(new Version("/version", false, cfg));
			functions.add(new Networks("/networks", false, dbcp, cfg));
			functions.add(new Stations("/stations", false, dbcp, cfg));
			functions.add(new Stations("/networks", true, dbcp, cfg));
			functions.add(new Parameters("/parameters", false, dbcp, cfg));
			functions.add(new Sensors("/stations", true, dbcp, cfg));
			functions.add(new Data("/data", false, dbcp, cfg, mapPollutants));
		} catch (Exception ex) {
			lg.error(ex);
			throw new ServletException(ex);
		}
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			for (Function f : functions)
				if (f.manage(request, response))
					return;
			throw new UnknownFunctionException("Unknown function call: '"
					+ request.getServletPath() + "'");
		} catch (BadRequestException e) {
			sendBadRequestMessage(response, e);
		} catch (Exception e) {
			sendErrorMessage(response, e);
		}
	}

	private void sendBadRequestMessage(HttpServletResponse response,
			BadRequestException ex) throws IOException {
		lg.warn("Request error", ex);
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("{\"developerMessage\": \"" + dumpThrowable(ex) + "\", " //
				+ "\"userMessage\": \"" + ex.getMessage() + "\", " //
				+ "\"errorCode\": " + ex.getCode() + "}");
		pw.close();
	}

	private void sendErrorMessage(HttpServletResponse response, Exception ex)
			throws IOException {
		lg.error("Application error", ex);
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("{\"developerMessage\": \"" + dumpThrowable(ex) + "\", " //
				+ "\"userMessage\": " //
				+ "\"An error occurred during API execution.\", " //
				+ "\"errorCode\": " + 100 + "}");
		pw.close();
	}

	private String dumpThrowable(Throwable throwable) {
		StringBuilder str = new StringBuilder();
		Throwable cause = throwable;
		while (cause != null) {
			StackTraceElement[] ste = cause.getStackTrace();
			str.append(cause.getLocalizedMessage());
			if (ste.length > 0)
				str.append(" at " + ste[0]);
			cause = cause.getCause();
			if (cause != null)
				str.append(" Caused by: ");
		}
		return str.toString();
	}

	private ParametricConfigItem[] readConfigFile(String configFile)
			throws Exception {
		lg.info("Reading application configuration from file: " + configFile);
		ParametricConfigItem[] cfgItems = new ParametricConfigItem[2];
		Reader configFileReader = new LineNumberReader(new FileReader(
				configFile));
		cfgItems[0] = new DBConnCfgItem();
		cfgItems[0].initFromCharStream(configFileReader);
		cfgItems[1] = new ExportCfgItem();
		cfgItems[1].initFromCharStream(configFileReader);
		configFileReader.close();
		return cfgItems;
	}

	private DbCreateParams initDbConfig(DBConnCfgItem item) throws Exception {
		String id = (String) item.getValue(DBConnCfgItem.nome_simbolico);
		String dbName = (String) item.getValue(DBConnCfgItem.descrizione);
		int dataBankType = item.getDataBankType();
		Boolean readForSensor = (Boolean) item
				.getValue(DBConnCfgItem.lettura_per_sensore);
		Boolean cropToZero = (Boolean) item
				.getValue(DBConnCfgItem.negativi_a_zero);
		DbConnParams connParams = item.getDbConnParams();
		String data_source_name = (String) item
				.getValue(DBConnCfgItem.data_source_name);
		DbCreateParams dcp;
		if (data_source_name.equals("")) {
			lg.info("Data base " + dbName + ": direct connection");
			dcp = new DbCreateParams(dbName, id, connParams, dataBankType,
					false, true, true, !readForSensor.booleanValue(),
					cropToZero.booleanValue());
			// Registrazione driver JDBC
			if (dcp.engine == DbToolkit.DB_POSTGRES) {
				lg.info("Registering Postgres JDBC driver");
				DbToolkit.getDbToolkit().registerJDBCDriver(
						DbToolkit.DB_POSTGRES);
			} else if (dcp.engine == DbToolkit.DB_ORACLE) {
				lg.info("Registering Oracle JDBC driver");
				DbToolkit.getDbToolkit()
						.registerJDBCDriver(DbToolkit.DB_ORACLE);
			}
		} else {
			lg.info("Data base " + dbName + ": connection using "
					+ "data source " + data_source_name);
			DataSource ds = (DataSource) new InitialContext()
					.lookup("java:comp/env/" + data_source_name);
			dcp = new DbCreateParams(dbName, id, data_source_name, ds,
					dataBankType, -1, false, true, true, !readForSensor
							.booleanValue(), cropToZero.booleanValue());
		}
		// Istanziazione oggetto DB solo per validare i parametri di ingresso
		new DB(dcp);
		return dcp;
	}

	private Map<Integer, Pollutant> readPollutantFile(String fileName)
			throws Exception {
		Map<Integer, Pollutant> map = new HashMap<Integer, Pollutant>();
		lg.info("Reading pollutant definitions...");
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty())
				continue;
			if (line.length() >= 2 && line.charAt(0) == '"'
					&& line.charAt(line.length() - 1) == '"') {
				String lineCleaned = line.substring(1, line.length() - 1);
				String[] fields = lineCleaned.split("\" *, *\"");
				if (fields.length == 4) {
					try {
						Pollutant p = new Pollutant(new Integer(fields[3]
								.trim()), fields[2].trim(), fields[1].trim(),
								fields[0].trim());
						map.put(p.getId(), p);
					} catch (NumberFormatException e) {
						lg.warn("Unparsable pollutant: " + line);
					}
				} else {
					lg.warn("Unparsable pollutant: " + line);
				}
			} else {
				lg.warn("Unparsable pollutant: " + line);
			}
		}
		lg.info(map.size() + " pollutant definitions successfully read");
		return map;
	}

}
