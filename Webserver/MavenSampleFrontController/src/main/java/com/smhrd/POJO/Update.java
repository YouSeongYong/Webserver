package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Update implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
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
			return "main.jsp";
		}else {
			//3.수정 실패
			//-update.jsp이동
			return "update.jsp";
		}
		
		
	}

}
