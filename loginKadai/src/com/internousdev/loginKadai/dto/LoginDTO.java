package com.internousdev.loginKadai.dto;

public class LoginDTO {
	private int id;
	private String userName;
	private String password;


	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String  getPassword() {
		return this.password;
	}
}