package com.wbtc.toolbox.test;

import com.wbtc.beans.vho.Person;
import com.wbtc.dao.MySQLAccess;
import com.wbtc.toolbox.XmlToJavaUtils;

public class XmlToJavaUtilsTest {
  public static void main(String[] args) throws Exception {
    XmlToJavaUtils xmlJavaUtil = new XmlToJavaUtils();
    Person personInfo = xmlJavaUtil.loadPersonInfoXMLtoJavaBean();
    

    //Obtaining all the required data from the JAXB Root class instance.
    System.out.println("Printing the person info ....");
    System.out.println("First Name: "+ personInfo.getFirstName());
    System.out.println("Last Name: " + personInfo.getLastName());
    
    //Insert person info into data hub
    MySQLAccess dao = new MySQLAccess();
    dao.insertDataIntoDataHub(personInfo.getFirstName(), personInfo.getLastName());
  }

} 
