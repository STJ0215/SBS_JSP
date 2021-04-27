package com.sbs.edu;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/*
 * HttpSession 객체가 생성되거나 해제되는 시점에 발생하는 이벤트는 HttpSessionEvent이고,
 * 객체에 속성(attribute)을 등록, 추출 그리고 대체하는 시점에 발생하는 이벤트는 
 * HttpSessionBindingEvent이다. 
 * 
 */

public class V_2_SessionAttributeListener implements HttpSessionAttributeListener {
	public V_2_SessionAttributeListener() {
		System.out.println("V_2_SessionAttributeListener 객체 생성!");
	}
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 속성 추가");
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 속성 삭제");
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("세션 객체에 추가된 속성 대체");
	}
}
