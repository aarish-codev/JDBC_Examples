package resultSetMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



import JDBC_Connector.JDBC_Connector;

public class RSMD_Methods
{
    public static void main(String[] args) {
	try
	{
	    Connection conn = JDBC_Connector.getConn();
	    Statement stmt = conn.createStatement();
	    String query = "SELECT * FROM clients ;";
	    ResultSet rs = stmt.executeQuery(query);
	    ResultSetMetaData rsmd = rs.getMetaData();
	    rs.next();
	    int colCount = rsmd.getColumnCount();
	    System.out.println("Column Count: "+colCount);
	    System.out.println();
	    
	    for(int i=1; i<=colCount; i++)
	    {
		System.out.println("Table Name: "+rsmd.getTableName(i));
		System.out.println("Column Name: "+rsmd.getColumnName(i));
		System.out.println("Column Type: "+rsmd.getColumnTypeName(i));
		System.out.println("Column Size: "+rsmd.getColumnDisplaySize(i));
		System.out.println("Column Value: "+rsmd.getColumnClassName(i));
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
