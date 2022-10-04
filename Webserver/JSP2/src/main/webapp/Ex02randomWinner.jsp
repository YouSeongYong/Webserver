<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset align="center">
<legned>랜덤당첨결과</legned>
	<%
	request.setCharacterEncoding("UTF-8");
	String menu=request.getParameter("menu");
	String[] i=request.getParameterValues("i");
	int item=i.length;
	Random rd=new Random();
	
	int num=rd.nextInt(item);
%>
	
<%=i[num] %>

</fieldset>
</body>
</html>