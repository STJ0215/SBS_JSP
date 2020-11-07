package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class J_ServletConfigTestServlet extends HttpServlet {
	/*
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	*/
	
	/*
	 * ServletConfig �� �Ǵٸ� ����
	 * ServletConfig �� �Ǵٸ� ������ HttpServlet ��ü�� �̿��ϴ� ����̴�.
	 * ���� �������� �ۼ��� �� �ݵ�� ��ӹ޾ƾ� �ϴ� HttpSerlve ��ü��
	 * ���󿡼� �ڹ� ���α׷��� ��û�Ǿ� ����� �� �ִ� ������ ������ �ִ� ��ü�̴�.
	 * �׷��� ��� ������ ���� ��ü�� HttpServlet �̴�.
	 * �׸��� HttpServlet ��ü�� GenericServlet �� ��ӹ޴´�.
	 * GenericServlet ��ü ����ϰ� �ִ� �������̽��� ServletConfig �� �ִ�.
	 * GenericServlet ��ü�� ServletConfig ��ü�� ������ �ִ� �޼������ ��� �������ϰ� �ִ�.
	 * ���� ���� ���������� init() �޼��带 ���������� �ʰ��� ServletConfig ��ü�� �޼��带 ����� �� �ִ�.
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String env = this.getInitParameter("charset");
		
		System.out.println("env : " + env);
	}
}
