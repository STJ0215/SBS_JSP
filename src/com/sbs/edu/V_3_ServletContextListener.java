package com.sbs.edu;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/* 
 * ServletContext 객체는 웹 애플리케이션 서비스가 준비되는 시점에 생성되고,
 * 중지될 때 삭제된다.
 *  
 */

public class V_3_ServletContextListener implements ServletContextListener {
	
	public V_3_ServletContextListener() {
		System.out.println("V_3_ServletContextListener 객체 생성!");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 초기화");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 해제");
	}	
}
