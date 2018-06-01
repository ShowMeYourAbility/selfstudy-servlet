package com.llmcu.selfstudy.servlet08service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestService extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1、访问流程（init()和destroy()不在此次讨论范围内，只讨论service()）
		//打断点测试发现：Tomcat生成的是RequestFacade（孙子）
		//先访问绿色service(),绿色service()让它访问黄色service()，黄色service()让doGet()之类
		
		//2、其它补充
		//我们常重写黄色service()，因为为用转型什么的。重写绿色service()也是可以的。
		//如果依赖的是javaee-api-5.jar，它只是作为编译不出错的保证，真正运行起来还是要看tomcat自带jar包
	}

	
}
