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
		//다른 페이지영역에 저장된 값은 가지고 올수 없음
	String nick=(String)pageContext.getAttribute("nick1");
	%>
	
	<%=nick %>
	${nick1 }
</body>
</html>