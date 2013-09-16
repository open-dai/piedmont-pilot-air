/*
 * An XML document type.
 * Localname: sensorList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.SensorListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * A document containing one sensorList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public class SensorListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.SensorListDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSORLIST$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "sensorList");
    
    
    /**
     * Gets the "sensorList" element
     */
    public it.csi.airquality.aqa.x100.SensorListDocument.SensorList getSensorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.SensorListDocument.SensorList target = null;
            target = (it.csi.airquality.aqa.x100.SensorListDocument.SensorList)get_store().find_element_user(SENSORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sensorList" element
     */
    public void setSensorList(it.csi.airquality.aqa.x100.SensorListDocument.SensorList sensorList)
    {
        generatedSetterHelperImpl(sensorList, SENSORLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sensorList" element
     */
    public it.csi.airquality.aqa.x100.SensorListDocument.SensorList addNewSensorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.SensorListDocument.SensorList target = null;
            target = (it.csi.airquality.aqa.x100.SensorListDocument.SensorList)get_store().add_element_user(SENSORLIST$0);
            return target;
        }
    }
    /**
     * An XML sensorList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public static class SensorListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.SensorListDocument.SensorList
    {
        private static final long serialVersionUID = 1L;
        
        public SensorListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENSOR$0 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "sensor");
        
        
        /**
         * Gets array of all "sensor" elements
         */
        public it.csi.airquality.aqa.x100.SensorType[] getSensorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SENSOR$0, targetList);
                it.csi.airquality.aqa.x100.SensorType[] result = new it.csi.airquality.aqa.x100.SensorType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sensor" element
         */
        public it.csi.airquality.aqa.x100.SensorType getSensorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.SensorType target = null;
                target = (it.csi.airquality.aqa.x100.SensorType)get_store().find_element_user(SENSOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sensor" element
         */
        public int sizeOfSensorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENSOR$0);
            }
        }
        
        /**
         * Sets array of all "sensor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSensorArray(it.csi.airquality.aqa.x100.SensorType[] sensorArray)
        {
            check_orphaned();
            arraySetterHelper(sensorArray, SENSOR$0);
        }
        
        /**
         * Sets ith "sensor" element
         */
        public void setSensorArray(int i, it.csi.airquality.aqa.x100.SensorType sensor)
        {
            generatedSetterHelperImpl(sensor, SENSOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sensor" element
         */
        public it.csi.airquality.aqa.x100.SensorType insertNewSensor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.SensorType target = null;
                target = (it.csi.airquality.aqa.x100.SensorType)get_store().insert_element_user(SENSOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sensor" element
         */
        public it.csi.airquality.aqa.x100.SensorType addNewSensor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.SensorType target = null;
                target = (it.csi.airquality.aqa.x100.SensorType)get_store().add_element_user(SENSOR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "sensor" element
         */
        public void removeSensor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENSOR$0, i);
            }
        }
    }
}
