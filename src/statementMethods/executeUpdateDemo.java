package statementMethods;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC_Connector.JDBC_Connector;

public class executeUpdateDemo
{
    public static void main(String[] args) {
	try
	{
	    Connection conn = JDBC_Connector.getConn();
	    Statement stmt = conn.createStatement();
	    String query = "UPDATE clients SET mob=006 WHERE id=2;";
	    int result = stmt.executeUpdate(query);
	    System.out.println("Return value: "+ result);
	    conn.close();
	} catch (SQLException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
}
