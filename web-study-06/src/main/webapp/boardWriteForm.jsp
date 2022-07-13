<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h3 {text-align: center;}

#table1 {width: 1000px; margin: 0 auto;}
#table2 {width: 1000px; margin: 0 auto;}
#ftd{background-color: #d0d0d0; border: 0; text-align: center;}
input{float: left;}
</style>
</head>
<body>
<form method="post" action="boardWrite.jsp">
	<h2>게시판 글 쓰기</h2>
	<table id="table1" border="1">
		<tr>
			<td id="ftd"><b>작성자</b></td>
			<td><input type="text" name="name" size="30"></td>
		</tr>
		<tr>
			<td id="ftd"><b>비밀번호</b></td>
			<td><input type="password" name="pass" size="30"> (게시물 삭제시 필요 합니다.)</td>
		</tr>
		<tr>
			<td id="ftd"><b>이메일</b></td>
			<td><input type="text" name="email" size="60"></td>
		</tr>
		<tr>
			<td id="ftd"><b>글 제목</b></td>
			<td><input type="text" name="title" size="90"></td>
		</tr>
		<tr>
			<td id="ftd"><b>글 내용</b></td>
			<td><textarea rows="10" cols="80"  name="content" ></textarea>
		</tr>
	</table>
			<input type="submit" value="등록">
			<input type="reset" value="다시작성">
</form>
</body>
</html>