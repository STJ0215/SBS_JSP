package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class C_ThirdServlet extends HttpServlet {
	
	/*
	 * �������� Ŭ���̾�Ʈ�� �����͸� �����ϸ鼭 ������� ���� ������ �ִ�.
	 * �װ��� ������ �������� Ÿ�԰� ���ڼ� �����̴�.
	 * ���������� ����� ������ Ÿ�԰� ���ڼ��� �����ؼ� �����߸�
	 * Ŭ���̾�Ʈ�� ���� �����͸� Ÿ�Կ��°� ó���� �� �ְ�,
	 * ���ڵ� �۾��� �� �� �ִ�.
	 * 
	 * �׷��� ������ �� ������ ������� ������ �⺻������ ó���Ѵ�.
	 * ��, ����Ÿ���� text/html, ���ڼ��� 8859_1�� ó���ؾ� �Ѵ�.
	 * �׷��� "<h1>���� �Ϸ�!</h1>"�� ���ڿ��� ������ html�� h1�±׷� ó���ϰ�,
	 * ���ڵ� ���ڼ��� 8859_1�� ó���ϴµ�, 8859_1 ���ڼ��� �ѱ��� �������� �ʴ´�.
	 * ���� �ѱ��� ������ ��µȴ�.
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
				
		out.print("<h1>���� �Ϸ�!</h1>");
		
		out.close();
	}
}
