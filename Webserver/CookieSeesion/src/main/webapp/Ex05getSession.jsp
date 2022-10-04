<%@page import="java.util.Arrays"%>
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
	//세션 값 가져오기
	//getAttribute 반환타입 : Object >비어 있으면 > null
	String id=(String)session.getAttribute("id");
	Integer age =(Integer)session.getAttribute("age");
	int[] arr=(int[])session.getAttribute("number");
	%>
	
	아이디 : <%=id %> <br>
	나이 : <%=age %>
	<%= Arrays.toString(arr) %>
	<a href="Ex06RemoveSession.jsp">세션삭제</a>
	<a href="Ex07invalidate.jsp">세션 전체 삭제</a>
</body>
</html>