/*
 * An XML document type.
 * Localname: version
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.VersionDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * A document containing one version(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public class VersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.VersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public VersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "version");
    
    
    /**
     * Gets the "version" element
     */
    public it.csi.airquality.aqa.x100.VersionDocument.Version getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.VersionDocument.Version target = null;
            target = (it.csi.airquality.aqa.x100.VersionDocument.Version)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(it.csi.airquality.aqa.x100.VersionDocument.Version version)
    {
        generatedSetterHelperImpl(version, VERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public it.csi.airquality.aqa.x100.VersionDocument.Version addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.VersionDocument.Version target = null;
            target = (it.csi.airquality.aqa.x100.VersionDocument.Version)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
    /**
     * An XML version(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public static class VersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.VersionDocument.Version
    {
        private static final long serialVersionUID = 1L;
        
        public VersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAJOR$0 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "major");
        private static final javax.xml.namespace.QName MINOR$2 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "minor");
        private static final javax.xml.namespace.QName BUGFIX$4 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "bugfix");
        
        
        /**
         * Gets the "major" element
         */
        public long getMajor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAJOR$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "major" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetMajor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(MAJOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "major" element
         */
        public void setMajor(long major)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAJOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAJOR$0);
                }
                target.setLongValue(major);
            }
        }
        
        /**
         * Sets (as xml) the "major" element
         */
        public void xsetMajor(org.apache.xmlbeans.XmlUnsignedInt major)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(MAJOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(MAJOR$0);
                }
                target.set(major);
            }
        }
        
        /**
         * Gets the "minor" element
         */
        public long getMinor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINOR$2, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "minor" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetMinor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(MINOR$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "minor" element
         */
        public void setMinor(long minor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINOR$2);
                }
                target.setLongValue(minor);
            }
        }
        
        /**
         * Sets (as xml) the "minor" element
         */
        public void xsetMinor(org.apache.xmlbeans.XmlUnsignedInt minor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(MINOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(MINOR$2);
                }
                target.set(minor);
            }
        }
        
        /**
         * Gets the "bugfix" element
         */
        public long getBugfix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUGFIX$4, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "bugfix" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetBugfix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(BUGFIX$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bugfix" element
         */
        public void setBugfix(long bugfix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUGFIX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUGFIX$4);
                }
                target.setLongValue(bugfix);
            }
        }
        
        /**
         * Sets (as xml) the "bugfix" element
         */
        public void xsetBugfix(org.apache.xmlbeans.XmlUnsignedInt bugfix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(BUGFIX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(BUGFIX$4);
                }
                target.set(bugfix);
            }
        }
    }
}
