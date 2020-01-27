<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel= "stylesheet" type = "text/css" href= "./css/style.css">
<title>商品登録確認画面</title>

</head>
<body>
<body>
	<div id= "header">
		<div id = "pr">
		</div>
	</div>
	<div id = "main">
		<div id = "top">
			<p>新規商品を登録しました</p>
		</div>
		<table>
					<s:form action="ItemCreateCompleteAction">
						<tr id="box">
							<td>
								<label>商品名:</label>
							</td>
							<td>
								<s:property value="itemName" escape="false" />
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>値段:</label>
							</td>
							<td>
								<s:property value="itemPrice" escape="false" />
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>在庫:</label>
							</td>
							<td>
								<s:property value="itemStock" escape="false" />
							</td>
						</tr>
						<tr>
							<td>
								<s:submit value="完了" />
							</td>
						</tr>
					</s:form>
				</table>
		</div>
	<div id= "footer">
	</div>
</body>
</html>