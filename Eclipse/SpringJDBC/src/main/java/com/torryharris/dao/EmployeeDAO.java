package com.torryharris.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.torryharris.model.Employee;
@Component
public class EmployeeDAO 
{
	@Autowired
	public JdbcTemplate jdbcTemplate;
	public void insert(Employee employee)
	{
		String sql = "insert into employee(name, age, salary) values(?,?,?)";
		jdbcTemplate.update(sql,new Object[] {employee.getName(), employee.getAge(), employee.getSalary()});
	}
	public void update(Employee employee)
	{
		String sql = "update employee set name = ?, age = ?, salary = ? where id = ?";
		jdbcTemplate.update(sql, new Object[] {employee.getName(), employee.getAge(), employee.getSalary(), employee.getId()});
	}
	public void delete(int employeeId)
	{
		String sql = "delete from employee where id = ?";
		jdbcTemplate.update(sql, new Object[] {employeeId});
	}
	public List<Employee> getAll()
	{
		String sql = "select * from employee";
		List<Employee> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
		return result;
	}
	public Employee getOne(int EmployeeId)
	{
		String sql = "select *from employee where id = ?";
		List<Employee> result = jdbcTemplate.query(sql, new Object[] {EmployeeId}, new BeanPropertyRowMapper(Employee.class));
		if( result.size() > 0 ) 
		{
			return result.get(0);
		}
		else 
		{
			return null;
		}
	}
}
