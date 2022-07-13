<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이 파일은 red.jsp 입니다. <br>
	브라우저에 배경색이 빨간색으로 나타날까요?<br>
	노란새으로 나타날까요?<br>
	forward 액션 태그가 실행되면 이 페이지의 내용은 출력되지 않습니다.<br>
	<jsp:forward page="08_yellow.jsp"/>
	<!-- jsp:forward는 jsp에서 다른 jsp페이지로 요청 처리를 전달할때 사용됩니다. -->
</body>
</html>