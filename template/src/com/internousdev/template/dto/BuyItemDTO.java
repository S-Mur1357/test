package com.internousdev.template.dto;

public class BuyItemDTO {

	//テーブルから取得するデータに対応したフィールド変数の宣言
	private int id;
	private String itemName;
	private String itemPrice;

	//フィールド変数に対応したgetterとsetter
	//getterはactionクラスから呼び出され、actionクラスに値を渡す
	public String getItemName() {
		return itemName;
	}
	//setterはDAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のフィールドに格納する
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

}
