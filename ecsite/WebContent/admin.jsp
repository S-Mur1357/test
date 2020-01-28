<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel= "stylesheet" type = "text/css" href= "./css/style.css">

<title>管理者画面</title>

</head>
<body>
	<div id = "header">
		<div id = "pr">
		</div>
	</div>
	<div id = "main">
		<div id = "top">
			<p>管理者画面</p>
		</div>
		<div id = "text-center">

			<table>
				<tr>
					<td>
							<span>商品</span>
					</td>
					<td>
						<s:form action = "ItemCreateAction">
							<s:submit value = "新規登録" /><br>
						</s:form>
					</td>
					<td>
						<s:form action = "ItemListAction">
							<s:submit value = "一覧" /><br>
						</s:form>
					</td>
				</tr>
				<tr>
					<td>
							<span>ユーザー</span>
					</td>
					<td>
						<s:form action = "UserCreateAction">
							<s:submit value = "新規登録" /><br>
						</s:form>
					</td>
					<td>
						<s:form action = "UserListAction">
							<s:submit value = "一覧" /><br>
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id = "footer">
		<div id = "pr">
		</div>
	</div>
</body>
</html>