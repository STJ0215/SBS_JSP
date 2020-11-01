package com.sbs.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/*
 * Servlet�� �Ǳ� ���ؼ��� HttpServlet ��� �ʿ�
 * 
 * ���� ���� ����
 * ������ ���� ������ �����Ϸ��� IoC��� ������ �˾ƾ� �Ѵ�.
 * JAVA SE ���α׷��� �����ڰ� main() �޼��� �ȿ� ������ ������� ����ȴ�.
 * �� ���α׷��� ����Ǵ� ������ �����ڰ� �����Ѵ�.
 * �׷��� JAVA EE ��� ���α׷��� ������ �帧�� �����ڰ� �����ϴ� ���� �ƴ�
 * � ������ ���۽�Ű���� �˰� �ش� ������ �°� �����Ͽ��� �Ѵ�.
 * 
 * ��ó�� �����ڰ� �ƴ� �� 3�ڰ� ���α׷��� ���� �帧�� �����ϴ� ����
 * IoC(Inversion of Control) - '������ ����' �̶� �Ѵ�.
 */

/*
 * web.xml ���Ϸ� �����ϴ� ����� �������� ������ �±׷� ����ϱ� ������ ��ü���� ������ ����.
 * ���� url���� ����Ǿ�� �� ���� �ҽ��� �������� �ʰ� web.xml���� ���� ������ �� �ִ�.
 * 
 * �׸��� @WebServlet (������̼�) ���� ����� �������� ���� �ڹ� �ҽ����� ���� url ������ ������ �� �ִ�.
 * �׷��� �ϳ��� �ڹ� �ҽ��� �ϳ��� ���� ���θ� �����ϹǷ� ���� ���� ������ ���� ������ �ϸ�俬�ϰ� �� �� ����.
 * web.xml�� �����ϴ� ������ٴ� ������������ ��������.
 */

@WebServlet("/first")
public class A_FirstServlet extends HttpServlet {
	
	/*
	 * init() �޼���� ������ ���ʷ� ����Ǿ��� ��
	 * ���� �����̳�(������ �� ������)�� �ڵ����� �����Ѵ�.
	 * ���� ��ü�� ������ ��, �ѹ��� ����ǹǷ� �ú� �ʱ�ȭ �۾��� ����Ѵ�.
	 */
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() �����");
	}
	
	/*
	 * ��û �ø��� ��Ŀ� ������� ������ ����ȴ�.
	 * 
	 */
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() �����");
	}
}
