/*
 * An XML document type.
 * Localname: parameterList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.ParameterListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * A document containing one parameterList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public class ParameterListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.ParameterListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERLIST$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "parameterList");
    
    
    /**
     * Gets the "parameterList" element
     */
    public it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList getParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList target = null;
            target = (it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList)get_store().find_element_user(PARAMETERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterList" element
     */
    public void setParameterList(it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList parameterList)
    {
        generatedSetterHelperImpl(parameterList, PARAMETERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameterList" element
     */
    public it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList addNewParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList target = null;
            target = (it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList)get_store().add_element_user(PARAMETERLIST$0);
            return target;
        }
    }
    /**
     * An XML parameterList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public static class ParameterListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.ParameterListDocument.ParameterList
    {
        private static final long serialVersionUID = 1L;
        
        public ParameterListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETER$0 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "parameter");
        
        
        /**
         * Gets array of all "parameter" elements
         */
        public it.csi.airquality.aqa.x100.ParameterType[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                it.csi.airquality.aqa.x100.ParameterType[] result = new it.csi.airquality.aqa.x100.ParameterType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "parameter" element
         */
        public it.csi.airquality.aqa.x100.ParameterType getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.ParameterType target = null;
                target = (it.csi.airquality.aqa.x100.ParameterType)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "parameter" element
         */
        public int sizeOfParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setParameterArray(it.csi.airquality.aqa.x100.ParameterType[] parameterArray)
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
        
        /**
         * Sets ith "parameter" element
         */
        public void setParameterArray(int i, it.csi.airquality.aqa.x100.ParameterType parameter)
        {
            generatedSetterHelperImpl(parameter, PARAMETER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        public it.csi.airquality.aqa.x100.ParameterType insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.ParameterType target = null;
                target = (it.csi.airquality.aqa.x100.ParameterType)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        public it.csi.airquality.aqa.x100.ParameterType addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.ParameterType target = null;
                target = (it.csi.airquality.aqa.x100.ParameterType)get_store().add_element_user(PARAMETER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "parameter" element
         */
        public void removeParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETER$0, i);
            }
        }
    }
}
