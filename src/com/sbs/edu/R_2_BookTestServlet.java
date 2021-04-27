package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookOutput")
public class R_2_BookTestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter(); 
		R_3_BookVO book = (R_3_BookVO) req.getAttribute("book");
	 
		out.print("<h3> 책 제목 : " + book.getTitle() + "</h3>");
		out.print("<h3> 책 저자 : " + book.getAuthor() + "</h3>");
		out.print("<h3> 출판사 : " + book.getPublisher() + "</h3>");
		
		out.close();
	}
}
