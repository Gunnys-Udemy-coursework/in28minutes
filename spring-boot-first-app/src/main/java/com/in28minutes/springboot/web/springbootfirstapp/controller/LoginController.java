package com.in28minutes.springboot.web.springbootfirstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model ) {
//		model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcome(ModelMap model,  @RequestParam String name, @RequestParam String password) {
		boolean isValidUser =  service.validateUser(name, password);
		if(!isValidUser) {
			model.put("errorMessage", "Invalid credentials");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}
