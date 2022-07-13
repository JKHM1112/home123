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
	request.setCharacterEncoding("utf-8");
%>
	<jsp:useBean id="bean" class="com.mission.javabeans.Itembean"/>
	<jsp:setProperty property="*" name="bean"/>
	<h2>입력 완료된 정보</h2>
	<table id="table1">
			<tr>
				<td>상품명</td>
				<td><jsp:getProperty name="bean" property="name" /></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><jsp:getProperty name="bean" property="price" /></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><jsp:getProperty name="bean" property="description" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="전송"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
</body>
</html>