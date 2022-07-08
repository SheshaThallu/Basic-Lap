package com.torryharris.SampleApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
	private static String url="jdbc:mysql://localhost:3306/batch98";
	private static String username="root";
	private static String password="Shesha@98";
	static Connection con=null;
	public static Connection createConnection() 
	{
		try 
		{
			con=DriverManager.getConnection(url,username,password);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
			return con;
	}

}
