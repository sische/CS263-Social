package mavenproject.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.getWriter().println("<br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome to Social!<br><br>");
	
		performTask(req, resp);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		performTask(request, response);
	}

	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		
		response.setContentType("text/html");
//		String action = request.getParameter("action");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Start.jsp");
		rd.include(request, response);

	}
}
