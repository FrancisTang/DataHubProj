/**
 * InsertPersonIntoDataHub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wbtc.dao;

public class InsertPersonIntoDataHub  implements java.io.Serializable {
    private com.wbtc.beans.Person person;

    public InsertPersonIntoDataHub() {
    }

    public InsertPersonIntoDataHub(
           com.wbtc.beans.Person person) {
           this.person = person;
    }


    /**
     * Gets the person value for this InsertPersonIntoDataHub.
     * 
     * @return person
     */
    public com.wbtc.beans.Person getPerson() {
        return person;
    }


    /**
     * Sets the person value for this InsertPersonIntoDataHub.
     * 
     * @param person
     */
    public void setPerson(com.wbtc.beans.Person person) {
        this.person = person;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPersonIntoDataHub)) return false;
        InsertPersonIntoDataHub other = (InsertPersonIntoDataHub) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson())));
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPersonIntoDataHub.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.wbtc.com", ">insertPersonIntoDataHub"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.wbtc.com", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.wbtc.com", "Person"));
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
