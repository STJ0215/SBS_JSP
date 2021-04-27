package com.sbs.edu;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * HttpSession 객체가 생성되거나 해제되는 시점에 발생하는 이벤트는 HttpSessionEvent이고,
 * 객체에 속성(attribute)을 등록, 추출 그리고 대체하는 시점에 발생하는 이벤트는 
 * HttpSessionBindingEvent이다. 
 * 
 */

public class V_1_SessionListener implements HttpSessionListener {
	
	public V_1_SessionListener() {
		System.out.println("V_1_SessionListener 객체 생성!");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("세션 객체 생성!");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("세션 객체 해제!");
	} 
}
