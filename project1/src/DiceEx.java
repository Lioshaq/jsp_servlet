import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DiceEx extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		String d1 = Integer.toString((int)(Math.random()*6) + 1);
		String d2 = Integer.toString((int)(Math.random()*6) + 1);
		out.println("<html> " + "<body> " +
								"<h1 align=center>Chapter 2</h1>" +
								"<br>" + d1 + " dice " + d2 + "</body></html>");	
	}
}
