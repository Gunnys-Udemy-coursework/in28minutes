package com.in28minutes.springboot.web.springbootfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginMessage() {
		return "login";
	}
}
