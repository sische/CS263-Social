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
		System.out.println(username);
		
	}

	    
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("Post Project   "+request.getParameter("Name"));
//        User user = userService.find(username, password);

//        if (user != null) {
//            request.getSession().setAttribute("user", user);
//            response.sendRedirect("home");
//        }
//        else {
//            request.setAttribute("error", "Unknown user, please try again");
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//        }
    }
	
	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
		IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("<br><br><br><tr>      TestServlet says hi<br/>");
		//RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
		String action = request.getParameter("action");
//		if (action != null) {
		//	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Map1.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/CreateEvent.jsp");
//		if ("include".equalsIgnoreCase(action)) {
			rd.include(request, response);
//		} else if ("forward".equalsIgnoreCase(action)) {
//			rd.forward(request, response);
//		}
		
	}
	
	
	
}
