package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	//buyItem.jspから受け取る値と同じ名前のフィールド変数を定義する
	private Map<String,Object> session;
	private int count;
	private String pay;

	public String execute() {

			//初期値にSUCCESSを設定する
			String result = SUCCESS;

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

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}

	public Map<String, Object>getSession(){
		return session;
	}
}
