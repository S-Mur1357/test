package com.internousdev.template.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//JDBCのドライバー名を変数に代入
	private static String driverName = "com.mysql.jdbc.Driver";
	//MySQL用のURLを指定
	private static String url = "jdbc:mysql://localhost/ecsite";
	//rootアカウントに指定
	private static String user = "root";
	//rootアカウントのパスワードを"mysql"に指定
	private static String password = "mysql";

	//接続状態にする
	public Connection getConnection() {

		//一度接続を初期化する
		Connection con = null;

		try {	//ドライバーをロードして使えるようにする
				Class.forName(driverName);
				//接続情報から自分のパソコンにインストールされているMySQLへ接続する準備
				con = (Connection)DriverManager.getConnection(url,user,password);
		} catch(ClassNotFoundException e) {
				e.printStackTrace();
		} catch(SQLException e) {
				e.printStackTrace();
		}

			return con;

		}
	}
