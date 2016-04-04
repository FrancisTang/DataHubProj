package com.wbtc.test;

import com.wbtc.beans.Employee;
import com.wbtc.dao.MySQLAccess;
import com.wbtc.utilities.XmlDomParser;

import java.util.List;

import javax.xml.bind.JAXBException;

//import org.apache.log4j.Logger;


public class DomParserTest {

  /**
   * @param args
   * @throws JAXBException 
   */
//  private  static Logger logger = Logger.getLogger(DomParserTest.class);

  
  public static void main(String[] args) throws Exception {
    
	MySQLAccess dao = new MySQLAccess();
    XmlDomParser parser = new XmlDomParser(); 
    
    List<Employee> employees = parser.parseXMLintoClass("c:/Java_Code/DataHub/XML/Employee.xml");


    for (int i = 0; i < employees.size(); i++) {
    System.out.println(employees.get(i));
 //   logger.debug("Timer1 is off ");
    
    Employee employee = employees.get(i);
    dao.insertDataIntoDataHub(employee.getFirstname(), employee.getLastname());
    }
  }

}