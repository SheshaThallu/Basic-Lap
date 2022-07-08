package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.config.SpringConfig;
import com.torryharris.dao.EmployeeDAO;
import com.torryharris.model.Employee;
public class JdbcDemo 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		Employee employee = new Employee();
		employee.setAge(21);
		employee.setName("Shesha");
		employee.setSalary(1000);
		
		employeeDAO.insert(employee);
		
		employee.setId(1);
		employee.setSalary(223344);
		
		employeeDAO.update(employee);
		
		employeeDAO.delete(1);
		System.out.println("Employee Deleted Successfully");
		
		Employee e = employeeDAO.getOne(3);
		System.out.println(e);
		
		List<Employee> allEmps = employeeDAO.getAll();
		System.out.println(allEmps);
	}
}
