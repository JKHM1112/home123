<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="itemWrite.jsp">
		<h2>정보 입력 폼</h2>
		<table id="table1">
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name" size="30"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price" size="30"></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea rows="5" cols="50" name="description"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="전송"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>