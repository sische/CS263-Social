package mavenproject.datastore;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.Properties;

	import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;

import mavenproject.model.Activity;
import mavenproject.model.ActivityDatabase;

public class Database extends HttpServlet {
	  
	
	@Override
	@GET
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws IOException, ServletException {
	    if (req.getParameter("testing") == null) {
	      resp.setContentType("text/html");
	      resp.getWriter().println("<br>You need to verify that the information you wrote in is correct: \n\n");
//	      Properties p = System.getProperties();
//	      String action = req.getParameter("action");
//	      p.list(resp.getWriter());
	      RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/Database.jsp");
//	      resp.getWriter().println("At this time, the JSP-file should have been opened<br>");
//	      if ("include".equalsIgnoreCase(action)) {
	      rd.include(req, resp);
//	      addToDatabase(req, resp);
//			}
	    } else {
	      UserService userService = UserServiceFactory.getUserService();
	      User currentUser = userService.getCurrentUser();

	      if (currentUser != null) {
	        resp.setContentType("text/plain");
//	        resp.getWriter().println("Hello, " + currentUser.getNickname());
	      } else {
//	        resp.sendRedirect(userService.createLoginURL(req.getRequestURI()));
	      }
	    }
	  }
	
		public void addToDatabase(HttpServletRequest request, HttpServletResponse response){
			Activity activity = new Activity();
			ActivityDatabase ad = new ActivityDatabase();
			activity.setDescription(request.getParameter("description"));
//			activity.setMaxParticipants(Integer.parseInt((request.getParameter("maxNum"))));
			activity.setLatitude(35.99900000);
			activity.setLatitude(-114.0000000);
		}
}