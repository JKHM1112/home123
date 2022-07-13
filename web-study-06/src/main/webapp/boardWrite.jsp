<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="member" class="com.saeyan.javabeans.MemberInfo" />
	<jsp:setProperty name="member" property="*" />
	<h3>입력 완료된 정보</h3>
	<table id="table1">
		<tr>
			<td><b>작성자</b></td>
			<td><jsp:getProperty name="member" property="name" /></td>
		</tr>
		<tr>
			<td><b>비밀번호</b></td>
			<td><jsp:getProperty name="member" property="pass" /></td>
		</tr>
		<tr>
			<td><b>이메일</b></td>
			<td><jsp:getProperty name="member" property="email" /></td>
		</tr>
		<tr>
			<td><b>글 제목</b></td>
			<td><jsp:getProperty name="member" property="title" /></td>
		</tr>
		<tr>
			<td><b>글 내용</b></td>
			<td><jsp:getProperty name="member" property="content" /></td>
		</tr>
	</table>
</body>
</html>