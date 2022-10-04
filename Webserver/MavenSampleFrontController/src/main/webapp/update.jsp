<%@page import="com.smhrd.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Member loginM= (Member)session.getAttribute("loginM");
	%>
	<form action="UpdateCon.do" method="post">
		ID : <input type="text" name="id" value="<%=loginM.getId()%>" readonly><br>
		PW : <input type="password" name="pw"><br>
		NICK : <input type="text" name="nick" value="${loginM.nick }"><br>
		<input type="submit" value="수정완료">
	
	</form>
</body>
</html>