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
	//닉네임 세션 하나만 삭제
	session.removeAttribute("id");
	//세션 전부삭제
	session.invalidate();
	
	
	response.sendRedirect("loginform.html");
	
	%>
	
</body>
</html>