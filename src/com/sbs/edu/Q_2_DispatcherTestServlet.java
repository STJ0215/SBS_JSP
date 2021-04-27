package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * RequestDispatcher 객체
 * forward(req, resp) 메서드는 클라이언트의 요청으로 생성되는 HttpServletRequest와
 * HttpServletResponse객체를 다른 자원에 전달하고 수행 제어를 완전히 넘겨서 다른 자원의
 * 수행 결과를 클라이언트로 응답하도록 하는 기능의 메서드이다.
 * 
 * 
 */

@WebServlet("/dispatcher2")
public class Q_2_DispatcherTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3>Dispatcher Test2의 수행결과</h3>");
		 
		out.close();
	}
}
