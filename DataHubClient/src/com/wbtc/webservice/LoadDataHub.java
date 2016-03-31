/**
 * LoadDataHub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wbtc.webservice;

public interface LoadDataHub extends java.rmi.Remote {
    public java.lang.String loadDataToDataHub(java.lang.String transactionType, java.lang.String transactionData) throws java.rmi.RemoteException;
    public java.lang.String loadPersonToDataHub(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;
}
