package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/context")
public class L_ServletContext extends HttpServlet {
	ServletContext sc;
	/*
	// 1. Init �޼��带 �������Ͽ� �����ϴ� ���
	@Override
	public void init(ServletConfig config) throws ServletException {
		sc = config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("Context : " + sc);
		
		out.close();
	}
	*/
	
	/*
	// 2. HttpServlet �� ���� �����ϴ� ���
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		
		out.print("Context : " + sc);
		
		out.close();
	}
	*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		String location = sc.getInitParameter("contextConfig");
		
		out.print("loction : " + location + "<br>");
		out.print("Servlet Version : " + sc.getMajorVersion() + "." + sc.getMinorVersion() + "<br>");
		out.print("Server Info : " + sc.getServerInfo() + "<br>");
		out.print("�� ���ø����̼� ��� : " + sc.getContextPath() + "<br>");
		out.print("�� ���ø����̼� �̸� : " + sc.getServletContextName() + "<br>");
		out.print("���� ���� ���  : " + sc.getRealPath("/index.jsp"));
		
		out.close();
	}
}
