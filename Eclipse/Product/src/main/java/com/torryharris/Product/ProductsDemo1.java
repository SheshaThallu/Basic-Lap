package com.torryharris.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsDemo1 
{
	public static void main(String args[])
	{
		Connection con=null;
		try 
		{
			con = ConnectionProvider.createConnection();
			Statement statement = con.createStatement();
			String querry="select * from products";
			ResultSet result=statement.executeQuery(querry);
			int prod_code,prod_price;
			String prod_name,prod_catg;
			while(result.next()) 
			{
				prod_code=result.getInt(1);
				prod_name=result.getString(2);
				prod_price=result.getInt(3);
				prod_catg=result.getString(4);
				System.out.println(prod_code+" "+prod_name+" "+prod_price+" "+prod_catg);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}