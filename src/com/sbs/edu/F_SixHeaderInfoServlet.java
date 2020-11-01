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
 * Http ���������� ��û������ ����� ��ü(body)�� �����Ǿ� �ְ�.
 * ����� �ι�° �� ���ĺ��ʹ� "NAME" : "VALUE" ���·� ��� ������ ����ִ�.
 */

@WebServlet("/headerInfo")
public class F_SixHeaderInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request URL ���� ���</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>��û ��� ����</h3>");
		
		// ��� �ȿ� �ִ� ������ ��� �̸��鸸 �����´�.
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
