package com.sbs.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/*
 * Servlet이 되기 위해서는 HttpServlet 상속 필요
 * 
 * 서블릿 실행 순서
 * 서블릿의 실행 순서를 이해하려면 IoC라는 개념을 알아야 한다.
 * JAVA SE 프로그램은 개발자가 main() 메서드 안에 구현한 순서대로 실행된다.
 * 즉 프로그램이 실행되는 순서를 개발자가 제어한다.
 * 그러나 JAVA EE 기반 프로그램은 실행의 흐름을 개발자가 제어하는 것이 아닌
 * 어떤 순서로 동작시키는지 알고 해당 순서에 맞게 개발하여야 한다.
 * 
 * 이처럼 개발자가 아닌 제 3자가 프로그램의 실행 흐름을 제어하는 것을
 * IoC(Inversion of Control) - '제어의 역전' 이라 한다.
 */

/*
 * web.xml 파일로 설정하는 방식은 여러개의 서블릿을 태그로 등록하기 때문에 전체적인 관리가 쉽다.
 * 또한 url값이 변경되어야 할 때는 소스를 수정하지 않고도 web.xml에서 쉽게 변경할 수 있다.
 * 
 * 그리고 @WebServlet (어노테이션) 설정 방식은 설정파일 없이 자바 소스에서 쉽게 url 패턴을 지정할 수 있다.
 * 그러나 하나의 자바 소스에 하나의 서블릿 맵핑만 가능하므로 여러 개의 서블릿에 대한 정보를 일목요연하게 볼 수 없다.
 * web.xml에 설정하는 방법보다는 유지보수성이 떨어진다.
 */

@WebServlet("/first")
public class A_FirstServlet extends HttpServlet {
	
	/*
	 * init() 메서드는 서블릿이 최초로 실행되었을 때
	 * 서블릿 컨테이너(서블릿에 깔린 스레드)가 자동으로 실행한다.
	 * 서블릿 객체가 생성된 후, 한번만 실행되므로 시블릿 초기화 작업을 담당한다.
	 */
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 실행됨");
	}
	
	/*
	 * 요청 시마다 방식에 상관없이 무조건 실행된다.
	 * 
	 */
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() 실행됨");
	}
}
