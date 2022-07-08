package com.torryharris.model;

import org.springframework.stereotype.Component;

@Component(value="engine")
public class Engine 
{
	public void start() 
	{
		System.out.println("Engine is starting....");
	}
}