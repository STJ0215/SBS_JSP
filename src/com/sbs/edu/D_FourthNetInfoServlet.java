package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/netInfo")
public class D_FourthNetInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request정보 출력 Servlet</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("<br>");
		
		//클라이언트가 웹서버에 서비스를 요청할 때 사용한 프로토콜 이름을 변환한다.
		out.print("Request Scheme : " + req.getScheme());
		out.print("<br>");
		// 서버의 호스트 이름을 반환하고, 별도의 이름이 없으면 IP주소를 반환한다.
		out.print("Server name : " + req.getServerName());
		out.print("<br>");
		// 클라이언트로부터 서비스를 요청받은 IP주소를 반환한다.
		out.print("Server Address: " + req.getLocalAddr());
		out.print("<br>");
		// 클라이언트로부터 서비스를 요청받은 Port주소를 반환한다.
		out.print("Server Port : " + req.getServerPort());
		out.print("<br>");
		
		// 서비스를 요청한 클라이언트의 호스트 이름을 반환한다.
		out.print("Client Host : " + req.getRemoteHost());
		out.print("<br>");
		// 서비스를 요청한 클라이언트의 IP주소를 반환한다.
		out.print("Client Address : " + req.getRemoteAddr());
		out.print("<br>");
		// 서비스를 요청한 클라이언트의 Port번호를 반환한다.
		out.print("Client Port : " + req.getRemotePort());
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
}
