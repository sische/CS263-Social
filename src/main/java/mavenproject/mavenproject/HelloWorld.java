package mavenproject.mavenproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorld {
	
	    @GET
	    @Path("/test")
	    public String testMethod() {
	        return "this is a test!!";
	    }
	    
	    
	    @Path("/maps")
	    public String mapsAPI(){
	    	return "Maps API is now running";
	    }
	    
}
