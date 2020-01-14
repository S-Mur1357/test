package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	//JSPから受け取る値と同じ名前のフィールド変数を定義する
	private Map<String,Object> session;

	public String execute() throws SQLException {

		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		buyItemCompleteDAO.buyItemInfo(
							   session.get("id").toString(),
							   session.get("login_user_id").toString(),
							   session.get("buyItem_price").toString(),
							   session.get("stock").toString(),
							   session.get("pay").toString());

				String result = SUCCESS;
				return result;
	}

	//setterを定義することでJSPでユーザーが入力した値がそれぞれのフィールド変数に格納される
	//getterを定義して次の画面に値を渡す
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
}
