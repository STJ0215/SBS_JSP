package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Http 프로토콜의 요청정보는 헤더와 몸체(body)로 구성되어 있고.
 * 헤더는 두번째 줄 이후부터는 "NAME" : "VALUE" 형태로 헤더 정보가 들어있다.
 */

@WebServlet("/headerInfo")
public class F_SixHeaderInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request URL 정보 출력</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		
		// 헤더 안에 있는 정보중 헤더 이름들만 가져온다.
		Enumeration<String> em = req.getHeaderNames();
		
		while (em.hasMoreElements()) {
			String s = em.nextElement();
			out.print(s + " : " + req.getHeader(s) + "<br>");
		}
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
	
}
