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
	//request 영역 안에 값 request(키(String),값(Object))
	request.setAttribute("nick","핑구");
	
	String nick=(String)request.getAttribute("nick");
	
	//forwarding 방식 사용 
	//RequestDispatcher rd= request.getRequestDispatcher("requestscope2.jsp");
	//rd.forward(request,response);
	%>
	
	표현식 : <%=nick %> <br>
	el표기법 : ${nick }
	${requestScope.nick }
	
	<a href="requestscope2.jsp">2로 이동</a>
</body>
</html>