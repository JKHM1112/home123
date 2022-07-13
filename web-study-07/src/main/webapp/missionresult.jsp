<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.userid}
<c:choose>
	<c:when test="${param.admin == 1}">사용자로</c:when>
	<c:when test="${param.admin == 2}">관리자로</c:when>
</c:choose>
로그인하셨습니다.	
</body>
</html>