package com.cs373.assignment2.service;

import org.springframework.stereotype.Service;

@Service
public class checkLoginService {

	public User checkLogin(String username, String password) {
		UserFail fail = new UserFail("xxxx", "1234", "fail");
		if(username.matches(("[A-Z][a-z]*")) && password.matches(("[A-Z][a-z]*"))) {
			UserSuccess success = new UserSuccess(username, password,"success");
			return success;
		}else {
			return fail;
		}
	}

}