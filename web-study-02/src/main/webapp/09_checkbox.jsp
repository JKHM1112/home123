<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action = "CheckboxServlet">
	<input type = "checkbox" name="item" value="신발2">신발1
	<input type = "checkbox" name="item" value="가방2">가방1
	<input type = "checkbox" name="item" value="벨트2">벨트1<br>
	<input type = "checkbox" name="item" value="모자2">모자1
	<input type = "checkbox" name="item" value="시계2">시계1
	<input type = "checkbox" name="item" value="쥬얼리2">쥬얼리1<br>
	<input type="submit" value="전송">
</form>
</body>
</html>