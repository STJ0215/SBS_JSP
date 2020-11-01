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
		out.print("<title>Request URL ���� ���</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>��û ��İ� �������� ����</h3>");
		out.print("<br>");
		
		// Ŭ���̾�Ʈ�� ���񽺸� ��û�� ������ ��ü����, �� url�� ��ȯ�Ѵ�.
		out.print("Request URL : " + req.getRequestURL());
		out.print("<br>");
		// Ŭ���̾�Ʈ�� ��û�� ������ ��ȯ�Ѵ�.
		out.print("Request URI : " + req.getRequestURI());
		out.print("<br>");
		// �� ���ø����̼��� ��� ������ ��ȯ�Ѵ�.
		out.print("Context Path : " + req.getContextPath());
		out.print("<br>");
		// ���񽺸� ó���ϸ鼭 ���Ǵ� ���������� ��ü���� ������ ��ȯ�Ѵ�.
		out.print("Request Protocol : " + req.getServletPath());
		out.print("<br>");
		// �� ���ø����̼��� ��Ʈ ���丮�� �������� ������ ��θ� ��ȯ
		out.print("Servlet Path : " + req.getServletPath());
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
}
