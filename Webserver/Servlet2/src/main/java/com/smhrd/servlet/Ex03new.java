package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03new")
public class Ex03new extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
	String id=	request.getParameter("id");
	String pw=	request.getParameter("pw");
	String pwck=request.getParameter("pwck");
	String gender=request.getParameter("gender");
	String a=request.getParameter("a");
	String data=request.getParameter("data");
	String[] hobby=request.getParameterValues("hobby");
	String color=request.getParameter("color");
	String speak=request.getParameter("speak");
	
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out=response.getWriter();

	out.print("<html>");
	out.print("<body>");
	out.print("아이디 : " +id);
	out.print("<br>");
	
	out.print("비밀번호 : " +pw);
	if(pw.equals(pwck)) {
		out.print("비밀번호가 맞음");
	}else {
		out.print("비밀번호 안맞음");
	}
	out.print("<br>");
	
	out.print("성별 : "+gender);
	out.print("<br>");
	out.print("혈액형 : "+a);
	out.print("<br>");
	out.print("생일 : "+data);
	out.print("<br>");
	out.print("취미 : "+Arrays.toString(hobby));
	out.print("<br>");
	out.print("좋아하는 색 : "+color);
	out.print("<br>");
	out.print("남기고 싶은말 : "+speak);
	
	
	out.print("</body>");
	out.print("</html>");
	}

}
