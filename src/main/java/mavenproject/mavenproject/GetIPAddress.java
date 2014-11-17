package mavenproject.mavenproject;

import javax.servlet.http.HttpServlet;

public class GetIPAddress extends ServletRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ipAddress = request.getRemoteAddr();
	
	

}
