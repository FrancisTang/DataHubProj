package com.wbtc.webservice;

import com.wbtc.beans.vho.Person;
import com.wbtc.dao.MySQLAccess;

public class LoadDataHub
{
  public String loadDataToDataHub ( String TransactionType, String TransactionData ) throws Exception
  {
	  // Insert request info into MySQL DB
	    MySQLAccess dao = new MySQLAccess();
	    dao.insertDataIntoDataHub(TransactionType, TransactionData);
	    
	    System.out.println("Inserted in MySQL....test input parm 1: " + TransactionType);
	    System.out.println("Inserted in MySQL ...test input parm 2: " + TransactionData);
	    return "Success";
  }

  public String loadPersonToDataHub ( String FirstName, String LastName ) throws Exception
  {
	  // Insert request info into MySQL DB
	  	Person person = new Person();
	  	person.setFirstName(FirstName);
	  	person.setLastName(LastName);
	    MySQLAccess dao = new MySQLAccess();
	    dao.insertPersonIntoDataHub(person);
	    
	    System.out.println("Inserted in MySQL....First Name: " + person.getFirstName());
	    System.out.println("Inserted in MySQL ...Last Name: " + person.getLastName());
	    return "Success";
  }
}
