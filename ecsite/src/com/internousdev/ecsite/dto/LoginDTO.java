package com.internousdev.ecsite.dto;

public class LoginDTO {

	//LoginDAOが選んだ値を格納するフィールドを宣言
	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;
	private String adminFlg;

	//getterはLoginActionで呼び出され、値を渡す
	//setterはLoginDAOで呼び出され、このクラスのフィールドに値を格納する
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg= loginFlg;
	}
	public String getAdminFlg() {
		return adminFlg;
	}
	public void setAdminFlg(String adminFlg) {
		this.adminFlg = adminFlg;
	}


}
