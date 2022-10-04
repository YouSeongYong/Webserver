package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Delete implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session=request.getSession();
		Member loginM=(Member)session.getAttribute("loginM");
		
		
		
		MemberDAO dao= new MemberDAO();
		int cnt=dao.delete(loginM.getId());
		//1.DAO-delete 호출
		//2.삭제 성공
		if(cnt>0) {
			
//			session.removeAttribute("loginM");
			session.invalidate();
			
		}else {
			
		//-main.jsp 이동
		//-닉네임님 환영합니다 안보이게
		//3.삭제 실패
		//-main.jsp이동, 닉네임님 환영합니다
		}
		return "main.jsp";
	}

}
