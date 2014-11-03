package mavenproject.mavenproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/jerseyws")
public class Javen2 {

    @GET
    @Path("/test")
    public String testMethod() {
        return "this is a test..!";
    }
}
