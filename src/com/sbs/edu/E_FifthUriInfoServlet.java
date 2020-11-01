package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/uriInfo")
public class E_FifthUriInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request URL 정보 출력</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("<br>");
		
		// 클라이언트가 서비스를 요청한 문선의 전체정보, 즉 url를 반환한다.
		out.print("Request URL : " + req.getRequestURL());
		out.print("<br>");
		// 클라이언트가 요청한 문서를 반환한다.
		out.print("Request URI : " + req.getRequestURI());
		out.print("<br>");
		// 웹 애플리케이션의 경로 정보를 반환한다.
		out.print("Context Path : " + req.getContextPath());
		out.print("<br>");
		// 서비스를 처리하면서 사용되는 프로토콜의 구체적인 정보를 반환한다.
		out.print("Request Protocol : " + req.getServletPath());
		out.print("<br>");
		// 웹 애플리케이션을 루트 디렉토리를 기준으로 서블릿의 경로를 반환
		out.print("Servlet Path : " + req.getServletPath());
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
}
