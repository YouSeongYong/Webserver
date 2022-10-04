<!-- 지시자 : JSP 페이지의 환경설정 -->
<!-- contentType (UTF-8) > 브라우저에게 인코딩방식 지정 -->
<!-- pageEncoding : JSP 페이지 자체 인코딩 -->
<!-- meta charset : html 코드 인코딩 -->
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
	<!-- 스크립트릿 : 자바코드 -->
	<!-- 스크립트는 지역변수 -->
	<%  int num1=10; %>
	<!-- 선언문 : 메서드, 변수 선언 -->
	<!-- 선언문 안에서는 전역변수 -->
	<%!int num2=20; %>
	
	<%!
	public int add(int num1, int num2){
		return num1+num2;
	}
	
	%>
	
	
	<!-- 표현식 : 값을 화면(브라우저)에 출력하기 위해 사용,변수,상수,메서드호출,연산자 -->
	<%=num1 %>
	<%=add(num1,num2) %>
	<%=num2+10 %>
	
	<% Random rd = new Random(); %>
</body>
</html>