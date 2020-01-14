package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	//データベース接続のための準備
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	//BuyItemDTOのインスタンスを作成
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo() {
		    //item_info_transactionテーブルからid,item_name,item_priceを選ぶ
			String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

			try {
			        //PreaparedStatementがデータベースまで運ぶ
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					//データベースへの問い合わせを実行する
					ResultSet resultSet = preparedStatement.executeQuery();
					//もし次の行があればTrueを返し、なければFalseを返す
					if(resultSet.next()) {
							//データベースから取得した情報をDTOのフィールドに格納する
							buyItemDTO.setId(resultSet.getInt("id"));
							buyItemDTO.setItemName(resultSet.getString("item_name"));
							buyItemDTO.setItemPrice(resultSet.getString("item_price"));
					}
			}catch(Exception e) {
					e.printStackTrace();
			}
			//ActionクラスにDTOクラスを返す
			return buyItemDTO;
	}
}