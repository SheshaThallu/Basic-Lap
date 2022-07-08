package com.torryharris.SampleApp;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Press 1 to add employee");
    	System.out.println("Press 2 to view employee");
    	System.out.println("Press 3 to delete employee");
    	System.out.println("Press 4 to update employee");
    	Scanner sc=new Scanner(System.in);
    	int choice =sc.nextInt();
    	int id; String name,department;
    	switch(choice) 
    	{
    		case 1:
    			System.out.println("enter id:");
    			id=sc.nextInt();
    			System.out.println("enter name:");
    			name=sc.next();
    			System.out.println("enter department:");
    			department=sc.next();
    			Employee emp=new Employee(id, name, department);
    			boolean flag = EmployeeDoa.addEmployee(emp);
    			if(flag) 
    			{
    				System.out.println("Employee Added");
    			}
    			else 
    			{
    				System.err.println("Something went wrong");
    			}
    			break;
    		case 2:
    			
    	}
    	sc.close();
    }
}
