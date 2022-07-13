<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	h1, h3 { text-align: center;}
	table{ margin : 0 auto;}
</style>
</head>
<body>
<h1>�� ���</h1>
<h3>${userName}�� ȯ���մϴ�... <a href="logout.do">Log-out</a></h3>

<div>
<form action="getBoardList.do" method="post">
	<table border="1" style="width: 700px;">
		<tr>
			<td align="right">
				<select name="searchCondition">
				<c:forEach items="${conditionMap }" var="option">
					<option value="${option.value}">${option.key}
				</c:forEach>
				</select>
				<input type="text" name="searchKeyword">
				<input type="submit" value="�˻�">
			</td>
		</tr>
	</table>
</form>

<table border="1" style="width: 700px">
	<tr>
		<th bgcolor="orange" width="100">��ȣ</th>
		<th bgcolor="orange" width="200">����</th>
		<th bgcolor="orange" width="150">�ۼ���</th>
		<th bgcolor="orange" width="150">�����</th>
		<th bgcolor="orange" width="100">��ȸ��</th>
	</tr>
	<c:forEach items="${boardList }" var="board">
	<tr>
		<td>${board.seq }</td>
		<td><a href="getBoard.do?seq=${board.seq }">
		${board.title }</a></td>
		<td>${board.writer }</td>
		<td>${board.regDate }</td>
		<td>${board.cnt }</td>
	</tr>
	</c:forEach>
</table>
<br>
<div style="text-align: center;">
	<a href="insertBoard.jsp">���� ���</a>
</div>
</div>
</body>
</html>