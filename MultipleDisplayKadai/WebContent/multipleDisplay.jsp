<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta charset="UTF-8">
<title>複数件表示画面</title>
</head>
<body>
	<table>
		<tr>
			<th>name</th><th>age</th>
		</tr>
		<tr>
			<s:iterator value = "personList">
			<tr>
				<td><s:property value = "name" /></td>
				<td><s:property value = "age" /></td>
			</tr>
			</s:iterator>
		</tr>
	</table>
</body>
</html>