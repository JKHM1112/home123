<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="msg" value="Hello"></c:set>
\${msg} = ${msg}<br>
<c:set var = "age">
30
</c:set>

\${age} = ${age}<hr>  <!-- 17번쨰 member이 18,19번쨰 member이다. 18,19 name, userid는 java에 있다.-->
<c:set var="member" value= "<%=new com.saeyan.javabeans.MemberBean() %>"></c:set>
<c:set target="${member}" property="name" value="전수빈"></c:set>
<c:set target="${member}" property="userid">pinksubin</c:set>
\${member}=${member}<hr>
\${name}=${member.name}<hr>
\${userid}=${member.userid}<hr>

<c:set var="add" value="${10+5}"></c:set>
\${add} = ${add}<br>
<c:set var="flag" value="${10>5}"></c:set>
\${flag} = ${flag}<br>
<c:set var="flag2" value="${10<5}"></c:set>
\${flag2} = ${flag2}<br>
</body>
</html>