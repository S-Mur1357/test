package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCompleteDAO {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		public int deleteUserInfo(String loginId) throws SQLException{
			String sql = "DELETE FROM login_user_transaction WHERE login_id = ?";
			int result = 0;
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, loginId);
				result = ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
			return result;
		}
}
