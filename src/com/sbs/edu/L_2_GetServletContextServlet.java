package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getcontext")
public class L_2_GetServletContextServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		ServletContext sc = this.getServletContext();
		
		PrintWriter out = resp.getWriter();
		
		L_4_ShareObj obj1 = (L_4_ShareObj)sc.getAttribute("data1");
		L_4_ShareObj obj2 = (L_4_ShareObj)sc.getAttribute("data2");
		
		out.print("OBJ 1 : " + obj1.getCount() + " : " + obj1.getStr() + "<br>");
		out.print("OBJ 2 : " + obj2.getCount() + " : " + obj2.getStr() + "<br>");
		
		out.close();
	}
}
