// $Id: Function.java,v 1.5 2013/07/26 14:14:36 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.opendai.xmlexport.XmlExport;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

public abstract class Function {

	private static Logger lg = Logger.getLogger(XmlExport.LOGGER_BASENAME
			+ Function.class.getSimpleName());

	private static final String DATE_FMT_STR = "yyyyMMdd";

	private String functionName;

	private boolean useChildId;

	private XmlOptions xmlOptions;

	public Function(String functionName) {
		this(functionName, false);
	}

	public Function(String functionName, boolean useChildId) {
		if (functionName == null)
			throw new IllegalArgumentException(
					"Function name should not be null");
		this.functionName = functionName + (useChildId ? "/" : "");
		this.useChildId = useChildId;
		xmlOptions = makeOptions();
	}

	public boolean manage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String servletPath = request.getServletPath();
		if (servletPath == null || servletPath.isEmpty())
			throw new UnknownFunctionException("Function call is missing");
		String childId;
		if (useChildId) {
			if (!servletPath.startsWith(functionName))
				return false;
			String strFunction = servletPath.substring(functionName.length());
			String prefix = "{";
			if (!strFunction.startsWith(prefix))
				throw new FunctionSyntaxException(
						"Wrong prefix for Id in function " + functionName
								+ ": " + servletPath);
			strFunction = strFunction.substring(prefix.length());
			String suffix = "}";
			if (!strFunction.endsWith(suffix))
				throw new FunctionSyntaxException(
						"Wrong suffix for Id in function " + functionName
								+ ": " + servletPath);
			childId = strFunction.substring(0, strFunction.length()
					- suffix.length());
		} else {
			if (!servletPath.equals(functionName))
				return false;
			childId = null;
		}
		lg.info("Function called '" + servletPath + "' with parameters '"
				+ request.getQueryString() + "'");
		@SuppressWarnings("unchecked")
		Map<String, String[]> mapParams = request.getParameterMap();
		XmlObject xmlObj = makeXmlDocument(childId, mapParams);
		List<Object> validationErrors = new ArrayList<Object>();
		XmlOptions validationOptions = new XmlOptions();
		validationOptions.setErrorListener(validationErrors);
		boolean valid = xmlObj.validate(validationOptions);
		if (valid) {
			lg.debug("Document " + xmlObj.getClass().getSimpleName()
					+ " is valid");
		} else {
			StringBuffer msg = new StringBuffer();
			String nl = System.getProperty("line.separator");
			msg.append("Document " + xmlObj.getClass().getSimpleName()
					+ " is not valid");
			for (Object o : validationErrors)
				msg.append(nl).append(o.toString());
			lg.warn(msg);
		}
		response.setContentType("text/xml");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		xmlObj.save(pw, xmlOptions);
		pw.close();
		return true;
	}

	protected abstract XmlObject makeXmlDocument(String childId,
			Map<String, String[]> mapParams) throws Exception;

	protected String getMapString(Map<String, String[]> map, String key) {
		String[] values = map.get(key);
		if (values == null || values.length == 0)
			return null;
		return values[0];
	}

	protected String[] getMapStringArray(Map<String, String[]> map, String key) {
		String[] values = map.get(key);
		if (values == null || values.length == 0)
			return null;
		return values;
	}

	protected Integer getMapInteger(Map<String, String[]> map, String key)
			throws BadParameterException {
		try {
			String strValue = getMapString(map, key);
			return (strValue == null || strValue.isEmpty() ? null
					: new Integer(strValue));
		} catch (NumberFormatException ex) {
			throw new BadParameterException("Parameter " + key
					+ " cannot be parsed as integer", ex);
		}
	}

	protected Date getMapDate(Map<String, String[]> map, String key)
			throws BadParameterException {
		try {
			String strValue = getMapString(map, key);
			return (strValue == null || strValue.isEmpty() ? null
					: new SimpleDateFormat(DATE_FMT_STR).parse(strValue));
		} catch (ParseException ex) {
			throw new BadParameterException("Parameter " + key
					+ " cannot be parsed as date", ex);
		}
	}

	protected String toString(Object object) {
		if (object == null)
			return null;
		return object.toString();
	}

	protected BigDecimal toBigDecimal(String value)
			throws NumberFormatException {
		if (value == null)
			return null;
		value = value.trim();
		if (value.isEmpty())
			return null;
		return new BigDecimal(value);
	}

	protected BigDecimal toBigDecimal(Double value) {
		if (value == null)
			return null;
		return new BigDecimal(value.toString());
	}

	protected BigInteger toBigInteger(String value)
			throws NumberFormatException {
		if (value == null)
			return null;
		value = value.trim();
		if (value.isEmpty())
			return null;
		return new BigInteger(value);
	}

	protected BigInteger toBigInteger(Integer value) {
		if (value == null)
			return null;
		return new BigInteger(value.toString());
	}

	protected Calendar toCalendar(Date date) {
		if (date == null)
			return null;
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+1:00"));
		cal.setTime(date);
		return cal;
	}

	protected String formatDate(Date date) {
		if (date == null)
			return "";
		return new SimpleDateFormat(DATE_FMT_STR).format(date);
	}

	private XmlOptions makeOptions() {
		XmlOptions opt = new XmlOptions();
		opt.setSavePrettyPrint();
		opt.setSaveAggressiveNamespaces();
		opt.setSaveSuggestedPrefixes(getSuggestedPrefixes());
		opt.setLoadLineNumbers();
		// opt.setSaveNamespacesFirst();
		// opt.setUseDefaultNamespace();
		return opt;
	}

	protected Map<String, String> getSuggestedPrefixes() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("http://www.w3.org/1999/xlink", "xlink");
		map.put("http://www.w3.org/2001/XMLSchema", "xs");
		map.put("http://airquality.csi.it/aqa/0.1.0", "aqa");
		return map;
	}

	protected void addSchemaLocation(XmlObject xmlObject, String schemaLocation) {
		XmlCursor cursor = xmlObject.newCursor();
		cursor.setAttributeText(new QName(
				"http://www.w3.org/2001/XMLSchema-instance", "schemaLocation"),
				schemaLocation);
	}

}
