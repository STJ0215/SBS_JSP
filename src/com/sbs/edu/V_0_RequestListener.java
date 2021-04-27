package com.sbs.edu;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/*
 * 리스너(Listener)
 * 리스너란 어떠한 일(Event)이 발생하기를 기다리다가 실제 그 일이 발생하였을 때
 * 수행되는 메서드를 가지고 있는 자바 객체이다. 이런 객체를 이벤트 핸들러라고 한다.
 * 
 * 예를들어, 클라이언트로부터 요청이 전달되었을 때, 요청이 끝났을 때, 세션 객체가 생성되거나
 * 삭제되었을 때 그리고 서블릿 컨테이너가 시작되었을 때, 종료 될 때 등 각 시점에 수행될 처리 내용을
 * 구현하여 등록할 수 있으며 이때 활용되는 기술이 바로 리스너이다.
 * 
 * 서블릿에서는 HttpServletRequest, HttpSession 그리고 ServletContext객체와 관련하여
 * 발생하는 여러 이벤트들에 대한 이벤트 핸들러(리스너)를 구현할 수 있다.
 * 
 */
/*
 * 
 * HttpServletRequest 객체는 무조건 클라이언트가 서버에 서비스를 요청할 때마다 생성되며
 * 클라이언트 응답할 때마다 삭제된다.
 * 
 */

public class V_0_RequestListener implements ServletRequestListener {
	
	public V_0_RequestListener() {
		System.out.println("RequestListener 객체 생성!");
	}
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("RequestListener 객체 초기화!");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("RequestListener 객체 해제!");
	}
}
