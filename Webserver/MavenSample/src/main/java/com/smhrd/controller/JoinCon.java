package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 데이터 인코딩방식 지정
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		Member vo = new Member(id, pw, nick);
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(vo);

		// 페이지 이동방식(redirecting,forwarding)
		if (cnt > 0) {

			// 가입이 성공했을 경우
			// 1. main.jsp 이동
			// 2. "success" 데이터 보내기
			
			//redirecting, 쿼리스트링 방식 사용해 데이터 전송
			//response.sendRedirect("main.jsp?result=success");//url주소에는공백 존재 x %20 공백이 존재한다는소리
			RequestDispatcher rd= request.getRequestDispatcher("main.jsp");
			request.setAttribute("result","success");
			rd.forward(request, response);
		} else {
			// 가입이 실패 했을경우
			// 1.main.jsp이동
			// 2."fail" 데이터 보내기
			//response.sendRedirect("main.jsp?result=fail");
			RequestDispatcher rd= request.getRequestDispatcher("main.jsp");
			request.setAttribute("result","fail");
			rd.forward(request, response);
		}
	}

}
