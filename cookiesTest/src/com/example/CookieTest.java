package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		String name = request.getParameter("username");
		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(30*60);
		respone.addCookie(cookie);

		RequestDispatcher view = request.RequestDispatcher("/cookieresult.jsp");
		view.forward(request, response);

	}
}
