/*
 * An XML document type.
 * Localname: parameterList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.ParameterListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100;


/**
 * A document containing one parameterList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public interface ParameterListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("parameterlistd3c1doctype");
    
    /**
     * Gets the "parameterList" element
     */
    it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList getParameterList();
    
    /**
     * Sets the "parameterList" element
     */
    void setParameterList(it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList parameterList);
    
    /**
     * Appends and returns a new empty "parameterList" element
     */
    it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList addNewParameterList();
    
    /**
     * An XML parameterList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public interface ParameterList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("parameterlist168eelemtype");
        
        /**
         * Gets array of all "parameter" elements
         */
        it.csi.airquality.aqa.x100.ParameterType[] getParameterArray();
        
        /**
         * Gets ith "parameter" element
         */
        it.csi.airquality.aqa.x100.ParameterType getParameterArray(int i);
        
        /**
         * Returns number of "parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "parameter" element
         */
        void setParameterArray(it.csi.airquality.aqa.x100.ParameterType[] parameterArray);
        
        /**
         * Sets ith "parameter" element
         */
        void setParameterArray(int i, it.csi.airquality.aqa.x100.ParameterType parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        it.csi.airquality.aqa.x100.ParameterType insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        it.csi.airquality.aqa.x100.ParameterType addNewParameter();
        
        /**
         * Removes the ith "parameter" element
         */
        void removeParameter(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList newInstance() {
              return (it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.csi.airquality.aqa.x100.ParameterListDocument newInstance() {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.ParameterListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
