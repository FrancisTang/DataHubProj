/**
 * InsertDataIntoDataHub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wbtc.dao;

public class InsertDataIntoDataHub  implements java.io.Serializable {
    private java.lang.String parm1;

    private java.lang.String parm2;

    public InsertDataIntoDataHub() {
    }

    public InsertDataIntoDataHub(
           java.lang.String parm1,
           java.lang.String parm2) {
           this.parm1 = parm1;
           this.parm2 = parm2;
    }


    /**
     * Gets the parm1 value for this InsertDataIntoDataHub.
     * 
     * @return parm1
     */
    public java.lang.String getParm1() {
        return parm1;
    }


    /**
     * Sets the parm1 value for this InsertDataIntoDataHub.
     * 
     * @param parm1
     */
    public void setParm1(java.lang.String parm1) {
        this.parm1 = parm1;
    }


    /**
     * Gets the parm2 value for this InsertDataIntoDataHub.
     * 
     * @return parm2
     */
    public java.lang.String getParm2() {
        return parm2;
    }


    /**
     * Sets the parm2 value for this InsertDataIntoDataHub.
     * 
     * @param parm2
     */
    public void setParm2(java.lang.String parm2) {
        this.parm2 = parm2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertDataIntoDataHub)) return false;
        InsertDataIntoDataHub other = (InsertDataIntoDataHub) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parm1==null && other.getParm1()==null) || 
             (this.parm1!=null &&
              this.parm1.equals(other.getParm1()))) &&
            ((this.parm2==null && other.getParm2()==null) || 
             (this.parm2!=null &&
              this.parm2.equals(other.getParm2())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getParm1() != null) {
            _hashCode += getParm1().hashCode();
        }
        if (getParm2() != null) {
            _hashCode += getParm2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertDataIntoDataHub.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.wbtc.com", ">insertDataIntoDataHub"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parm1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.wbtc.com", "parm1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parm2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.wbtc.com", "parm2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
