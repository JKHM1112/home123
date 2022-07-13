<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
<!-- 입력 폼을 수행하기 위해 자바스크립트 파일(member.js)가 필요-->
</head>
<body>
	<h2>로그인</h2>
	<form action="login.do" method="post" name="frm">	<!-- name의 frm은 member.js에서 받는다. -->
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" value="${userid}"></td>
			</tr>	<!-- name의 userid는 member.js에서 받는다. -->
			<tr>
				<td>암 호</td>
				<td><input type="password" name="pwd"></td>
			</tr>	<!-- name의 pwd는 member.js에서 받는다. -->
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인" onclick="return loginCheck()">&nbsp;&nbsp;
					<!-- onclick을 하면 member.js에 loginCheck이 실행된다. --> 
					<input type="reset" value="취소"> &nbsp;&nbsp; 
					<input type="button" value="회원 가입" onclick="location.href='join.do'">
				</td>
			</tr>
			<tr>
				<td colspan="2">${message}</td>
			</tr>
		</table>
	</form>
</body>
</html>