<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String[] movieList = { "타이타닉", "시네마 천국", "혹성 탈출", "킹콩" };
	pageContext.setAttribute("movieList", movieList); //뒤에꺼가 앞으로 간다. 앞에 movielist가 16번줄 movielist로 간다.
	%>
	<ul>
		<c:forEach var="movie" items="${movieList}" varStatus="status">
			<c:choose>
				<c:when test="${status.first }">
					<li style="font-weight: bold; color: red;">${movie}</li>
					<li style="font-weight: bold; color: blue;">${movie}</li>
				</c:when>
				<c:otherwise>
					<li>${movie}</li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</ul>

	<c:forEach var="movie" items="${movieList}" varStatus="status">
	${movie} <c:if test="${not status.last}">,</c:if> <!-- 마지막 데이터가 아니면 ,를 붙이겠다. -->
	</c:forEach>
</body>
</html>