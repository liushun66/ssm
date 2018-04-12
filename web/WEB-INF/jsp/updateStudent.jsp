<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>修改学生信息</h1>
	<form action="update" method="post">
		<input type="hidden" name="studentNo" value="${student.studentNo}"/><br/>
		学生姓名：<input type="text" name="studentName" value="${student.studentName}"/><br/>
		密码：<input type="text" name="password" value="${student.password}"/><br/>
		年龄：<input type="text" name="age" value="${student.age}"/><br/>
		年级：<input type="text" name="gradeId" value="${student.gradeId}"/><br/>
		<input type="submit" name="sub" value="提交"/>
		<input type="reset" name="res" value="返回"/>
	</form>
</body>
</html>