package mavenproject.mavenproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/jerseyws")
public class Jersey {

    @GET
    @Path("/test")
    public String testMethod() {
        return "this is a test \n Now this value has changed";
    }
    
    @GET
    @Path("/maps")
    public String mapsAPI() {
    	Maps map = new Maps();
    	map.TestMethod();
    	return "This message confirms that you are in Class Jersey, method mapsAPI";
    	
    }
    
    @GET
    @Path("/location")
    public String getLocation() {
    	FindLocation 
    }
    
    
    
}

