package statementMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC_Connector.JDBC_Connector;
public class executeQueryDemo
{
    public static void main(String[] args) {
	try
	{
	    Connection conn = JDBC_Connector.getConn();
	    Statement stmt = conn.createStatement();
	    String query = "SELECT * FROM clients ;";
	    ResultSet rs = stmt.executeQuery(query);
	    while(rs.next())
	    {
		System.out.print(rs.getString(1)+" ");
		System.out.print(rs.getString(2)+" ");
		System.out.print(rs.getString(3)+" ");
		System.out.println();
	    }
	    conn.close();
	} catch (SQLException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    
    }
}
