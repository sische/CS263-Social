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
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		if (req.getParameter("testing") == null) {
	      resp.setContentType("text/html");
	      resp.getWriter().println("<br>You need to verify that the information you wrote in is correct: \n\n");

	      RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/Database.jsp");
	      rd.include(req, resp);

	    } else {
	      UserService userService = UserServiceFactory.getUserService();
	      User currentUser = userService.getCurrentUser();

	      if (currentUser != null) {
	        resp.setContentType("text/plain");
//	        resp.getWriter().println("Hello, " + currentUser.getNickname());
	      } 
	    }
	  }
	
		public void addToDatabase(HttpServletRequest request, HttpServletResponse response){
			Activity activity = new Activity();
			ActivityDatabase ad = new ActivityDatabase();
			activity.setDescription(request.getParameter("description"));
			activity.setLatitude(35.99900000);
			activity.setLatitude(-114.0000000);
		}
}