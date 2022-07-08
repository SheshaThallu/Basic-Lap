package com.torryharris.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int product_code=sc.nextInt();
		sc.close();
		Connection con=null;
		con=ConnectionProvider.createConnection();
		try 
		{
			Statement statement=con.createStatement();
			String querry="select * from products where prod_code="+product_code;
			ResultSet result=statement.executeQuery(querry);
			int prod_code,prod_price;
			String prod_name,prod_catg;
			while(result.next()) 
			{
				prod_code=result.getInt(1);
				prod_name=result.getString(2);
				prod_price=result.getInt(3);
				prod_catg=result.getString(4);
				System.out.println("Product Details\nCode : "+prod_code+"\nName : "+prod_name+"\nPrice : "+prod_price+"\nCategory : "+prod_catg);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
