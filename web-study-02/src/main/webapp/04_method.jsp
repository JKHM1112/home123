<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- MethodServlet.java랑 이름이 맞아야 한다. -->
	<form action="MethodServlet" method="get">
		<input type ="submit" value="get방식으로 호출하기">
	</form>
	<br><br>
	<form action="MethodServlet" method="post">
		<input type ="submit" value="post방식으로 호출하기">
	</form>
</body>
</html>