<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록</title>
<link rel="stylesheet" type="text/css" href="css/movie.css">
</head>
<body>
<div id="wrap" align="center">
	<h1>영화 등록 - 관리자 페이지</h1>
	<form method="post" enctype="multipart/form-data" name="frm">
		<table>
			<tr>
				<th> 영화 제목 </th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th> 가 격 </th>
				<td><input type="text" name="price"> 원</td>
			</tr>
			<tr>
				<th> 감 독 </th>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<th> 배 우 </th>
				<td><input type="text" name="actor"></td>
			</tr>
			<tr>
				<th> 포스터 </th>
				<td>
				<input type="file" name="poster"><br>
				(주의사항 : 이미지를 변경하고자 할때만 선택하세요.)
				</td>
			</tr>
			<tr>
				<th> 설 명 </th>
				<td><textarea rows="10" cols="80" name="synopsis"></textarea></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="등록" onclick="return movieCheck()">
		<input type="reset" value="다시작성">
		<input type="button" value="목록" onclick="location.href='movieList.do'">
	</form>
</div>
</body>
</html>