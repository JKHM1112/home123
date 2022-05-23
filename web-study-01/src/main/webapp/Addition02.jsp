<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 자바코드랑 html 코드가 섞여있다. 코딩오류가 나타나면 코드가 보여서 보안에 취약하다-->
	<%	//스크립트릿
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
	%>
	
	<!-- 표현식 -->
	<h1> Addition 합계 계산</h1>
	<%=num1 %> + <%=num2 %> = <%=add %>
	<%=num1/0 %>
</body>
</html>