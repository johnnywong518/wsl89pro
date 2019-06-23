<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息列表</title>
</head>
<body>
	<table width="49%" height="25%" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#0066FF">
		<tr bgcolor="#00CCFF">

			<td width="15%" align="center">用户名</td>
			<td width="9%" align="center">地址</td>
			<td width="19%" align="center">操作</td>
		</tr>
		<c:forEach items="${userls}" var="user">
			<tr>
				<td>${user.uname }</td>
				<td>${user.uaddr }</td>
				<td><a href="ssm/queryUser.do?uid=${user.uid}">修改</a>&nbsp;<a
					href="ssm/delUser.do?uid=${user.uid}">删除</a></td>
			</tr>
		</c:forEach>

		<tr>
			<td><a href="ssm/queryUsers.do?pno=1">首页</a></td>
			<c:if test="${pstart>1}">
				<td><a href="ssm/queryUsers.do?pno=${pstart-1}">上一页</a></td>
			</c:if>
			<c:if test="${pstart==1}">
				<td><a href="ssm/queryUsers.do?pno=${pstart}">上一页</a></td>
			</c:if>

			<td><a href="ssm/queryUsers.do?pno=${pstart+1} ">下一页</a> &nbsp;<a
				href="index.jsp ">index</a></td>
		</tr>
	</table>


</body>
</html>