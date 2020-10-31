package com.sbs.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;


public class A_FirstServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init() ½ÇÇàµÊ");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() ½ÇÇàµÊ");
	}
}
