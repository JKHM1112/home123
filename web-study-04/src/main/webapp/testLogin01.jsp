<%@page import="java.net.URLEncoder"%>
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
	String id = "jk007125";
	String pwd = "jk007125";
	String name = "이한호";
	
	request.setCharacterEncoding("utf-8");
	if(id.equals(request.getParameter("id"))){
		if(pwd.equals(request.getParameter("pwd"))){
			response.sendRedirect("main01.jsp?name=" + URLEncoder.encode(name, "utf-8"));
		}
		else{
			response.sendRedirect("loginPage01.jsp");
		}
	}else{
			response.sendRedirect("loginPage01.jsp");
	}
	%>
</body>
</html>