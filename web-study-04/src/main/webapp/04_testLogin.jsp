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
		String id = "pinksun";
		String pwd = "1234";
		String name = "성윤정";
		//사용자 데이터를 읽어오자 getParameter
		request.setCharacterEncoding("utf-8");
		if(id.equals(request.getParameter("id"))){
			if(pwd.equals(request.getParameter("pwd"))){
				response.sendRedirect("04_main.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
			}
			else{
				response.sendRedirect("04_loginForm.jsp");
			}
		}else{
				response.sendRedirect("04_loginForm.jsp");
		}
		//성공하면 04_main으로 넘어가고 실패하면 04_loginForm화면에 그대로 남는다.
	%>
</body>
</html>