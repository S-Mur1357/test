package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	    //テーブルカラムに対応したフィールド変数を宣言する
		private int id;
		private String itemName;
		private String itemPrice;
		private int itemStock;

		//フィールド変数に対応したGetter,Setterを定義する
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(String itemPrice) {
			this.itemPrice = itemPrice;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}


		public int getItemStock() {
			return itemStock;
		}
		public void setItemStock(int itemStock) {
			this.itemStock = itemStock;
		}

}
