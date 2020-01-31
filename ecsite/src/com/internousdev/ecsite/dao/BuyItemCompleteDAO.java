package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {

		public int buyItemInfo(String item_transaction_id,String total_price,String total_count,String user_master_id,String pay)throws SQLException {

			//データベース接続の準備
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();

			DateUtil dateUtil = new DateUtil();

			//user_buy_transactionテーブルに値を格納する
			String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";

			int result = 0;
			try {

					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, item_transaction_id);
					preparedStatement.setString(2, total_price);
					preparedStatement.setString(3, total_count);
					preparedStatement.setString(4, user_master_id);
					preparedStatement.setString(5, pay);
					//現在日時を取得
					preparedStatement.setString(6,dateUtil.getDate());
					//sql文の実行
					result = preparedStatement.executeUpdate();

			}catch(Exception e) {
					e.printStackTrace();
			}finally {
					//データベース接続を必ず切る
					connection.close();
			}
			return result;
		}


		public void updateItemStock(int count, String id) throws SQLException{

			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			String sql = "UPDATE item_info_transaction SET item_stock = item_stock - ? WHERE id = ?";
			try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, count);
					ps.setString(2, id);
					ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
		}
}
