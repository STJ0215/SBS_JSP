package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addInfo")
public class G_AdditionalInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request 정보 출력</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("<br>");
		
		out.print("Reuqest Method : " + req.getMethod());
		out.print("<br>");
		
		out.print("Path Info: " + req.getPathInfo());
		out.print("<br>");
		
		out.print("Path Translated : " + req.getPathTranslated());
		out.print("<br>");
		
		out.print("Query String : " + req.getQueryString());
		out.print("<br>");
		
		out.print("Content Length : " + req.getContentLength());
		out.print("<br>");
		
		out.print("Content Type : " + req.getContentType());
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}	
}