package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword) {

		//データベース接続のための準備
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		//LogintDTOのインスタンスを作成
		LoginDTO loginDTO = new LoginDTO();
		//login_user_transactionテーブルのlogin_idデータとlogin_passデータの2つの条件を満たしたものだけがsql文に代入される
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try {
			//PreaparedStatementがデータベースまで運ぶ
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			//executeQuery()は必ずResultSetを返す
			ResultSet resultSet = preparedStatement.executeQuery();

			//もし次の行があればTrueを返し、なければFalseを返す
			if(resultSet.next()){
				//resultSetで得たものをloginDTOのインスタンスにセットする
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if(resultSet.getString("login_id") != null) {
					loginDTO.setLoginFlg(true);
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	  }
}
