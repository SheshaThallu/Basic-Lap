package com.torryharris.JDBCapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class App 
{
    public static void main( String[] args )
    {
        Connection con=null;
        try 
        {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch98","root","Shesha@98");
			Statement statement=con.createStatement();
			String querry1="create table department(depid int(9) PRIMARY KEY,dptname varchar(50), dptloc varchar(50))";
			boolean result1=statement.execute(querry1);
			System.out.println(result1);
			String querry2="insert into department values(101,'IT','Bangalore')";
			int result2=statement.executeUpdate(querry2);
			System.out.println(result2);
			String querry3="select * from employee";
			ResultSet result3=statement.executeQuery(querry3);
			System.out.println(result3);
			int id;String dptname,loc;
			while(result3.next()) 
			{
				id=result3.getInt(1);
				dptname=result3.getString(2);
				loc=result3.getString(3);
				System.out.println(id+" "+dptname+" "+loc);
			}
		} 
        catch (SQLException e) 
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