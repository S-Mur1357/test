<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン失敗画面</title>
</head>
<body>
	<h1>ログインに失敗しました</h1>
	<br>
	<%
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		out.println("【入力内容を確認してください】");
	%>
	<br>
	<%
		out.println("ユーザー名:"+name);
	%>
	<br>
	<%
	 	out.println("パスワード:"+pass);
	%>
</body>
</html>