package com.sbs.edu;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 필터(Filter)
 * 필터는 클라이언트로부터 서블릿이 요청되어 수행할 때 필터링 기능을 제공하기 위한 기술이다.
 * 필터가 수행되는 시점은 요청된 서블릿이 수행되기 전과 후이며, 필터 기능을 사용하여 서블릿의 처리와
 * 유지보수를 더욱 효과적으로 처리할 수 있다. 
 * 
 */

public class S_2_FlowFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init()호출................one");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {		
		/*
		 * FilterChain
		 * FilterChain은 필터가 실행될 때 doFilter() 메서드의 세 번째 인자로 전달되는 객체로서
		 * web.xml파일에 설정한 모든 <filter-mapping>정보를 가지고 있다.
		 * 즉, 클라이언트 요청에 대하여 필터들의 실행 순서를 알고 있는 객체이다.
		 * 하나의 요청에 필터들이 실행되고, 서블릿이 실행될 때 처리 흐름을 제어할 수 있는 객체이다.
		 * 
		 * 만약 doFilter() 메서드에 chain.doFilter() 명령문이 생략된다면,
		 * 실행 흐름은 더이상 진행하지 못하고 현재 메서드에서 끝나버린다.
		 * 
		 */
		System.out.println("doFilter()호출 전................one");
		chain.doFilter(request, response);
		System.out.println("doFilter()호출 후................one");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()호출.......one"); 
	}
}
