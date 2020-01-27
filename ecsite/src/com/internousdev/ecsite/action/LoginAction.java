package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

		//login.jspに入力された値と同じ名前のフィールドを作る
		private String loginUserId;
		private String loginPassword;
		public Map<String,Object>session;
		//インスタンスを作る
		private LoginDAO loginDAO = new LoginDAO();
		private LoginDTO loginDTO = new LoginDTO();
		private BuyItemDAO buyItemDAO = new BuyItemDAO();


		public String execute() {

			//ERRORを初期値に設定する
			String result = ERROR;
			loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
			session.put("loginUser", loginDTO);

			//入力された値からユーザー情報を検索する
			if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
				if((((LoginDTO) session.get("loginUser")).getAdminFlg() != null)
						&& (((LoginDTO) session.get("loginUser")).getAdminFlg().equals("1"))) {
						result = "admin";
					}else {
						result = SUCCESS;
						BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

						session.put("login_user_id", loginDTO.getLoginId());
						session.put("id", buyItemDTO.getId());
						session.put("buyItem_name", buyItemDTO.getItemName());
						session.put("buyItem_price", buyItemDTO.getItemPrice());
						session.put("item_stock", buyItemDTO.getItemStock());
					}
			}
			//管理者でログインした場合admin.jsp/それ以外はbuyItem.jsp/Errorの場合login.jsp
			return result;
		}
		//setterによってlogin.jspで入力された値がフィールドに格納される
		//getterで次の画面に値を渡す
		public String getLoginUserId() {
			return loginUserId;
		}
		public void setLoginUserId(String loginUserId) {
			this.loginUserId = loginUserId;
		}

		public String getLoginPassword() {
			return loginPassword;
		}
		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}
		@Override
		public void setSession(Map<String,Object>session){
			this.session = session;
		}
		public Map<String,Object> getSession(){
			return this.session;
		}
}
