<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1부터 <%= request.getParameter("number") %> 까지 자연수 합 구하기</h1>
	<%
	
	int number = Integer.parseInt(request.getParameter("number"));
	int sum=0;
	for(int i=1; i < number+1; i++){
		sum+=i;
	}
	out.println("1부터  10까지 자연수 합 구하기");
	out.println("<br>");
	for(int i=1; i< number+1; i++){
		out.println(i);
		if(i !=number)	{
				out.println("+");
				}
	}
	
	out.println("="+sum);
	%>
</body>
</html>