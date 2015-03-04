<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布博客</title>
</head>
<body>
 
 <form action="${pageContext.request.contextPath}/blogs/pubblog"
		method="post">
		<table id="table_01">
			<tr>
				<td>标题</td>
				<td><input type="text" name="blog.title" size="70" /></td>
			</tr>
			<tr>
				<td>文章内容</td>
				<td><textarea name="blog.content" cols="80" rows="20"></textarea></td>
			</tr>
			<tr>
				<td>文章分类</td>
				<td><select name="blog.type">
						<option value="1">移动开发</option>
						<option value="2">Web前端</option>
						<option value="3">架构设计</option>
						<option value="4">编程语言</option>
						<option value="5">互联网</option>
						<option value="6">数据库</option>
						<option value="7">系统运维</option>
						<option value="8">云计算</option>
						<option value="9">研发管理</option>
						<option value="10">综合</option>
				</select></td>
			</tr>

			<tr>
				<td>文章标签</td>
				<td><input type="text" name="blog.tag" size="50" /></td>
			</tr>

			<tr>
				<td style="padding-top: 10px;"><input type="submit"
					name="submit" value=" 发表文章  " />&nbsp;&nbsp;</td>
			</tr>
		</table>
	</form>
	
</body>
</html>