package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
		public List<UserInfoDTO> userList = new ArrayList<UserInfoDTO>();
		private Map<String,Object> session;

		public String execute() throws SQLException{
			UserListDAO dao = new UserListDAO();
			userList = dao.getUserList();
			if(!(userList.size() > 0)) {
				userList = null;
			}

			String result = SUCCESS;
			return result;
		}

		public List<UserInfoDTO> getUserInfoDTOList() {
			return userList;
		}
		public void setUserInfoDTOList(List<UserInfoDTO> userInfoDTOList) {
			this.userList = userInfoDTOList;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}
		public Map<String, Object> getSession() {
			return session;
		}
	}