package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	//JSPから受け取る値と同じ名前のフィールド変数を定義する
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object> session;
    //UserCreateCompleteDAOのインスタンスを作る
    private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException{

		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
					session.get("loginPassword").toString(),
					session.get("userName").toString());

					String result = SUCCESS;

					return result;
	}


	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
}
