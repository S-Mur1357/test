package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {

	//データベース接続の準備
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public void createItem(String item_name, String item_price, String item_count)throws SQLException {
		//item_info_transactionテーブルに値を格納する
		String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock,insert_date) VALUES(?, ? ,?, ?)";
		try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, item_name);
				preparedStatement.setString(2, item_price);
				preparedStatement.setString(3, item_count);
				preparedStatement.setString(4,dateUtil.getDate());
				//sql文の実行
				preparedStatement.execute();

		}catch(Exception e) {
				e.printStackTrace();
		}finally {
				//データベース接続を必ず切る
				connection.close();
		}
	}
}

