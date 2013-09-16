/*
 * An XML document type.
 * Localname: networkList
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.NetworkListDocument
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * A document containing one networkList(@http://airquality.csi.it/aqa/1.0.0) element.
 *
 * This is a complex type.
 */
public class NetworkListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.NetworkListDocument
{
    private static final long serialVersionUID = 1L;
    
    public NetworkListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NETWORKLIST$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "networkList");
    
    
    /**
     * Gets the "networkList" element
     */
    public it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList getNetworkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList target = null;
            target = (it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList)get_store().find_element_user(NETWORKLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "networkList" element
     */
    public void setNetworkList(it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList networkList)
    {
        generatedSetterHelperImpl(networkList, NETWORKLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "networkList" element
     */
    public it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList addNewNetworkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList target = null;
            target = (it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList)get_store().add_element_user(NETWORKLIST$0);
            return target;
        }
    }
    /**
     * An XML networkList(@http://airquality.csi.it/aqa/1.0.0).
     *
     * This is a complex type.
     */
    public static class NetworkListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.NetworkListDocument.NetworkList
    {
        private static final long serialVersionUID = 1L;
        
        public NetworkListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NETWORK$0 = 
            new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "network");
        
        
        /**
         * Gets array of all "network" elements
         */
        public it.csi.airquality.aqa.x100.NetworkType[] getNetworkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NETWORK$0, targetList);
                it.csi.airquality.aqa.x100.NetworkType[] result = new it.csi.airquality.aqa.x100.NetworkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "network" element
         */
        public it.csi.airquality.aqa.x100.NetworkType getNetworkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.NetworkType target = null;
                target = (it.csi.airquality.aqa.x100.NetworkType)get_store().find_element_user(NETWORK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "network" element
         */
        public int sizeOfNetworkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NETWORK$0);
            }
        }
        
        /**
         * Sets array of all "network" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNetworkArray(it.csi.airquality.aqa.x100.NetworkType[] networkArray)
        {
            check_orphaned();
            arraySetterHelper(networkArray, NETWORK$0);
        }
        
        /**
         * Sets ith "network" element
         */
        public void setNetworkArray(int i, it.csi.airquality.aqa.x100.NetworkType network)
        {
            generatedSetterHelperImpl(network, NETWORK$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "network" element
         */
        public it.csi.airquality.aqa.x100.NetworkType insertNewNetwork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.NetworkType target = null;
                target = (it.csi.airquality.aqa.x100.NetworkType)get_store().insert_element_user(NETWORK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "network" element
         */
        public it.csi.airquality.aqa.x100.NetworkType addNewNetwork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.csi.airquality.aqa.x100.NetworkType target = null;
                target = (it.csi.airquality.aqa.x100.NetworkType)get_store().add_element_user(NETWORK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "network" element
         */
        public void removeNetwork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NETWORK$0, i);
            }
        }
    }
}
