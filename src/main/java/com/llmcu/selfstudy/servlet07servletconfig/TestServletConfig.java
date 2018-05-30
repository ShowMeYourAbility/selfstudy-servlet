package com.llmcu.selfstudy.servlet07servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 1、ServletConfig用来存储登陆的最多人数；
 * 		（1个servlet对应1个servletConfig;
 * 		servlet的生命周期：servletConfig生成于servlet的init()阶段）
 * 2、登陆时，通过ServletContext.setAttribute()登陆人数+1；
 * 		（存储动态数据）
 * 3、InitServlet类用来初始化ServletContext.setAttribute()的初始值为0；
 * 		（InitServlet思想）
 * 
 * 4、登出时，通过ServletContext.setAttribute()登陆人数-1；（不断电和session过期）
 * 5、真实的在线人数统计以后再尝试下，session、redis、定期任务、百度等角度入手
 * 
 * @author Liuling
 *
 */
public class TestServletConfig extends HttpServlet implements Serializable {

	private static final long serialVersionUID = -6048785174240605081L;

	@Override
	public void destroy() {

		super.destroy();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletConfig config = this.getServletConfig();
		String maxOnline = config.getInitParameter("maxOnline");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<p>login success.max online num:"+maxOnline+"</p>");
		out.close();
	}
	
}
