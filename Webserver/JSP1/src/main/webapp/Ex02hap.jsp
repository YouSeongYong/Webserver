<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String q="1~100까지의 합 : "; %>
<%!int sum=0; %>
<%!public int add(int num){
	for(int i=1;i<=100;i++){
		sum+=i;
	}
return sum;}
	%>

<%=q  %><%=add(sum) %>
<%="1~100까지의 합 " +add(sum) %>
1~100까지의 합 : <%=add(sum) %>
</body>
</html>