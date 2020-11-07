package com.sbs.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * web.xml : 서버가 시작할 때 웹서버가 사용하는 파일
 * 서버에서 서블릿 실행에 관한 정보를 설정할 때 web.xml에 <serlvet> 태그로 설정한다.
 * 서블릿 또는 웹애플리케이션 서비스를 실행하기 위해 존재하는 파일이다.
 */

/*
 * [1] <servlet>
 * <servlet> 태그는 설정하려는 서블릿을 등록한다.
 * <servlet> 태그를 사용하면 반드시 하위 태그로 <servlet-name> 과 <servlet-class> 가 나온다.
 * 
 * [2] <init-param>
 * <init-param> 태그는 서블릿에 변수를 전달할 때 사용한다.
 * 서블릿을 실행하면서 필요한값을 외부에서 전달받아 실행할 수 있다.
 * 서블릿 소스에서 직접 값을 지정해서 사용해도 되지만,
 * 실행환경에 맞게 동적으로 값을 할당하고자 할 때 사용한다.
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
