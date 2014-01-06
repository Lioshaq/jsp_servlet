package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//PrintWriter out = response.getWriter();
		//response.setContentType("text/html"); 	
		//out.println("Selection");
		String c = request.getParameter("color");
		//List<String> brandsList = be.getBrands(c);
		/*out.println("Color " + c);
		out.println("Advice");
		for(String brand : brandsList){
			out.println("<br>" + brand);
		}*/
		
		BeerExpert be = new BeerExpert();
		List<String> brandsList = be.getBrands(c);
		
		request.setAttribute("styles", brandsList);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");

		view.forward(request, response);

	}
}
