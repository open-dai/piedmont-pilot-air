/*
 * XML Type:  stationType
 * Namespace: http://airquality.csi.it/aqa/1.0.0
 * Java type: it.csi.airquality.aqa.x100.StationType
 *
 * Automatically generated - do not modify.
 */
package it.csi.airquality.aqa.x100.impl;
/**
 * An XML stationType(@http://airquality.csi.it/aqa/1.0.0).
 *
 * This is a complex type.
 */
public class StationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.csi.airquality.aqa.x100.StationType
{
    private static final long serialVersionUID = 1L;
    
    public StationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "name");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "address");
    private static final javax.xml.namespace.QName LATITUDE$4 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "latitude");
    private static final javax.xml.namespace.QName LONGITUDE$6 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "longitude");
    private static final javax.xml.namespace.QName ALTITUDE$8 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "altitude");
    private static final javax.xml.namespace.QName MOBILE$10 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "mobile");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "type");
    private static final javax.xml.namespace.QName STARTDATE$14 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$16 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "endDate");
    private static final javax.xml.namespace.QName NETWORKID$18 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "networkId");
    private static final javax.xml.namespace.QName ZONETYPE$20 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "zoneType");
    private static final javax.xml.namespace.QName ZONEINFO$22 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "zoneInfo");
    private static final javax.xml.namespace.QName NATIONALRELEVANCE$24 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "nationalRelevance");
    private static final javax.xml.namespace.QName NATIONALNAME$26 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "nationalName");
    private static final javax.xml.namespace.QName UEZONE$28 = 
        new javax.xml.namespace.QName("http://airquality.csi.it/aqa/1.0.0", "UEZone");
    private static final javax.xml.namespace.QName ID$30 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Gets the "latitude" element
     */
    public java.math.BigDecimal getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "latitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "latitude" element
     */
    public boolean isNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "latitude" element
     */
    public void setLatitude(java.math.BigDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$4);
            }
            target.setBigDecimalValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$4);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Nils the "latitude" element
     */
    public void setNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "longitude" element
     */
    public java.math.BigDecimal getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "longitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "longitude" element
     */
    public boolean isNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "longitude" element
     */
    public void setLongitude(java.math.BigDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
            }
            target.setBigDecimalValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$6);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Nils the "longitude" element
     */
    public void setNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "altitude" element
     */
    public java.math.BigDecimal getAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "altitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ALTITUDE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "altitude" element
     */
    public boolean isNilAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ALTITUDE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "altitude" element
     */
    public void setAltitude(java.math.BigDecimal altitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTITUDE$8);
            }
            target.setBigDecimalValue(altitude);
        }
    }
    
    /**
     * Sets (as xml) the "altitude" element
     */
    public void xsetAltitude(org.apache.xmlbeans.XmlDecimal altitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ALTITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ALTITUDE$8);
            }
            target.set(altitude);
        }
    }
    
    /**
     * Nils the "altitude" element
     */
    public void setNilAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ALTITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ALTITUDE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "mobile" element
     */
    public boolean getMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mobile" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MOBILE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mobile" element
     */
    public void setMobile(boolean mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$10);
            }
            target.setBooleanValue(mobile);
        }
    }
    
    /**
     * Sets (as xml) the "mobile" element
     */
    public void xsetMobile(org.apache.xmlbeans.XmlBoolean mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MOBILE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MOBILE$10);
            }
            target.set(mobile);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.math.BigInteger getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlInteger xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "type" element
     */
    public boolean isNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.math.BigInteger type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$12);
            }
            target.setBigIntegerValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlInteger type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TYPE$12);
            }
            target.set(type);
        }
    }
    
    /**
     * Nils the "type" element
     */
    public void setNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TYPE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$14, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$14);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$16, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$16, 0);
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
            return get_store().count_elements(ENDDATE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$16);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$16);
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
            get_store().remove_element(ENDDATE$16, 0);
        }
    }
    
    /**
     * Gets the "networkId" element
     */
    public java.lang.String getNetworkId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETWORKID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "networkId" element
     */
    public org.apache.xmlbeans.XmlString xgetNetworkId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETWORKID$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "networkId" element
     */
    public void setNetworkId(java.lang.String networkId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETWORKID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETWORKID$18);
            }
            target.setStringValue(networkId);
        }
    }
    
    /**
     * Sets (as xml) the "networkId" element
     */
    public void xsetNetworkId(org.apache.xmlbeans.XmlString networkId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETWORKID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NETWORKID$18);
            }
            target.set(networkId);
        }
    }
    
    /**
     * Gets the "zoneType" element
     */
    public java.lang.String getZoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZONETYPE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoneType" element
     */
    public org.apache.xmlbeans.XmlString xgetZoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZONETYPE$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "zoneType" element
     */
    public boolean isNilZoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZONETYPE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "zoneType" element
     */
    public void setZoneType(java.lang.String zoneType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZONETYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZONETYPE$20);
            }
            target.setStringValue(zoneType);
        }
    }
    
    /**
     * Sets (as xml) the "zoneType" element
     */
    public void xsetZoneType(org.apache.xmlbeans.XmlString zoneType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZONETYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZONETYPE$20);
            }
            target.set(zoneType);
        }
    }
    
    /**
     * Nils the "zoneType" element
     */
    public void setNilZoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZONETYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZONETYPE$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "zoneInfo" element
     */
    public java.math.BigInteger getZoneInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZONEINFO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoneInfo" element
     */
    public org.apache.xmlbeans.XmlInteger xgetZoneInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZONEINFO$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "zoneInfo" element
     */
    public boolean isNilZoneInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZONEINFO$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "zoneInfo" element
     */
    public void setZoneInfo(java.math.BigInteger zoneInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZONEINFO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZONEINFO$22);
            }
            target.setBigIntegerValue(zoneInfo);
        }
    }
    
    /**
     * Sets (as xml) the "zoneInfo" element
     */
    public void xsetZoneInfo(org.apache.xmlbeans.XmlInteger zoneInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZONEINFO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ZONEINFO$22);
            }
            target.set(zoneInfo);
        }
    }
    
    /**
     * Nils the "zoneInfo" element
     */
    public void setNilZoneInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZONEINFO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ZONEINFO$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "nationalRelevance" element
     */
    public boolean getNationalRelevance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALRELEVANCE$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationalRelevance" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNationalRelevance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NATIONALRELEVANCE$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nationalRelevance" element
     */
    public void setNationalRelevance(boolean nationalRelevance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALRELEVANCE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALRELEVANCE$24);
            }
            target.setBooleanValue(nationalRelevance);
        }
    }
    
    /**
     * Sets (as xml) the "nationalRelevance" element
     */
    public void xsetNationalRelevance(org.apache.xmlbeans.XmlBoolean nationalRelevance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NATIONALRELEVANCE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NATIONALRELEVANCE$24);
            }
            target.set(nationalRelevance);
        }
    }
    
    /**
     * Gets the "nationalName" element
     */
    public java.lang.String getNationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALNAME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationalName" element
     */
    public org.apache.xmlbeans.XmlString xgetNationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALNAME$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "nationalName" element
     */
    public boolean isNilNationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALNAME$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "nationalName" element
     */
    public void setNationalName(java.lang.String nationalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALNAME$26);
            }
            target.setStringValue(nationalName);
        }
    }
    
    /**
     * Sets (as xml) the "nationalName" element
     */
    public void xsetNationalName(org.apache.xmlbeans.XmlString nationalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALNAME$26);
            }
            target.set(nationalName);
        }
    }
    
    /**
     * Nils the "nationalName" element
     */
    public void setNilNationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALNAME$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "UEZone" element
     */
    public java.lang.String getUEZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UEZONE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UEZone" element
     */
    public org.apache.xmlbeans.XmlString xgetUEZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UEZONE$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "UEZone" element
     */
    public boolean isNilUEZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UEZONE$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "UEZone" element
     */
    public void setUEZone(java.lang.String ueZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UEZONE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UEZONE$28);
            }
            target.setStringValue(ueZone);
        }
    }
    
    /**
     * Sets (as xml) the "UEZone" element
     */
    public void xsetUEZone(org.apache.xmlbeans.XmlString ueZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UEZONE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UEZONE$28);
            }
            target.set(ueZone);
        }
    }
    
    /**
     * Nils the "UEZone" element
     */
    public void setNilUEZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UEZONE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UEZONE$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$30);
            }
            target.set(id);
        }
    }
}
