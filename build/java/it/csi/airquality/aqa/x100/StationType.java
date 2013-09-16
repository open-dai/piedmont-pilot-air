/*
 * XML Type:  stationType
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.StationType
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100;


/**
 * An XML stationType(@http://airquality.csi.it/aqa/1.0.0).
 *
 * This is a complex type.
 */
public interface StationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("stationtyped3eatype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Gets the "latitude" element
     */
    java.math.BigDecimal getLatitude();
    
    /**
     * Gets (as xml) the "latitude" element
     */
    org.apache.xmlbeans.XmlDecimal xgetLatitude();
    
    /**
     * Tests for nil "latitude" element
     */
    boolean isNilLatitude();
    
    /**
     * Sets the "latitude" element
     */
    void setLatitude(java.math.BigDecimal latitude);
    
    /**
     * Sets (as xml) the "latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude);
    
    /**
     * Nils the "latitude" element
     */
    void setNilLatitude();
    
    /**
     * Gets the "longitude" element
     */
    java.math.BigDecimal getLongitude();
    
    /**
     * Gets (as xml) the "longitude" element
     */
    org.apache.xmlbeans.XmlDecimal xgetLongitude();
    
    /**
     * Tests for nil "longitude" element
     */
    boolean isNilLongitude();
    
    /**
     * Sets the "longitude" element
     */
    void setLongitude(java.math.BigDecimal longitude);
    
    /**
     * Sets (as xml) the "longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude);
    
    /**
     * Nils the "longitude" element
     */
    void setNilLongitude();
    
    /**
     * Gets the "altitude" element
     */
    java.math.BigDecimal getAltitude();
    
    /**
     * Gets (as xml) the "altitude" element
     */
    org.apache.xmlbeans.XmlDecimal xgetAltitude();
    
    /**
     * Tests for nil "altitude" element
     */
    boolean isNilAltitude();
    
    /**
     * Sets the "altitude" element
     */
    void setAltitude(java.math.BigDecimal altitude);
    
    /**
     * Sets (as xml) the "altitude" element
     */
    void xsetAltitude(org.apache.xmlbeans.XmlDecimal altitude);
    
    /**
     * Nils the "altitude" element
     */
    void setNilAltitude();
    
    /**
     * Gets the "mobile" element
     */
    boolean getMobile();
    
    /**
     * Gets (as xml) the "mobile" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMobile();
    
    /**
     * Sets the "mobile" element
     */
    void setMobile(boolean mobile);
    
    /**
     * Sets (as xml) the "mobile" element
     */
    void xsetMobile(org.apache.xmlbeans.XmlBoolean mobile);
    
    /**
     * Gets the "type" element
     */
    java.math.BigInteger getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlInteger xgetType();
    
    /**
     * Tests for nil "type" element
     */
    boolean isNilType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.math.BigInteger type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlInteger type);
    
    /**
     * Nils the "type" element
     */
    void setNilType();
    
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
     * Gets the "networkId" element
     */
    java.lang.String getNetworkId();
    
    /**
     * Gets (as xml) the "networkId" element
     */
    org.apache.xmlbeans.XmlString xgetNetworkId();
    
    /**
     * Sets the "networkId" element
     */
    void setNetworkId(java.lang.String networkId);
    
    /**
     * Sets (as xml) the "networkId" element
     */
    void xsetNetworkId(org.apache.xmlbeans.XmlString networkId);
    
    /**
     * Gets the "zoneType" element
     */
    java.lang.String getZoneType();
    
    /**
     * Gets (as xml) the "zoneType" element
     */
    org.apache.xmlbeans.XmlString xgetZoneType();
    
    /**
     * Tests for nil "zoneType" element
     */
    boolean isNilZoneType();
    
    /**
     * Sets the "zoneType" element
     */
    void setZoneType(java.lang.String zoneType);
    
    /**
     * Sets (as xml) the "zoneType" element
     */
    void xsetZoneType(org.apache.xmlbeans.XmlString zoneType);
    
    /**
     * Nils the "zoneType" element
     */
    void setNilZoneType();
    
    /**
     * Gets the "zoneInfo" element
     */
    java.math.BigInteger getZoneInfo();
    
    /**
     * Gets (as xml) the "zoneInfo" element
     */
    org.apache.xmlbeans.XmlInteger xgetZoneInfo();
    
    /**
     * Tests for nil "zoneInfo" element
     */
    boolean isNilZoneInfo();
    
    /**
     * Sets the "zoneInfo" element
     */
    void setZoneInfo(java.math.BigInteger zoneInfo);
    
    /**
     * Sets (as xml) the "zoneInfo" element
     */
    void xsetZoneInfo(org.apache.xmlbeans.XmlInteger zoneInfo);
    
    /**
     * Nils the "zoneInfo" element
     */
    void setNilZoneInfo();
    
    /**
     * Gets the "nationalRelevance" element
     */
    boolean getNationalRelevance();
    
    /**
     * Gets (as xml) the "nationalRelevance" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNationalRelevance();
    
    /**
     * Sets the "nationalRelevance" element
     */
    void setNationalRelevance(boolean nationalRelevance);
    
    /**
     * Sets (as xml) the "nationalRelevance" element
     */
    void xsetNationalRelevance(org.apache.xmlbeans.XmlBoolean nationalRelevance);
    
    /**
     * Gets the "nationalName" element
     */
    java.lang.String getNationalName();
    
    /**
     * Gets (as xml) the "nationalName" element
     */
    org.apache.xmlbeans.XmlString xgetNationalName();
    
    /**
     * Tests for nil "nationalName" element
     */
    boolean isNilNationalName();
    
    /**
     * Sets the "nationalName" element
     */
    void setNationalName(java.lang.String nationalName);
    
    /**
     * Sets (as xml) the "nationalName" element
     */
    void xsetNationalName(org.apache.xmlbeans.XmlString nationalName);
    
    /**
     * Nils the "nationalName" element
     */
    void setNilNationalName();
    
    /**
     * Gets the "UEZone" element
     */
    java.lang.String getUEZone();
    
    /**
     * Gets (as xml) the "UEZone" element
     */
    org.apache.xmlbeans.XmlString xgetUEZone();
    
    /**
     * Tests for nil "UEZone" element
     */
    boolean isNilUEZone();
    
    /**
     * Sets the "UEZone" element
     */
    void setUEZone(java.lang.String ueZone);
    
    /**
     * Sets (as xml) the "UEZone" element
     */
    void xsetUEZone(org.apache.xmlbeans.XmlString ueZone);
    
    /**
     * Nils the "UEZone" element
     */
    void setNilUEZone();
    
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
        public static it.csi.airquality.aqa.x100.StationType newInstance() {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.csi.airquality.aqa.x100.StationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.csi.airquality.aqa.x100.StationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.StationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.StationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.StationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
