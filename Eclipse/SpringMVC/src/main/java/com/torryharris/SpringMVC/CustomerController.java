package com.torryharris.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController 
{
	@GetMapping("/login")
	public String getLoginPage()
	{
		return "login";
	}
	@GetMapping("/Register")
	public String getRegisterPage()
	{
		return "Register";
	}
}
