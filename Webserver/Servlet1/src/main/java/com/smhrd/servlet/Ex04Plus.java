package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04Plus
 */
@WebServlet("/Ex04Plus")
public class Ex04Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1= Integer.parseInt(request.getParameter("num1"));
		int num2= Integer.parseInt(request.getParameter("num2"));
		String ope= request.getParameter("ope");
		
		//PrintWriter(출력스트림)
		PrintWriter out= response.getWriter();
		out.print("<html>");
		out.print("<body >");
		if(ope.equals("plus")) {
			
			out.print(num1+"+"+num2+"="+(num1+num2)+" ");
			
		}else if(ope.equals("minus")) {
			
			out.print(num1+"-"+num2+"="+(num1-num2)+" ");
		}else if(ope.equals("mul")) {
			
			out.print(num1+"*"+num2+"="+(num1*num2)+" ");
		}else {
			
		out.print(num1+"/"+num2+"="+(num1/num2)+" ");
		}
		out.print("</body>");
		out.print("</html>");
		
	}

}
