package com.cs373.assignment2.service;

public class User {
	private String user;
	protected String password;
	private String loginStatus;
	
	public User(){
	}
	
	public User(String user, String password, String loginStatus) {
		this.user = user;
		this.password = password;
		this.loginStatus = loginStatus;
	}
	
	public String getUser() {
		return user;
	}

	public void setUsername(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getloginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

}
