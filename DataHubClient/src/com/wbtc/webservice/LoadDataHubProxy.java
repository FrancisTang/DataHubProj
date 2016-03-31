package com.wbtc.webservice;

public class LoadDataHubProxy implements com.wbtc.webservice.LoadDataHub {
  private String _endpoint = null;
  private com.wbtc.webservice.LoadDataHub loadDataHub = null;
  
  public LoadDataHubProxy() {
    _initLoadDataHubProxy();
  }
  
  public LoadDataHubProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoadDataHubProxy();
  }
  
  private void _initLoadDataHubProxy() {
    try {
      loadDataHub = (new com.wbtc.webservice.LoadDataHubServiceLocator()).getLoadDataHub();
      if (loadDataHub != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loadDataHub)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loadDataHub)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loadDataHub != null)
      ((javax.xml.rpc.Stub)loadDataHub)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wbtc.webservice.LoadDataHub getLoadDataHub() {
    if (loadDataHub == null)
      _initLoadDataHubProxy();
    return loadDataHub;
  }
  
  public java.lang.String loadDataToDataHub(java.lang.String transactionType, java.lang.String transactionData) throws java.rmi.RemoteException{
    if (loadDataHub == null)
      _initLoadDataHubProxy();
    return loadDataHub.loadDataToDataHub(transactionType, transactionData);
  }
  
  public java.lang.String loadPersonToDataHub(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (loadDataHub == null)
      _initLoadDataHubProxy();
    return loadDataHub.loadPersonToDataHub(firstName, lastName);
  }
  
  
}