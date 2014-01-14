package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class ListenerTester extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("test context attributes <br>");

		Dog dog = (Dog) this.getServletContext().getAttribute("dog");

		out.println("Dog " + dog.getBreed());

	}
}
