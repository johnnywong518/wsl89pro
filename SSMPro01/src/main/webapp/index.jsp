<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>功能菜单</title>
</head>
<body>
	<a href="ssm/login.do">测试连接</a><br></br>
	<a href="test.do">测试连接</a><br></br>
	<a href="AddUser.jsp">新增</a><br></br>

	<a href="ssm/queryUsers.do">查看所有</a><br></br>
	
</body>
</html>