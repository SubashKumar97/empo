package case1;

import java.sql.Connection;
import java.sql.DriverManager;

public class rrr {
	static Connection con;
	public static Connection getconnection()
	{
		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sss","root","admin");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
