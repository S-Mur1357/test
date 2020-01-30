package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	//データベースに接続する準備
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	//LoginDTOのインスタンスを作る
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword) {
			String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

			try {
					//PreaparedStatementがデータベースまで運ぶ
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, loginUserId);
					preparedStatement.setString(2, loginPassword);

					ResultSet resultSet = preparedStatement.executeQuery();
					//もし次の行があればTrueを返し、なければFalseを返す
					if(resultSet.next()) {
							//LoginDTOのsetterを呼び出して、値をフィールドに格納する
							loginDTO.setLoginId(resultSet.getString("login_id"));
							loginDTO.setLoginPassword(resultSet.getString("login_pass"));
							loginDTO.setUserName(resultSet.getString("user_name"));

							if(resultSet.getString("login_id") != null) {
								loginDTO.setLoginFlg(true);
							}

							loginDTO.setAdminFlg(resultSet.getString("admin_flg"));
					}
			}catch(Exception e) {
					e.printStackTrace();
			}

			return loginDTO;
	}
}
