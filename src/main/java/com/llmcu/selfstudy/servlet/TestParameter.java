package com.llmcu.selfstudy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestParameter extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		 
		/* ************************
		 * ************************
		 * 
		 * 多选框和菜单列表栏用 getParameterValues()方法
		 * 
		 * ************************
		 * ************************
		 * */
		
		String[] hobbies = req.getParameterValues("hobby");
		String[] educations = req.getParameterValues("education");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>" + username + "</h1>");
		out.println("<h1>" + pwd + "</h1>");
		out.println("<h1>" + gender + "</h1>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println("<h1>" + hobbies[i] + "</h1>");
		}
		for (int i = 0; i < educations.length; i++) {
			out.println("<h1>" + educations[i] + "</h1>");
		}
		out.close();
	}

}
