package com.wbtc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.wbtc.beans.Person;

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
