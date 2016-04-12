package com.wbtc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.wbtc.beans.vho.Person;

public class MySQLAccess {
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;

  public void testDataBase() throws Exception {
    try {
      // This will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // Setup the connection with the DB
      connect = DriverManager
          .getConnection("jdbc:mysql://caleb.wycliffe.ca/testHub?"
              + "user=master&password=Bible5427?");

      // Statements allow to issue SQL queries to the database
      statement = connect.createStatement();

      // PreparedStatements can use variables and are more efficient
      preparedStatement = connect
          .prepareStatement("insert into  testHub.TestTable1 values (?, ?)");
      preparedStatement.setString(1, "Test parm 1");
      preparedStatement.setString(2, "Test parm 2");
      preparedStatement.executeUpdate();

      preparedStatement = connect
          .prepareStatement("SELECT Parm1, Parm2 from testHub.TestTable1");
      resultSet = preparedStatement.executeQuery();
      writeResultSet(resultSet);

     
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }

  }


  public void insertPersonIntoDataHub(Person person ) throws Exception {
    try {
      // This will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // Setup the connection with the DB
      connect = DriverManager
          .getConnection("jdbc:mysql://caleb.wycliffe.ca/testHub?"
              + "user=master&password=Bible5427?");

      // Statements allow to issue SQL queries to the database
      statement = connect.createStatement();

      // PreparedStatements can use variables and are more efficient
      preparedStatement = connect
          .prepareStatement("insert into testHub.TestTable1 values (?, ?)");
      preparedStatement.setString(1, person.getFirstName());
      preparedStatement.setString(2, person.getLastName());
      preparedStatement.executeUpdate();

      preparedStatement = connect
          .prepareStatement("SELECT Parm1, Parm2 from testHub.TestTable1");
      resultSet = preparedStatement.executeQuery();
      writeResultSet(resultSet);

     
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }

  }
  

  public void insertDataIntoDataHub(String parm1, String parm2 ) throws Exception {
    try {
      // This will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // Setup the connection with the DB
      connect = DriverManager
          .getConnection("jdbc:mysql://caleb.wycliffe.ca/testHub?"
              + "user=master&password=Bible5427?");

      // Statements allow to issue SQL queries to the database
      statement = connect.createStatement();

      // PreparedStatements can use variables and are more efficient
      preparedStatement = connect
          .prepareStatement("insert into  testHub.TestTable1 values (?, ?)");
      preparedStatement.setString(1, parm1);
      preparedStatement.setString(2, parm2);
      preparedStatement.executeUpdate();

      preparedStatement = connect
          .prepareStatement("SELECT Parm1, Parm2 from testHub.TestTable1");
      resultSet = preparedStatement.executeQuery();
      writeResultSet(resultSet);

     
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }

  }

  public void insertDonationTxIntoDataHub(int salesForceID, ArrayList<String> donationTx, Connection dataHubConnection, int loadingStatus  ) throws Exception {
    try {


	  // Statements allow to issue SQL queries to the database
	  statement = dataHubConnection.createStatement();

	  // PreparedStatements can use variables and are more efficient
	  preparedStatement = dataHubConnection.prepareStatement("insert into datahub.donation_tx_delta values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

	  
      // Salesforce ID
      preparedStatement.setInt(1, salesForceID);
      // Kutoa ID
      preparedStatement.setInt(2, Integer.valueOf(donationTx.get(0)));
      //Donation Number  -- to be determined - defaulted to 0 for now
      preparedStatement.setInt(3, 0);
      //Project Number
      preparedStatement.setString(4, donationTx.get(13));
      //Project
      preparedStatement.setString(5, donationTx.get(14));
      //Subcode
      preparedStatement.setString(6, donationTx.get(15));
      //Motivation Code
      preparedStatement.setString(7, donationTx.get(16));
      //Donation Date
      java.util.Date utilDate = new java.util.Date();
      preparedStatement.setDate(8, new java.sql.Date(utilDate.getTime()));
      //Amount
      Double donationAmt=Double.parseDouble(donationTx.get(44));
      preparedStatement.setDouble(9, donationAmt);
      //Loading Status
      preparedStatement.setInt(10, loadingStatus);
      preparedStatement.executeUpdate();
    
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }

  }
  private void writeResultSet(ResultSet resultSet) throws SQLException {
    // ResultSet is initially before the first data set
    while (resultSet.next()) {
      // It is possible to get the columns via name
      // also possible to get the columns via the column number
      // which starts at 1
      // e.g. resultSet.getSTring(2);
      String parm1 = resultSet.getString("Parm1");
      String parm2 = resultSet.getString("Parm2");
      System.out.println("Parm 1: " + parm1);
      System.out.println("Parm 2: " + parm2);

    }
  }

  // You need to close the resultSet
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }

} 
