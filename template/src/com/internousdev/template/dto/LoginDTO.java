package com.internousdev.template.dto;

public class LoginDTO {

	//テーブルから取得するデータに対応したフィールド変数の宣言
	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;

	//フィールド変数に対応したgetterとsetter
	//getterはactionクラスから呼び出され、actionクラスに値を渡す
	public String getLoginId() {
		return loginId;
	}
	//setterはDAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のフィールドに格納する
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

}
