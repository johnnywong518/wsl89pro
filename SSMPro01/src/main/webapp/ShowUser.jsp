<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息</title>
</head>
<body>
<form action="ssm/updUser.do" method="post">
	<table width="49%" height="25%" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#0066FF">
		<tr bgcolor="#00CCFF">

			<td width="15%" align="center">用户名</td>
			<td width="9%" align="center">地址</td>
			<td width="19%" align="center">操作</td>
		</tr>
		<input type="hidden" name="uid" value="${user.uid}" />
			<tr>
				<td><input type="text" name="uname" size="18" value="${user.uname}"/></td>
				<td><input type="text" name="uaddr" size="18" value="${user.uaddr}"/></td>
				<td><input type="submit" value="修改"/>&nbsp;<a href="ssm/queryUsers.do">查看所有</a>
					</td>
			</tr>
	</table>
	</form>
	

</body>
</html>