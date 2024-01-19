package com.SpEEdysm1des.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {
	@NotNull(message = "Username is required")
	@Size(min = 3,max = 15,message = "Username must be between 3 and 15")
	private String username;
	@NotNull
	@Size(min = 8,max = 15,message = "password must be between 8 and 15")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "LoginModel [password=" + password + ", username=" + username + "]";
	}
	public LoginModel(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}
	public LoginModel() {
		super();
	}
}
