<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--현재 페이지가 에러 페이지임을 설정 --%>
	<%@page isErrorPage="true" %>     <!--4번줄과 13번줄  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	다음과 같은 에러가 발생하였습니다.
	<%= exception.getMessage() %>
</body>
</html>