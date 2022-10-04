package com.smhrd.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02parameter")
public class Ex02parameter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job=request.getParameter("job");
		String gender=request.getParameter("gender");
		//getParameterValue() : 여러개 값을 가지고 올 때 사용
		//반환타입 : String[]
		String[] hobby=request.getParameterValues("hobby");
	
	System.out.println(job);
	System.out.println(gender);
	System.out.println(Arrays.toString(hobby));
	}

}
