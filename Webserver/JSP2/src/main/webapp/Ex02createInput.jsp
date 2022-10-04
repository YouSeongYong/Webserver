<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% int item=Integer.parseInt(request.getParameter("ran"));


%>
<fieldset align="center">
<legend>랜덤당첨 작성</legend>
<form action="Ex02randomWinner.jsp" method="post">
<table >
<tr><td>주제 :</td> <td><input type="text" name="menu"></td></tr>
<br>
<% for(int i=1;i<=item;i++){
	out.print("<tr><td>아이템"+i+"</td><td><input type=text name=i></td><br></tr>");
	}%>
	
</table>
	<input type="submit" value="시작">
</form>
</fieldset>
</body>
</html>