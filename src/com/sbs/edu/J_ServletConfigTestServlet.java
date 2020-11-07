package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class J_ServletConfigTestServlet extends HttpServlet {
	/*
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	*/
	
	/*
	 * ServletConfig 의 또다른 사용법
	 * ServletConfig 의 또다른 사용법은 HttpServlet 객체를 이용하는 방법이다.
	 * 서블릿 페이지를 작성할 때 반드시 상속받아야 하는 HttpSerlve 객체는
	 * 웹상에서 자바 프로그램이 요청되어 실행될 수 있는 조건을 가지고 있는 객체이다.
	 * 그래서 모든 서블릿의 상위 개체는 HttpServlet 이다.
	 * 그리고 HttpServlet 객체는 GenericServlet 을 상속받는다.
	 * GenericServlet 객체 상속하고 있는 인터페이스에 ServletConfig 가 있다.
	 * GenericServlet 객체는 ServletConfig 객체가 가지고 있는 메서드들을 모두 재정의하고 있다.
	 * 따라서 서블릿 페이지에서 init() 메서드를 재정의하지 않고서도 ServletConfig 객체의 메서드를 사용할 수 있다.
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String env = this.getInitParameter("charset");
		
		System.out.println("env : " + env);
	}
}
