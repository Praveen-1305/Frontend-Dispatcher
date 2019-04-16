package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controll {

	@RequestMapping(value="/Login")
	public String Login(Model m)
	{
		m.addAttribute("declare", "Praveen");
		return"Login";
	}

	@RequestMapping(value="/Register")
	public String Register()
	{
		return"Register";
	}
}