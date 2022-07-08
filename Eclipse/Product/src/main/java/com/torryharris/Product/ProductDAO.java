package com.torryharris.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO 
{
	Connection con=DBUtil.getConnection();
	public boolean insertProduct(Products prod)
	{
		boolean insert=false;
		try 
		{
			Statement statement=con.createStatement();
			String querry=prod.toString();
			int x=statement.executeUpdate(querry);
			if(x>0)
				insert=true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return insert;
	}
	public Products getProduct(int prodCode)
	{
		Products p=null;
		String querry="select * from products";
		ResultSet result;
		try 
		{
			Statement statement=con.createStatement();
			result = statement.executeQuery(querry);
			while(result.next())
			{
				if(result.getInt(1)==prodCode)
				{
					p = new Products(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
				}
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return p;
	}
}
