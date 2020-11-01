package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second")
public class B_SecondServlet extends HttpServlet {
	
	/*
	 * HttpServletRequest는 클라이언트가 서버에 보내는 요청정보를 처리하는 객체
	 * HttpServletResponse는 서버가 클라이언트로 보내는 응답정보를 처리하는 객체
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 실행됨");
		
		// 요청한 클라이언트와 웹서버간 연결된 출력 스트림
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>test</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h1>Hava a nice day</h1>");
		out.print("</body>");
		out.print("</html>");
		
		out.close(); // 자원해제: 생성했던 자원을 더이상 사용하지 않는다면 메모리에서 해제
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 실행됨");
	}
}
