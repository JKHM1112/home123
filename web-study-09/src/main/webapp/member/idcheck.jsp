<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/member.js"></script>
<title>중복체크</title>
</head>
<body>
	<h2>아이디 중복확인</h2>
	<form action="idCheck.do" method="get" name="frm">
		아이디 : <input type="text" name="userid" value="${userid}" >
		<input type="submit" value="중복 체크" > <br>	<!-- idCheck.do가 요청되어 또다시 아이디 중복 체크를 진행합니다. -->
		
		<c:if test = "${result == 1 }">	<!-- result 값이 1이면 이미 사용 중인 아이디 임으로 사용중이라고 출력문장이 나온다. -->
				<script type="text/javascript">
				opener.document.frm.userid.value = "";	//회원 가입 폼에서 입력받은 아이디를 지웁니다
			</script>
			${userid}는 이미 사용 중인 아이디입니다.
		</c:if>
		
		<c:if test = "${result == -1 }">	<!--서블릿에서 넘겨준 result 갑시 -1이면 <사용>버튼이 나타나며 자바스크립트 함수(member.js) idok()가 호출된다.-->
			${userid}는 사용 가능한 아이디입니다.
			<input type="button" value="사용" class="cancel" onclick="idok('${userid}')">
		</c:if>
	</form>
</body>
</html>