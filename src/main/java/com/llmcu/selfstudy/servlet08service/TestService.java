package com.llmcu.selfstudy.servlet08service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestService extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1���������̣�init()��destroy()���ڴ˴����۷�Χ�ڣ�ֻ����service()��
		//��ϵ���Է��֣�Tomcat���ɵ���RequestFacade�����ӣ�
		//�ȷ�����ɫservice(),��ɫservice()�������ʻ�ɫservice()����ɫservice()��doGet()֮��
		
		//2����������
		//���ǳ���д��ɫservice()����ΪΪ��ת��ʲô�ġ���д��ɫservice()Ҳ�ǿ��Եġ�
		//�����������javaee-api-5.jar����ֻ����Ϊ���벻����ı�֤������������������Ҫ��tomcat�Դ�jar��
	}

	
}
