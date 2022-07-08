package com.torryharris.Product;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil 
{
	private static String url ="jdbc:mysql://localhost:3306/batch98";
	private static String username ="root";
	private static String password ="Shesha@98";
	static Connection con=null;
	
	static Connection getConnection() 
	{
		try
		{
			con = DriverManager.getConnection(url,username,password);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}
}
