<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 전용 페이지</h2>
	<form action="logout.do">
		<table>
			<tr>
				<td>안녕하세요. ${loginUser.name}(${loginUser.userid})님</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="로그아웃"> &nbsp;&nbsp; 
				<input type="button" value="회원정보변경" onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
					<!--로그아웃 버튼을 클릭하면 logout.do가 요청되며 이 요청을 받은 Servlet에서 logout.jsp로 이동시킵니다.-->
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>