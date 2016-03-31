/**
 * MySQLAccessService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wbtc.dao;

public interface MySQLAccessService extends javax.xml.rpc.Service {
    public java.lang.String getMySQLAccessAddress();

    public com.wbtc.dao.MySQLAccess getMySQLAccess() throws javax.xml.rpc.ServiceException;

    public com.wbtc.dao.MySQLAccess getMySQLAccess(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
