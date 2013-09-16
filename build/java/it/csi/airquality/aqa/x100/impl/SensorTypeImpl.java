/*
 * XML Type:  sensorType
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.SensorType
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * An XML sensorType(@http://airquality.csi.it/aqa/1.0.0).
 *
 * This is a complex type.
 */
public class SensorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.SensorType
{
    private static final long serialVersionUID = 1L;
    
    public SensorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$2 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "endDate");
    private static final javax.xml.namespace.QName ACQUISITIONPERIOD$4 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "acquisitionPeriod");
    private static final javax.xml.namespace.QName NATIONALID$6 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "nationalId");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Gets the "endDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "endDate" element
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "endDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$2);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$2);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "endDate" element
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$2, 0);
        }
    }
    
    /**
     * Gets the "acquisitionPeriod" element
     */
    public java.math.BigInteger getAcquisitionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITIONPERIOD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "acquisitionPeriod" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAcquisitionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ACQUISITIONPERIOD$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "acquisitionPeriod" element
     */
    public void setAcquisitionPeriod(java.math.BigInteger acquisitionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITIONPERIOD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACQUISITIONPERIOD$4);
            }
            target.setBigIntegerValue(acquisitionPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "acquisitionPeriod" element
     */
    public void xsetAcquisitionPeriod(org.apache.xmlbeans.XmlInteger acquisitionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ACQUISITIONPERIOD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ACQUISITIONPERIOD$4);
            }
            target.set(acquisitionPeriod);
        }
    }
    
    /**
     * Gets the "nationalId" element
     */
    public java.math.BigInteger getNationalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationalId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNationalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NATIONALID$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nationalId" element
     */
    public boolean isNilNationalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NATIONALID$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nationalId" element
     */
    public void setNationalId(java.math.BigInteger nationalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALID$6);
            }
            target.setBigIntegerValue(nationalId);
        }
    }
    
    /**
     * Sets (as xml) the "nationalId" element
     */
    public void xsetNationalId(org.apache.xmlbeans.XmlInteger nationalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NATIONALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NATIONALID$6);
            }
            target.set(nationalId);
        }
    }
    
    /**
     * Nils the "nationalId" element
     */
    public void setNilNationalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NATIONALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NATIONALID$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
}
