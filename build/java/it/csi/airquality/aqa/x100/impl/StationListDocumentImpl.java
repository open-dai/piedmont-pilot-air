/*
 * An XML document type.
 * Localname: stationList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.StationListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * A document containing one stationList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public class StationListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.StationListDocument
{
    private static final long serialVersionUID = 1L;
    
    public StationListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATIONLIST$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "stationList");
    
    
    /**
     * Gets the "stationList" element
     */
    public it.csi.airquality.aqa.x100.StationListDocument.StationList getStationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.StationListDocument.StationList target = null;
            target = (it.csi.airquality.aqa.x100.StationListDocument.StationList)get_store().find_element_user(STATIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stationList" element
     */
    public void setStationList(it.csi.airquality.aqa.x100.StationListDocument.StationList stationList)
    {
        generatedSetterHelperImpl(stationList, STATIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "stationList" element
     */
    public it.csi.airquality.aqa.x100.StationListDocument.StationList addNewStationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.StationListDocument.StationList target = null;
            target = (it.csi.airquality.aqa.x100.StationListDocument.StationList)get_store().add_element_user(STATIONLIST$0);
            return target;
        }
    }
    /**
     * An XML stationList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public static class StationListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.StationListDocument.StationList
    {
        private static final long serialVersionUID = 1L;
        
        public StationListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATION$0 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "station");
        
        
        /**
         * Gets array of all "station" elements
         */
        public it.csi.airquality.aqa.x100.StationType[] getStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATION$0, targetList);
                it.csi.airquality.aqa.x100.StationType[] result = new it.csi.airquality.aqa.x100.StationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "station" element
         */
        public it.csi.airquality.aqa.x100.StationType getStationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.StationType target = null;
                target = (it.csi.airquality.aqa.x100.StationType)get_store().find_element_user(STATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "station" element
         */
        public int sizeOfStationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATION$0);
            }
        }
        
        /**
         * Sets array of all "station" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStationArray(it.csi.airquality.aqa.x100.StationType[] stationArray)
        {
            check_orphaned();
            arraySetterHelper(stationArray, STATION$0);
        }
        
        /**
         * Sets ith "station" element
         */
        public void setStationArray(int i, it.csi.airquality.aqa.x100.StationType station)
        {
            generatedSetterHelperImpl(station, STATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "station" element
         */
        public it.csi.airquality.aqa.x100.StationType insertNewStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.StationType target = null;
                target = (it.csi.airquality.aqa.x100.StationType)get_store().insert_element_user(STATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "station" element
         */
        public it.csi.airquality.aqa.x100.StationType addNewStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.StationType target = null;
                target = (it.csi.airquality.aqa.x100.StationType)get_store().add_element_user(STATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "station" element
         */
        public void removeStation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATION$0, i);
            }
        }
    }
}
