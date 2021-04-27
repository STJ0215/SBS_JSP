package com.sbs.edu;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class T_2_FlowFilter implements Filter {
	String charset;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init()호출................three");
		charset = filterConfig.getInitParameter("en");
		System.out.println("init param " + charset);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {		
		request.setCharacterEncoding(charset);
		System.out.println("doFilter() 호출 전................three");
		chain.doFilter(request, response);
		System.out.println("doFilter() 호출 후................three");
	}
	
	@Override
	public void destroy() {
		System.out.println("detroy()호출.......................three");
	}
}
