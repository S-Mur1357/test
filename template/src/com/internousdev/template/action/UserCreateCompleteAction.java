package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	//JSPから受け取る値と同じ名前のフィールド変数を定義する
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object> session;

	public String execute() throws SQLException{

		//UserCrateCompleteDAOのインスタンスを作る
		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
					session.get("loginPassword").toString(),
					session.get("userName").toString());

					String result = SUCCESS;

					return result;
	}

	//setterを定義することでJSPでユーザーが入力した値がそれぞれのフィールド変数に格納される
	//getterを定義して次の画面に値を渡す
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

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
}
