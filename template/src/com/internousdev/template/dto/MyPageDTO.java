package com.internousdev.template.dto;

public class MyPageDTO {

	//テーブルから取得するデータに対応したフィールド変数の宣言
	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String payment;

	//フィールド変数に対応したgetterとsetter
	//getterはactionクラスから呼び出され、actionクラスに値を渡す
	public String getItemName() {
		return this.itemName;
	}
	//setterはDAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のフィールドに格納する
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(String totalPrice){
		this.totalPrice = totalPrice;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount){
		this.totalCount = totalCount;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment){
		this.payment = payment;
	}
}
