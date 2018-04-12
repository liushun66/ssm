<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>学生管理系统</h1>
	<a href='add'>新增员工</a>
	<table border="1">
		<tr>
			<th>学生编号</th>
			<th>学生姓名</th>
			<th>年龄</th>
			<th>班级</th>
			<th>操作</th>
		</tr>
		<c:forEach var="item" items="${page.listStudent}">
			<tr>
				<td>${item.studentNo}</td>
				<td>${item.studentName}</td>
				<td>${item.age}</td>
				<td>${item.gradeName}</td>
				<td><a href='delete?id=${item.studentNo}'>删除</a><a href='selectupdate?id=${item.studentNo}'>修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${page.getCurrPageNo()>1}">
		<a href="index?pageNo=1">首页</a>
		<a href="index?pageNo=${page.getCurrPageNo()-1}">上一页</a>
	</c:if>
	<c:if test="${page.getCurrPageNo()<page.getTotalPageNo()}">
		<a href="index?pageNo=${page.getCurrPageNo()+1}">下一页</a>
		<a href="index?pageNo=${page.getTotalPageNo()}">末页</a>
	</c:if>
</body>
</html>