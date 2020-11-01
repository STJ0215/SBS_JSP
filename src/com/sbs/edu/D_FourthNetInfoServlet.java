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
		out.print("<title>Request���� ��� Servlet</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>��Ʈ��ũ ���� ��û ����</h3>");
		out.print("<br>");
		
		//Ŭ���̾�Ʈ�� �������� ���񽺸� ��û�� �� ����� �������� �̸��� ��ȯ�Ѵ�.
		out.print("Request Scheme : " + req.getScheme());
		out.print("<br>");
		// ������ ȣ��Ʈ �̸��� ��ȯ�ϰ�, ������ �̸��� ������ IP�ּҸ� ��ȯ�Ѵ�.
		out.print("Server name : " + req.getServerName());
		out.print("<br>");
		// Ŭ���̾�Ʈ�κ��� ���񽺸� ��û���� IP�ּҸ� ��ȯ�Ѵ�.
		out.print("Server Address: " + req.getLocalAddr());
		out.print("<br>");
		// Ŭ���̾�Ʈ�κ��� ���񽺸� ��û���� Port�ּҸ� ��ȯ�Ѵ�.
		out.print("Server Port : " + req.getServerPort());
		out.print("<br>");
		
		// ���񽺸� ��û�� Ŭ���̾�Ʈ�� ȣ��Ʈ �̸��� ��ȯ�Ѵ�.
		out.print("Client Host : " + req.getRemoteHost());
		out.print("<br>");
		// ���񽺸� ��û�� Ŭ���̾�Ʈ�� IP�ּҸ� ��ȯ�Ѵ�.
		out.print("Client Address : " + req.getRemoteAddr());
		out.print("<br>");
		// ���񽺸� ��û�� Ŭ���̾�Ʈ�� Port��ȣ�� ��ȯ�Ѵ�.
		out.print("Client Port : " + req.getRemotePort());
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}
}
