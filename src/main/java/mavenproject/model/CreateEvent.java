package mavenproject.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;

public class CreateEvent extends HttpServlet {
	
	Activity activity = new Activity();
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.getWriter().println("<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Create an event!");
		req.getInputStream();
		performTask(req, resp);
		
		String username = req.getParameter("username");
	}

	    
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("Post Project   "+request.getParameter("Name"));

    }
	
	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
		IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/CreateEvent.jsp");
		rd.include(request, response);

	}
}
