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
	 int num1=Integer.parseInt(request.getParameter("value"));
	int num2=Integer.parseInt(request.getParameter("value2"));
	String a=request.getParameter("a");
	
%>
<% 	if(a.equals("+")){
		out.print(num1+num2);
	}else if(a.equals("-")){
		out.print(num1-num2);
	}else if(a.equals("*")){
		out.print(num1*num2);
		
	}else{
		out.print(num1/num2);
		}
%>






</body>
</html>