package mavenproject.user;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@Path("/myservlet")
public class MyServlet extends HttpServlet {
	
	@GET
	@Path("test")
	public String test1(){
		return "In class MyServlet, class test1";
	}
	
//	@Override
//	@GET
//    @Path("/userlogin") //localhost:8080/context/myservlet/test
//    public void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws IOException {
//        UserService userService = UserServiceFactory.getUserService();
//        System.out.println("In class MyServlet, in method doGet");
//        String thisURL = req.getRequestURI();
//
//        resp.setContentType("text/html");
//        if (req.getUserPrincipal() != null) {
//            resp.getWriter().println("<p>Hello, " +
//                                     req.getUserPrincipal().getName() +
//                                     "!  You can <a href=\"" +
//                                     userService.createLogoutURL(thisURL) +
//                                     "\">sign out</a>.</p>");
//        } else {
//            resp.getWriter().println("<p>Please <a href=\"" +
//                                     userService.createLoginURL(thisURL) +
//                                     "\">sign in</a>.</p>");
//        }
//    }
	
}
