package com.internousdev.loginKadai.action;

import java.sql.SQLException;

import com.internousdev.loginKadai.dao.LoginDAO;
import com.internousdev.loginKadai.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String name;
	private String password;

	public String execute() throws SQLException{
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(name, password);

		if(name.equals(dto.getUserName())) {
			if(password.equals(dto.getPassword())) {
					ret = SUCCESS;
				}
			}
		return ret;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}
