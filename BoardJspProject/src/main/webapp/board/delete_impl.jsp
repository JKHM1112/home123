<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.it.dao.*"%>
    
    <jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>
    
<%
	String no = request.getParameter("no");
	String pwd = request.getParameter("pwd");

	boolean result = dao.boardDelete(Integer.parseInt(no), pwd);
	
	if(result= true){
%>

<%=result%>
		<script type="text/javascript">
			alert("데이터를 삭제했습니다.");
			location.href="list.jsp"
		</script>
<%
}
%>