package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event){
		ServletContext sc = event.getServletContext();

		String dog = sc.getInitParameter("abcdef");
		Dog d = new Dog(dog);

		sc.setAttribute("dog", d);
	}

	public void contextDestroyed(ServletContextEvent event) {
		
	}

}
