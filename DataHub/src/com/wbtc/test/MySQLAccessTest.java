package com.wbtc.test;

import com.wbtc.dao.*;

public class MySQLAccessTest {
  public static void main(String[] args) throws Exception {
    MySQLAccess dao = new MySQLAccess();
    dao.insertDataIntoDataHub("Hello", "world");
  }

} 
