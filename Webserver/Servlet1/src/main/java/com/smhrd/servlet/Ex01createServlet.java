package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@ 주석(annotation) : 코드실행에 영향x, 컴파일할 때 영향을 미침
//@WebServlet : URL 맵핑 역할 
@WebServlet("/Ex01")
public class Ex01createServlet extends HttpServlet {
	//객체 데이터를 입출력(스트림(자바 바이트 형태로 바꿔줘야함)-통로)
	//객체 > 바이트배열형태 변환(->직렬화)
	//바이트배열 -> 객체 형태로 변환 (->역직렬화)
	private static final long serialVersionUID = 1L;

	//1.init:서블릿 객체를 초기화하는 역할 
	//맨 처음에 딱 한번만 실행 
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출!");
	}

	
	//2.destroy : 서블릿 객체를 없앰
	//서블릿이 종료될 때 마지막에 딱 한번 자동으로 호출 
	public void destroy() {
		System.out.println("destory 호출!");
	}

	//3.service :클라이언트의 요청 처리 
	//요청 방식(get,post,put,delete...)에 따라 doGet, doPost메서드를 호출하는 역할 
	//HttpServletRequest : HTTP 요청 정보 제공 
	//HttpServletResponse : HTTP 응답 정보 제공 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service호출!");
		doGet(request,response);
		doPost(request,response);
	}

	//클라이언트에서 get 방식으로 요청 시에 호출 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출!");
	}

	//클라이언트에서 post방식으로 요청시에 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost호출!");
	}

}
