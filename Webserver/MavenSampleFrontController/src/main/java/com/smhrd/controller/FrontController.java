package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.POJO.Delete;
import com.smhrd.POJO.Join;
import com.smhrd.POJO.Login;
import com.smhrd.POJO.Logout;
import com.smhrd.POJO.Update;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 데이터 인코딩방식 지정
		request.setCharacterEncoding("UTF-8");
		
		
		//어디에서 온 요청인지 url 확인 
		String reqUri=request.getRequestURI();
		System.out.println(reqUri);
		String context=request.getContextPath();
		System.out.println(context);
		
		String resUri=reqUri.substring(context.length());
		System.out.println(resUri);
		
		Command comm=null;
		
		if(resUri.equals("/JoinCon.do")) {//forwarding 방식으로 이동
			
			//comm 부모 가져와서 통일
			comm=new Join();
			String des=comm.execute(request, response);
			
			RequestDispatcher rd= request.getRequestDispatcher(des);
			rd.forward(request, response);
			
		}else {//redirecting 방식으로 이동
			if(resUri.equals("/LoginCon.do")) {
				//부모를 받아와 생성
				comm =new Login();
				
				
			}else if(resUri.equals("/UpdateCon.do")) {
				//원래 세줄인걸 줄여서 위에 if 문 처럼 else if 밖으로
				//나가서 하나로 통일
				Update update=new Update();
				String des=update.execute(request, response);
				response.sendRedirect(des);
			}else if(resUri.equals("/DeleteCon.do")){
				comm=new Delete();
			}else if(resUri.equals("/LogoutCon1.do")) {
				comm=new Logout();
			}
			String des=comm.execute(request, response);
			response.sendRedirect(des);
		}
	}

}
