/*
 * An XML document type.
 * Localname: version
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.VersionDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100;


/**
 * A document containing one version(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public interface VersionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VersionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("version33f0doctype");
    
    /**
     * Gets the "version" element
     */
    it.csi.airquality.aqa.x100.VersionDocument.Version getVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(it.csi.airquality.aqa.x100.VersionDocument.Version version);
    
    /**
     * Appends and returns a new empty "version" element
     */
    it.csi.airquality.aqa.x100.VersionDocument.Version addNewVersion();
    
    /**
     * An XML version(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public interface Version extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Version.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s194FF509A3865218E4327D2F2A41D540").resolveHandle("versionb92celemtype");
        
        /**
         * Gets the "major" element
         */
        long getMajor();
        
        /**
         * Gets (as xml) the "major" element
         */
        org.apache.xmlbeans.XmlUnsignedInt xgetMajor();
        
        /**
         * Sets the "major" element
         */
        void setMajor(long major);
        
        /**
         * Sets (as xml) the "major" element
         */
        void xsetMajor(org.apache.xmlbeans.XmlUnsignedInt major);
        
        /**
         * Gets the "minor" element
         */
        long getMinor();
        
        /**
         * Gets (as xml) the "minor" element
         */
        org.apache.xmlbeans.XmlUnsignedInt xgetMinor();
        
        /**
         * Sets the "minor" element
         */
        void setMinor(long minor);
        
        /**
         * Sets (as xml) the "minor" element
         */
        void xsetMinor(org.apache.xmlbeans.XmlUnsignedInt minor);
        
        /**
         * Gets the "bugfix" element
         */
        long getBugfix();
        
        /**
         * Gets (as xml) the "bugfix" element
         */
        org.apache.xmlbeans.XmlUnsignedInt xgetBugfix();
        
        /**
         * Sets the "bugfix" element
         */
        void setBugfix(long bugfix);
        
        /**
         * Sets (as xml) the "bugfix" element
         */
        void xsetBugfix(org.apache.xmlbeans.XmlUnsignedInt bugfix);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.csi.airquality.aqa.x100.VersionDocument.Version newInstance() {
              return (it.csi.airquality.aqa.x100.VersionDocument.Version) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.csi.airquality.aqa.x100.VersionDocument.Version newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.csi.airquality.aqa.x100.VersionDocument.Version) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.csi.airquality.aqa.x100.VersionDocument newInstance() {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.csi.airquality.aqa.x100.VersionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.VersionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.csi.airquality.aqa.x100.VersionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.csi.airquality.aqa.x100.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
