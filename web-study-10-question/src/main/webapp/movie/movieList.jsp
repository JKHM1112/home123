<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 리스트</title>
<link rel="stylesheet" type="text/css" href="css/movie.css">
</head>
<body>
<div id="warp" align="center">
	<h1>리스트</h1>
	<table class="list">
		<tr>
			<td colspan="6" style="border: white; text-align: right;">
				<a href = "movieWrite.do">정보등록</a>
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<th>감독</th>
			<th>배우</th>
			<th>가격</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="movie" items="${movieList}">
		<tr class="record">
			<td>${product.title}</td>
			<td>${product.director}</td>
			<td>${product.actor}</td>
			<td>${product.price}원</td>
			<td><a href="movieUpdate.do?code=${movie.code}">정보 수정</a></td>
			<td><a href="movieDelete.do?code=${movie.code}">정보 삭제</a></td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>