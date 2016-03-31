package com.wbtc.dao;

public class MySQLAccessProxy implements com.wbtc.dao.MySQLAccess {
  private String _endpoint = null;
  private com.wbtc.dao.MySQLAccess mySQLAccess = null;
  
  public MySQLAccessProxy() {
    _initMySQLAccessProxy();
  }
  
  public MySQLAccessProxy(String endpoint) {
    _endpoint = endpoint;
    _initMySQLAccessProxy();
  }
  
  private void _initMySQLAccessProxy() {
    try {
      mySQLAccess = (new com.wbtc.dao.MySQLAccessServiceLocator()).getMySQLAccess();
      if (mySQLAccess != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mySQLAccess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mySQLAccess)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mySQLAccess != null)
      ((javax.xml.rpc.Stub)mySQLAccess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wbtc.dao.MySQLAccess getMySQLAccess() {
    if (mySQLAccess == null)
      _initMySQLAccessProxy();
    return mySQLAccess;
  }
  
  public void insertDataIntoDataHub(java.lang.String parm1, java.lang.String parm2) throws java.rmi.RemoteException{
    if (mySQLAccess == null)
      _initMySQLAccessProxy();
    mySQLAccess.insertDataIntoDataHub(parm1, parm2);
  }
  
  public void testDataBase() throws java.rmi.RemoteException{
    if (mySQLAccess == null)
      _initMySQLAccessProxy();
    mySQLAccess.testDataBase();
  }
  
  public void insertPersonIntoDataHub(com.wbtc.beans.Person person) throws java.rmi.RemoteException{
    if (mySQLAccess == null)
      _initMySQLAccessProxy();
    mySQLAccess.insertPersonIntoDataHub(person);
  }
  
  
}