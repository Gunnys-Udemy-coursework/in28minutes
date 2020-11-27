package com.in28minutes.springboot.web.springbootfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginMessage(@RequestParam String name, ModelMap model ) {
		model.put("name", name);
		return "login";
	}
}
