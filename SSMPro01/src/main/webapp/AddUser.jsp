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
<title>注册</title>
</head>
<body>
<form action="ssm/addUser.do" method="post">
User NAME:<input type="text" name="uname" size="18"/><br></br>
User ADDR:<input type="text" name="uaddr" size="18"/><br></br>
<input type="reset" value="重置"/> <input type="submit" value="提交"/>
</form>
</body>
</html>