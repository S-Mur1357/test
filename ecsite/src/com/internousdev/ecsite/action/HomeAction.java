package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

		public Map<String,Object> session;

		public String execute() {
			//初期値にloginを設定する
			String result = "login";
			//ログイン済みかどうかの判定をする
			if(session.containsKey("login_user_id")) {
					//BuyItemDAOのインスタンスを作り、BuyItemDTOの変数にDAOがゲットした情報を代入する
					BuyItemDAO buyItemDAO = new BuyItemDAO();
					BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
					session.put("id", buyItemDTO.getId());
					session.put("buyItem_name", buyItemDTO.getItemName());
					session.put("buyItem_price", buyItemDTO.getItemPrice());
					//ログイン状態の場合SUCCESSを返す
					result = SUCCESS;
			}
			//ログインしていない場合"login"を返す
			return result;
		}

		@Override
		public void setSession(Map<String,Object> session){
			this.session = session;
		}
		public Map<String,Object> getSession(){
			return this.session;
		}
}
