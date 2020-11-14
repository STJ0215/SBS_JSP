package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setcontext")
public class L_3_SetServletContextServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		ServletContext sc = this.getServletContext();
		PrintWriter out = resp.getWriter();
		
		L_4_ShareObj obj1 = new L_4_ShareObj();
		
		obj1.setCount(100);
		obj1.setStr("��ü���� �׽�Ʈ - 1");
		sc.setAttribute("data1", obj1);
		
		L_4_ShareObj obj2 = new L_4_ShareObj();
		
		obj2.setCount(200);
		obj2.setStr("��ü���� �׽�Ʈ - 2");
		sc.setAttribute("data2", obj2);
		out.print("ServletContext ��ü�� ������ ����� �Ͽ����ϴ�");
		out.close();
		
	}
	
}
