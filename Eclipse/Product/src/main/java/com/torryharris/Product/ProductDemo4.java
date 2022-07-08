package com.torryharris.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo4 
{
	public static void main(String[] args) 
	{
		Connection con=ConnectionProvider.createConnection();
		try 
		{
			Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
				if(prod_catg.equals("Electronics") && prod_price<1000)
				{
					result.updateInt(3, prod_price+(prod_price*10)/100);
					result.updateRow();
				}
				if(prod_catg.equals("Clothing") && prod_price>1000)
				{
					result.updateInt(3, prod_price-(prod_price*10)/100);
					result.updateRow();
				}
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
