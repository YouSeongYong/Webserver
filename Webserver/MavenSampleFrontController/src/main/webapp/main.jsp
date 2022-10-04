<%@page import="com.smhrd.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//회원가입 시 쿼리값 가져오기
	String result = request.getParameter("result");
	//request 영역안에 값 가져오기
	String result1 = (String) request.getAttribute("result");
	if (result != null) {//회원가입을 하고 온 후 라면

		if (result.equals("success")) {
			out.print("<h4>회원가입에 성공했습니다!</h4>");
		} else {//fail이 넘어온 경우 

			out.print("<h4>회원가입에 실패했습니다!</h4>");
		}
	}
	if (result1 != null) {//회원가입을 하고 온 후 라면

		if (result1.equals("success")) {
			out.print("<h4>회원가입에 성공했습니다!</h4>");
		} else {//fail이 넘어온 경우 

			out.print("<h4>회원가입에 실패했습니다!</h4>");
		}
	}
	%>

	<c:if test="${!empty result }">
		<c:choose>
			<c:when test="${result eq 'success'}">
				<h4>회원가입에 성공했습니다!</h4>
			</c:when>
			<c:otherwise>
				<h4>회원가입에 실패했습니다!</h4>
			</c:otherwise>
		</c:choose>

	</c:if>
	<a href="join.jsp"><button>회원가입</button></a>
	<a href="login.jsp"><button>로그인</button></a>
	<!-- 1.로그인 한 사용자의 정보 가져오기 -->
	<%
	Member loginM= (Member)session.getAttribute("loginM");
	if(loginM==null){
		out.print("<h4>로그인 해주세요</h4>");
	}else{ //loginM에 사용자의 정보가 담겨져 있는 경우(로그인 성공)
		out.print("<h4>"+loginM.getNick()+"님 환영합니다</h4>");
	}
	%>
	<c:choose>
	 	<c:when test="${empty loginM }">
	 	<h4>로그인 해주세요</h4>
	 	</c:when>
	 	<c:otherwise>
	 		<h4> ${loginM.nick}님 환영합니다</h4>
	 		<a href="update.jsp"><button>개인정보수정</button></a>
	 		<a href="delete.jsp"><button>회원탈퇴</button></a>
	 		<a href="LogoutCon1.do"><button>로그아웃</button></a>
	 	</c:otherwise>
	</c:choose>
	<!-- 2.로그인을 안한 경우네는 '로그인 해주세요' 화면 출력 -->
	
	<!-- 3.로그인을 한 경우에는 '닉네임 님 환영합니다' 화면 출력 -->
</body>
</html>