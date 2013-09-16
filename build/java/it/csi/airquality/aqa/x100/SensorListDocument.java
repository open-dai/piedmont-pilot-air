/*
 * An XML document type.
 * Localname: sensorList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.SensorListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100;


/**
 * A document containing one sensorList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public interface SensorListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("sensorlist483edoctype");
    
    /**
     * Gets the "sensorList" element
     */
    it.csi.airquality.aqa.x100.SensorListDocument.SensorList getSensorList();
    
    /**
     * Sets the "sensorList" element
     */
    void setSensorList(it.csi.airquality.aqa.x100.SensorListDocument.SensorList sensorList);
    
    /**
     * Appends and returns a new empty "sensorList" element
     */
    it.csi.airquality.aqa.x100.SensorListDocument.SensorList addNewSensorList();
    
    /**
     * An XML sensorList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public interface SensorList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("sensorlist8652elemtype");
        
        /**
         * Gets array of all "sensor" elements
         */
        it.csi.airquality.aqa.x100.SensorType[] getSensorArray();
        
        /**
         * Gets ith "sensor" element
         */
        it.csi.airquality.aqa.x100.SensorType getSensorArray(int i);
        
        /**
         * Returns number of "sensor" element
         */
        int sizeOfSensorArray();
        
        /**
         * Sets array of all "sensor" element
         */
        void setSensorArray(it.csi.airquality.aqa.x100.SensorType[] sensorArray);
        
        /**
         * Sets ith "sensor" element
         */
        void setSensorArray(int i, it.csi.airquality.aqa.x100.SensorType sensor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sensor" element
         */
        it.csi.airquality.aqa.x100.SensorType insertNewSensor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sensor" element
         */
        it.csi.airquality.aqa.x100.SensorType addNewSensor();
        
        /**
         * Removes the ith "sensor" element
         */
        void removeSensor(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.csi.airquality.aqa.x100.SensorListDocument.SensorList newInstance() {
              return (it.csi.airquality.aqa.x100.SensorListDocument.SensorList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.csi.airquality.aqa.x100.SensorListDocument.SensorList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.csi.airquality.aqa.x100.SensorListDocument.SensorList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.csi.airquality.aqa.x100.SensorListDocument newInstance() {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.SensorListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.SensorListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
