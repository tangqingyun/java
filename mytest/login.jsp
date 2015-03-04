<%@ page pageEncoding="utf-8"%>
<html>
<head>
	<TITLE>用户登陆</TITLE>
</head>
<body>
	<form  method="post" action="login.do">
	<table>
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="uname"/></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input type="text" name="upwd"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="submit" value="登录"/>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>