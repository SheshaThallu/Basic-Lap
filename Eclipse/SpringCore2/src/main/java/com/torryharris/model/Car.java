package com.torryharris.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="car")
public class Car
{
	private String company="BMW";
	
	@Autowired
	private Engine engine;
	
	public void drive()
	{
		engine.start();
		System.out.println(company+" Car is moving..");
		
	}
	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}
	public void setCompany(String company) 
	{
		this.company = company;
	}
	
}
