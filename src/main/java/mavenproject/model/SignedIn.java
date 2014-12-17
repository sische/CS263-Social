package mavenproject.model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignedIn extends HttpServlet {
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.getWriter().println("<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Event created!<br><br>");
		req.getInputStream();
		createActivity(req, resp);
	}
	
	public void createActivity(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Activity activity = new Activity();
		activity.setDescription(request.getParameter("description"));
//		activity.setTime(request.getParameter("time"));
		
		response.getWriter().println("Description set to: " + activity.getDescription());		
		
		response.sendRedirect("/geojson?action=include");
	}
	
	
}
