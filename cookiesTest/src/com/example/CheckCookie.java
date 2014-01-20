package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CheckCookie extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();

		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("username"){
				String username = cookie.getValue();
				out.println("Name " + username);
				break;
			}
		}

	}
}
