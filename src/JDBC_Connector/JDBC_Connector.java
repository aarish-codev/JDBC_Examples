package JDBC_Connector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC_Connector
{
    
    	  static String user = "root";
	  static String pass = "root";
	  static String url= "jdbc:mysql://localhost:3306/jdbc_demoDB?useSSL=false";
	  public static Connection conn;  
	  
	public static Connection getConn() throws SQLException
	  {
	      	  conn = DriverManager.getConnection(url,user,pass);
        	  System.out.println("Connection succesful @"+conn);
        	  System.out.println("Your program output is \n");
        	  return conn;
        	  
	  }
	
  }    

