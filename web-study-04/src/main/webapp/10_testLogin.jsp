<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = "pinksung";
String pwd = "1234";
String name = "성윤정";
//이"id"가 loginForm에 있는 "id"인가
if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
	session.setAttribute("loginUser", name);//sesion에 loginuser에 name을 저장한다.
	response.sendRedirect("10_main.jsp");// main.jsp로 이동한다.
} else {
	response.sendRedirect("10_loginForm.jsp"); //loginForm.jsp로 이동한다.
}
%>