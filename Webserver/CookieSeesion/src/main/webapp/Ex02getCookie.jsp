<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키는 마식엉</title>
</head>
<body>
	<%
	//클라이언트가 저장하고 있는 쿠키를 서버로 전송(요청 : request)
	Cookie[] cookies=request.getCookies();
	
	//키 : 값 출력
	for(Cookie c:cookies){
		out.print(c.getName()+" : "+c.getValue()+"<br>");
	}
	%>
	<a href="Ex03RemoveCookie.jsp">쿠키삭제</a>
</body>
</html>