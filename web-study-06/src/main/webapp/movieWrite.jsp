<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="MovieBean" class="com.mission.javabeans.MovieBean"/>
	<jsp:setProperty property="*" name="MovieBean"/>
	<h2> 입력 완료된 정보 </h2>
	<table>
		<tr>
			<td>제목</td>
			<td><jsp:getProperty property="title" name="MovieBean"/></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><jsp:getProperty property="price" name="MovieBean"/></td>
		</tr>
		<tr>
			<td>감독</td>
			<td><jsp:getProperty property="director" name="MovieBean"/></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><jsp:getProperty property="actor" name="MovieBean"/></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><jsp:getProperty property="synopsis" name="MovieBean"/></td>
		</tr>
		<tr>
			<td>장르</td>
			<td><jsp:getProperty property="genre" name="MovieBean"/></td>
		</tr>
	</table>
</body>
</html>