package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text.html"); 	
		out.println("Selection");
		String c = request.getParameter("color");
		out.println("Color " + c);
	
	}
}
