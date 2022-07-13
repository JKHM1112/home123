<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*" %>
<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>

<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="vo" class="com.it.dao.BoardVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	dao.boardInsert(vo);
	response.sendRedirect("list.jsp");
%>
<!-- 여기가 insert로 부터BoardDAO 넘겨 받는 부분이다. -->
<%--<%
	BoardVO vo = new BoardVO();
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String pwd = request.getParameter("pwd");

	vo.setName(name);
	vo.setSubject(subject);
	vo.setContent(content);
	vo.setPwd(pwd);
	
	//DAO 연결 Insert(새글) 입력에 해당되는 부분인거 같다.
	BoardDAO dao2 = new BoardDAO();
	dao2.boardInsert(vo);
	
	//화면이동
	response.sendRedirect("list.jsp");
%>--%>