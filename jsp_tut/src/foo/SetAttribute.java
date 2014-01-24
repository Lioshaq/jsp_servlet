package foo;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SetAttribute extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		String[] list = {"aaa", "bbb", "ccc", "ddd"};
		request.setAttribute("list", list);

		RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
		view.forward(request, response);


	}
}
