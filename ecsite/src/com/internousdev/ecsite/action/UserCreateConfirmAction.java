package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

		//JSPから受け取る値と同じ名前のフィールド変数を定義する
		private String loginUserId;
		private String loginPassword;
		private String userName;
		public Map<String,Object>session;
		private String errorMessage;

		public String execute() {
			String result = SUCCESS;
			if(!(loginUserId.equals(""))
					&& !(loginPassword.equals(""))
					&& !(userName.equals(""))){
					UserCreateConfirmDAO dao = new UserCreateConfirmDAO();
					if(!dao.isExistsUser(loginUserId)) {
						session.put("loginUserId",loginUserId);
						session.put("loginPassword",loginPassword);
						session.put("userName", userName);
					}else {
						setErrorMessage("すでに登録されているログインIDです。");
						result = ERROR;
					}
			}else {
						setErrorMessage("未入力の項目があります。");
						result = ERROR;
			}
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

		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

}
