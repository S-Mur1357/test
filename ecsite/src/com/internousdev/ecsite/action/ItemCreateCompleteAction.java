package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {

		public Map<String,Object> session;

		public String execute() throws SQLException{

			String result = SUCCESS;

			ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();
			dao.createItem(session.get("itemName").toString(), session.get("itemPrice").toString(), session.get("itemStock").toString());

			return result;
		}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

}
