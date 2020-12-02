package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		//Placeholder for actual validation against database
		return userid == "Lamont"&& password == "dummy";
	}
}
