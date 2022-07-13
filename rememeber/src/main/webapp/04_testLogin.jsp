<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id1 ="pinksung";
String pwd1="1234";
String name1="성윤정";

request.setCharacterEncoding("utf-8");

if(id1.equals(request.getParameter("id2")) &&
		pwd1.equals(request.getParameter("pwd2")) ){
	response.sendRedirect("04_main.jsp?name2="+
		URLEncoder.encode(name1,"utf-8"));
}else{
	response.sendRedirect("04_loginForm.jsp");
}
%>