package com.llmcu.testService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.ResponseFacade;
/**
 * 重载方法：方法名相同，参数居然可以是子类
 * 
 * @author Liuling
 *
 */
public class TestService {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("execute protected service");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("execute public service");
	}

	public static void main(String[] args) {
		TestService ts = new TestService();
		HttpServletRequest req = new RequestFacade(null);
		HttpServletResponse res = new ResponseFacade(null);
		try {
			ts.service(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
