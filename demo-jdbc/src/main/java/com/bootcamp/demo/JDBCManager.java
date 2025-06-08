package com.bootcamp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.util.List;

public class JDBCManager {
  private Connection connection;
  private Statement statement;

  public JDBCManager() {

  }
  

  public void login() {

  }

  public List<Person> getData() {

  }
  public static void main(String[] args) {
    JDBCManager jm = new JDBCManager();
    jm.login(); // Connection/ Statement?
    jm.insert();
    jm.getData();
  }
}
