package com.torryharris.SampleApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDoa 
{
	public static boolean addEmployee(Employee emp) 
	{
		Connection con = ConnectionProvider.createConnection();
		Boolean flag = false;
		String query = "insert into employee values(?,?,?)";
		try 
		{
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getDepartment());
			pstmt.executeUpdate();
			flag = true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return flag;
	}
}
