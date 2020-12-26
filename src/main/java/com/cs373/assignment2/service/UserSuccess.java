package com.cs373.assignment2.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSuccess extends User{

	public UserSuccess(String user, String password, String loginStatus) {
		super(user, password, loginStatus);
	}
	
	@JsonIgnore
	public String getPassword() {
		return super.password;
	}

}
