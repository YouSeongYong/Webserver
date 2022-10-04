package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;


public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		String nick= request.getParameter("nick");
		
		Member vo=new Member(id,pw,nick);
		
		//1.DAO -update 호출
		MemberDAO dao=new MemberDAO();
		int cnt=dao.update(vo);
		
		if(cnt>0) {
			//2.수정 성공
			//-main.jsp이동 :닉네임님 환영합니다
			HttpSession session=request.getSession();
			session.setAttribute("loginM", vo);
			response.sendRedirect("main.jsp");
		}else {
			//3.수정 실패
			//-update.jsp이동
			response.sendRedirect("update.jsp");
		}
			
		
	}

}
