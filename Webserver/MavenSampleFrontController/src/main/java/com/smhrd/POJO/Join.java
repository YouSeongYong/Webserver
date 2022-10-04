package com.smhrd.POJO;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Join implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

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

			// redirecting, 쿼리스트링 방식 사용해 데이터 전송
			// response.sendRedirect("main.jsp?result=success");//url주소에는공백 존재 x %20 공백이
			// 존재한다는소리

			request.setAttribute("result", "success");

		} else {
			// 가입이 실패 했을경우
			// 1.main.jsp이동
			// 2."fail" 데이터 보내기
			// response.sendRedirect("main.jsp?result=fail");

			request.setAttribute("result", "fail");

		}
		return "main.jsp";
	}

}
