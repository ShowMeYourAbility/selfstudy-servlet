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
 * 1��ServletConfig�����洢��½�����������
 * 		��1��servlet��Ӧ1��servletConfig;
 * 		servlet���������ڣ�servletConfig������servlet��init()�׶Σ�
 * 2����½ʱ��ͨ��ServletContext.setAttribute()��½����+1��
 * 		���洢��̬���ݣ�
 * 3��InitServlet��������ʼ��ServletContext.setAttribute()�ĳ�ʼֵΪ0��
 * 		��InitServlet˼�룩
 * 
 * 4���ǳ�ʱ��ͨ��ServletContext.setAttribute()��½����-1�������ϵ��session���ڣ�
 * 5����ʵ����������ͳ���Ժ��ٳ����£�session��redis���������񡢰ٶȵȽǶ�����
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
