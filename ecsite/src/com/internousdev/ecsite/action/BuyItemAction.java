package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	//buyItem.jspから受け取る値と同じ名前のフィールド変数を定義する
	private Map<String,Object> session;
	private int count;
	private String pay;
	private String errorMessage;

	public String execute() {
			//初期値にSUCCESSを設定する
			String result = SUCCESS;

			int itemStock = Integer.parseInt(session.get("item_stock").toString());

			if(count > itemStock){
				setErrorMessage("在庫が足りません。");
				return ERROR;
			}

			session.put("count",count);
			int intCount = Integer.parseInt(session.get("count").toString());
			int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
			//価格と購入数を掛けた値を総額とする
			session.put("total_price",intCount * intPrice);

			String payment;
			if(pay.equals("1")) {
				payment = "現金払い";
				session.put("pay", payment);
			}else {
				payment = "クレジットカード";
				session.put("pay", payment);
			}
		return result;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
