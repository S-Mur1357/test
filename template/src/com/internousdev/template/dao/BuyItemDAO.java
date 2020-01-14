package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

		public BuyItemDTO getBuyItemInfo() {

			//データベース接続のための準備
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();
			//BuyItemDTOのインスタンスを作成
			BuyItemDTO buyItemDTO = new BuyItemDTO();
			//item_info_transactionテーブルからid,item_name,item_priceを選ぶ
			String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

			try {
					//PreaparedStatementがデータベースまで運ぶ
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					//データベースへの問い合わせを実行する
					ResultSet resultSet = preparedStatement.executeQuery();

					//もし次の行があればTrueを返し、なければFalseを返す
					if(resultSet.next()) {
						//resultSetで得たものをbuyItemDTOのインスタンスにセットする
						buyItemDTO.setId(resultSet.getInt("id"));
						buyItemDTO.setItemName(resultSet.getString("item_name"));
						buyItemDTO.setItemPrice(resultSet.getString("item_price"));
					}
			}catch(Exception e) {
					e.printStackTrace();
			}

			return buyItemDTO;
		}
}
