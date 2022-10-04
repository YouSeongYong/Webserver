package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		//세션 삭제
				HttpSession session=request.getSession();
//				session.removeAttribute("loginM");
				session.invalidate();
				//main.jsp이동
				
				//(세션 삭제후 이동했을 때 main.jsp에서 로그인/회원가입 버튼만 보여야함
				
			
		return "main.jsp";
	}

}
