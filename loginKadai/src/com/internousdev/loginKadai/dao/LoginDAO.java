package com.internousdev.loginKadai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.loginKadai.dto.LoginDTO;
import com.internousdev.loginKadai.util.DBConnector;

public class LoginDAO{

	public LoginDTO select(String userName, String password) throws SQLException{
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			LoginDTO dto = new LoginDTO();

			String sql = "SELECT * FROM user WHERE userName = ? AND password = ?";

			try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, userName);
					ps.setString(2, password);

					ResultSet rs = ps.executeQuery();

					if(rs.next()) {
						dto.setUserName(rs.getString("user_name"));
						dto.setPassword(rs.getString("password"));
					}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				con.close();
			}

			return dto;
	}
}