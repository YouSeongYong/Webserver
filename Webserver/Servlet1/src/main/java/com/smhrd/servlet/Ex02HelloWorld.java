package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02HelloWorld")
public class Ex02HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//printWriter : 텍스트 출력(서버>클라이언트) 스트림(통로)
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body style='background-color : lightblue;'>");
		out.print("<h1>hello world</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
