package statementMethods;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC_Connector.JDBC_Connector;

//Signature --> public boolean execute(String sql) throws SQLException
//Used when not sure of the result
//Used to execute a query whose return type may not be know until runtime
public class executeDemo extends JDBC_Connector
{
    public static void main(String[] args) {
	
	ResultSet rs;
	
	int numRows;
	try
	{
	    JDBC_Connector.conn = getConn();
	    Statement stmt = JDBC_Connector.conn.createStatement();
	    boolean status = stmt.execute("SELECT * from clients;");
	    if(status)
	    {
		rs=stmt.getResultSet();
		while(rs.next())
		    {
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.println();
		    }
	    }
	    else
	    {
		numRows = stmt.getUpdateCount();
//		Return -1 if no results else prints no of rows affected
		System.out.println(numRows);
	    }
	    conn.close();
	} catch (SQLException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
}
