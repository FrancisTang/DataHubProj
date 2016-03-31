/**
 * MySQLAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wbtc.dao;

public interface MySQLAccess extends java.rmi.Remote {
    public void insertDataIntoDataHub(java.lang.String parm1, java.lang.String parm2) throws java.rmi.RemoteException;
    public void testDataBase() throws java.rmi.RemoteException;
    public void insertPersonIntoDataHub(com.wbtc.beans.Person person) throws java.rmi.RemoteException;
}
