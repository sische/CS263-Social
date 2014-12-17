package mavenproject.datastore;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.getWriter().println("These values has been stored to the database: <br><br>");
		
		 UserService userService = UserServiceFactory.getUserService();
		    User user = userService.getCurrentUser();
		
		    String guestbookName = req.getParameter("guestbookName");
		    if (guestbookName == null){
		    	guestbookName = "SocialDatabase";
		    }
		    Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
		    String content = req.getParameter("content");
		    String name = req.getParameter("name");
//		    int maxNum = (int) Integer.parseInt(req.getParameter(maxNum));
		    String latitude = req.getParameter("latitude");
		    String longditude = req.getParameter("longdetude");
		    String description = req.getParameter("description");
		    Date date = new Date();
		    Entity greeting = new Entity("Greeting", guestbookKey);
		    greeting.setProperty("user", user);
		    greeting.setProperty("date", date);
		    greeting.setProperty("content", content);
		    greeting.setProperty("name", name);
//		    greeting.setProperty("maxNum", maxNum);
		    greeting.setProperty("latitude", latitude);
		    greeting.setProperty("longditude", longditude);
		    greeting.setProperty("description", description);
		
		    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		    datastore.put(greeting);
		    
		    RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/DatabaseServlet.jsp");
		    rd.include(req, resp);
		    
		    resp.getWriter().println(greeting.toString());
		    System.out.println("Greeting-object: " + greeting.toString());
		    
		   // resp.sendRedirect("/database?guestbookName=" + guestbookName);
	}
  
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
	    UserService userService = UserServiceFactory.getUserService();
	    User user = userService.getCurrentUser();
	
	    String guestbookName = req.getParameter("guestbookName");
	    Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
	    String content = req.getParameter("content");
	    String name = req.getParameter("name");
//	    int maxNum = (int) Integer.parseInt(req.getParameter(maxNum));
	    String latitude = req.getParameter("latitude");
	    String longditude = req.getParameter("longdetude");
	    String description = req.getParameter("description");
	    Date date = new Date();
	    Entity greeting = new Entity("Greeting", guestbookKey);
	    greeting.setProperty("user", user);
	    greeting.setProperty("date", date);
	    greeting.setProperty("content", content);
	    greeting.setProperty("name", name);
//	    greeting.setProperty("maxNum", maxNum);
	    greeting.setProperty("latitude", latitude);
	    greeting.setProperty("longditude", longditude);
	    greeting.setProperty("description", description);
	    
	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    datastore.put(greeting);
	    
	    resp.getWriter().println(greeting.toString());
	    System.out.println("Greeting-object: " + greeting.getProperty(description).toString());
	    	
	    //resp.sendRedirect("/database?guestbookName=" + guestbookName);
  }
}
