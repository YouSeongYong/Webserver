package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;


public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		Member vo=new Member(id,pw);
		
		MemberDAO dao=new MemberDAO();
		Member loginM=dao.login(vo);
		
		
		if(loginM!=null) {
		//로그인 성공
		//1. main.jsp
		//2.현재 로그인한 사용자의 정보 서버에 저장 >세션
		HttpSession session=request.getSession();
		session.setAttribute("loginM", loginM);
		response.sendRedirect("main.jsp");
		}else {
		//로그인 실패
		//1.main.jsp로 이동
		response.sendRedirect("main.jsp");
		}
	}

}
