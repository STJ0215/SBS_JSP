package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * web.xml : ������ ������ �� �������� ����ϴ� ����
 * �������� ���� ���࿡ ���� ������ ������ �� web.xml�� <serlvet> �±׷� �����Ѵ�.
 * ���� �Ǵ� �����ø����̼� ���񽺸� �����ϱ� ���� �����ϴ� �����̴�.
 */

/*
 * [1] <servlet>
 * <servlet> �±״� �����Ϸ��� ������ ����Ѵ�.
 * <servlet> �±׸� ����ϸ� �ݵ�� ���� �±׷� <servlet-name> �� <servlet-class> �� ���´�.
 * 
 * [2] <init-param>
 * <init-param> �±״� ������ ������ ������ �� ����Ѵ�.
 * ������ �����ϸ鼭 �ʿ��Ѱ��� �ܺο��� ���޹޾� ������ �� �ִ�.
 * ���� �ҽ����� ���� ���� �����ؼ� ����ص� ������,
 * ����ȯ�濡 �°� �������� ���� �Ҵ��ϰ��� �� �� ����Ѵ�.
 */

public class I_InitParamServlet extends HttpServlet {
	String id;
	String pw;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		id = config.getInitParameter("id");
		pw = config.getInitParameter("pw");
		
		System.out.println(id + " : "+ pw);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("Id : " + id);
		out.print("Pw : " + pw);
		
		out.close();
	}
}
