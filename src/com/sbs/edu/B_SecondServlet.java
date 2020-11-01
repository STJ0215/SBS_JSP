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
	 * HttpServletRequest�� Ŭ���̾�Ʈ�� ������ ������ ��û������ ó���ϴ� ��ü
	 * HttpServletResponse�� ������ Ŭ���̾�Ʈ�� ������ ���������� ó���ϴ� ��ü
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() �����");
		
		// ��û�� Ŭ���̾�Ʈ�� �������� ����� ��� ��Ʈ��
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>test</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h1>Hava a nice day</h1>");
		out.print("</body>");
		out.print("</html>");
		
		out.close(); // �ڿ�����: �����ߴ� �ڿ��� ���̻� ������� �ʴ´ٸ� �޸𸮿��� ����
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() �����");
	}
}
