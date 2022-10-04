package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
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
		
		}
		return "main.jsp";
	}

}
