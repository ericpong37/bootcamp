package com.bootcamp.demo;

public class DemoPostgreSQLJDBC {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/bootcamp_2504";
    String user = "postgres";
    String password = "admin1234";

    // create table
    String createTable = 
          "CREATE TABLE IF NOT EXISTS JDBC_POSTGRESQL_TABLE (id INT PRIMARY KEY, name VARCHAR(50))";

    // insert
    String insertData = 
          "INSERT INTO JDBC_POSTGRESQL_TABLE (id, name) VALUES (2, 'Vincent') ";

    // select

    // update (similar to insert)
    
    // delete (similar to insert)
  }
}
