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
	 	//1.삭제할 쿠키의 name과 똑같은 똑같은 name을 가진 쿠키 객체 생성
	 	Cookie cookie=new Cookie("test2","");
	 
	 	//2.유효기간 0으로설정
	 	cookie.setMaxAge(0);
	 	
	 	//3.클라이언트에 쿠키 전송
		response.addCookie(cookie);
	 	
	 	%>
	 	<a href="Ex02getCookie.jsp">쿠키확인</a>
</body>
</html>