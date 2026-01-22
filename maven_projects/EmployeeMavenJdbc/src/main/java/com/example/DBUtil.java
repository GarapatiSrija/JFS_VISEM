package com.example;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil
{

    public static Connection getConnection() throws Exception 
  {
        return DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/skillnext_db",
            "root",
            "Srija@2005"
        );
    }
}