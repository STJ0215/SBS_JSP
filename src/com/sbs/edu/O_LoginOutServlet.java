package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logProc")
public class O_LoginOutServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		if (id.isEmpty() || pw.isEmpty()) {
			out.print("ID �Ǵ� PW�� �Է��� �ּ���!");
			
			return;
		}
		
		HttpSession session = req.getSession();
		
		if (session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			out.print("�α��� �Ϸ�!");
		}
		else {
			out.print("���� �α��� �����Դϴ�");
		}
		
		out.close();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		
		if (session != null && session.getAttribute("id") != null) {
			session.invalidate();
			
			out.print("�α׾ƿ� �Ϸ�!");
		}
		else {
			out.print("���� �α��� ���°� �ƴմϴ�");
		}
		
		out.close();
	}
	
}
