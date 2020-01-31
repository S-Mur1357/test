package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport {
	private String info;
	public String execute() throws SQLException {
		String result = SUCCESS;
		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
		int res = dao.deleteUserList();
		if (res > 0) {
			setInfo("削除しました。");
		} else {
			setInfo("削除に失敗しました。");
		}
		return result;
	}


	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
