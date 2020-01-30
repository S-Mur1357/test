<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel= "stylesheet" type = "text/css" href= "./css/style.css">
<title>商品登録画面</title>
</head>
	<body>
		<div id= "header">
		</div>
		<div id = "main">
			<div id = "top">
				<p>新規商品登録</p>
			</div>
				<table>
					<s:form action="ItemCreateConfirmAction">
						<tr>
							<td>
								商品名:<input type="text" name="itemName" value="" />
							</td>
						</tr>
						<tr>
							<td>
								価格:<input type="text" name="itemPrice" value="" />
							</td>
						</tr>
						<tr>
							<td>
								在庫数:<input type="text" name="itemStock" value="" />
							</td>
						</tr>
						<s:submit value="登録"/>
					</s:form>
				</table>
			</div>
		<div id= "footer">
		</div>
	</body>
</html>