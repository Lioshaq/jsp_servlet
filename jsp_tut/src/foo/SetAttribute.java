package foo;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SetAttribute extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		foo.Person p = new foo.Person();
		p.setName("Evan");
		request.setAttribute("person", p);

		RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
		view.forward(request, response);


	}
}
