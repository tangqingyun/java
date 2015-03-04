<%@ page pageEncoding="utf-8"%>
<%@ include file="hello.jsp"%>
<html>
<head></head>
<title>第一个jsp程序</title>
<body>
<%
	int a=1;
	a++;
	out.println(a+"</br>");
	out.println(s);
%>
</body>
</html>