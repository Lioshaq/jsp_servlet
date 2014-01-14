package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ParamTests extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test params <br>");

		Enumeration e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()) {
			String paramName = (String)e.nextElement();
			out.println("name " + paramName + " value " + getServletConfig().getInitParameter(paramName) + "<br>");
		}
	}
}
