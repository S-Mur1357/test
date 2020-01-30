package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;


public class UserCreateCompleteDAO {

	//データベース接続の準備
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	//DateUtilのインスタンスを作る
	private DateUtil dateUtil = new DateUtil();

	public void createUser(String loginUserId,String loginUserPassword,String userName) throws SQLException {
		String sql = "INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date)VALUES(?,?,?,?)";
		try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setString(1, loginUserId);
				preparedStatement.setString(2, loginUserPassword);
				preparedStatement.setString(3, userName);
				//4番目は値をデータベースに格納した時間
				preparedStatement.setString(4, dateUtil.getDate());

				preparedStatement.executeUpdate();

		} catch(Exception e){
				e.printStackTrace();
		} finally {
				connection.close();
		}
	  }
}