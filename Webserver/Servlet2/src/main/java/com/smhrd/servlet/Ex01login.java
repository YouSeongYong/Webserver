package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01login")
public class Ex01login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청 데이터 인코딩
		//*코드 위치 * : 데이터를 받기 전에 인코딩 먼저 수행 
		
		request.setCharacterEncoding("UTF-8");
		
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		
		System.out.println(id);
		System.out.println(pw);
		//응답데이터 출력
		//응답데이터에 한글이 포함되어 있는 경우에는 인코딩 방식 지정 필수!
		//setCharacterEncoding : 데이터를 인코딩
		response.setCharacterEncoding("UTF-8");
		//setContentType : 응답데이터 형식 지정 웹브라우저 인코딩?
		// > 브라우저에게 응답데이터의 정보를 전달
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(id+"님 환영합니다");
		out.print("</body>");
		out.print("</html>");
	}

}
