/*
 * XML Type:  sensorType
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.SensorType
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100;


/**
 * An XML sensorType(@http://airquality.csi.it/aqa/1.0.0).
 *
 * This is a complex type.
 */
public interface SensorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("sensortype6832type");
    
    /**
     * Gets the "startDate" element
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "startDate" element
     */
    org.apache.xmlbeans.XmlDate xgetStartDate();
    
    /**
     * Sets the "startDate" element
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "startDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
    
    /**
     * Gets the "endDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "endDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndDate();
    
    /**
     * True if has "endDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "endDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "endDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
    
    /**
     * Unsets the "endDate" element
     */
    void unsetEndDate();
    
    /**
     * Gets the "acquisitionPeriod" element
     */
    java.math.BigInteger getAcquisitionPeriod();
    
    /**
     * Gets (as xml) the "acquisitionPeriod" element
     */
    org.apache.xmlbeans.XmlInteger xgetAcquisitionPeriod();
    
    /**
     * Sets the "acquisitionPeriod" element
     */
    void setAcquisitionPeriod(java.math.BigInteger acquisitionPeriod);
    
    /**
     * Sets (as xml) the "acquisitionPeriod" element
     */
    void xsetAcquisitionPeriod(org.apache.xmlbeans.XmlInteger acquisitionPeriod);
    
    /**
     * Gets the "nationalId" element
     */
    java.math.BigInteger getNationalId();
    
    /**
     * Gets (as xml) the "nationalId" element
     */
    org.apache.xmlbeans.XmlInteger xgetNationalId();
    
    /**
     * Tests for nil "nationalId" element
     */
    boolean isNilNationalId();
    
    /**
     * Sets the "nationalId" element
     */
    void setNationalId(java.math.BigInteger nationalId);
    
    /**
     * Sets (as xml) the "nationalId" element
     */
    void xsetNationalId(org.apache.xmlbeans.XmlInteger nationalId);
    
    /**
     * Nils the "nationalId" element
     */
    void setNilNationalId();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.csi.airquality.aqa.x100.SensorType newInstance() {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.csi.airquality.aqa.x100.SensorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.SensorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.SensorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.SensorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
