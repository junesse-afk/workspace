<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regist.com" id="join_fm">
	<fieldset>
	<legend>회원가입</legend>
	<ul>
	<li><input type="text" id="tid" placeholder="아이디"></li>
	<li><span id="idresult"></span>
	<li><input type="password" placeholder="비밀번호"></li>
	<li><input type="password" placeholder="비밀번호 확인"></li>
	<li><input type="text" placeholder="이름"></li>
	<li><input type="tel"></li>
	<li><input type="text"></li>
	<li><input type="text"></li>
	<li><input type="text"></li>
	<li><input type="date"></li>
	<li><input type="text" placeholder="사업자등록증"></li>
	<li><button type="submit">회원가입</button></li>
	<li><button type="button" onclick="history.back()">돌아가기</button><li>
	</ul>
	</fieldset>
	</form>
	

</body>
</html>