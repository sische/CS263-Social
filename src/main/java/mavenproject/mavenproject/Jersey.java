package mavenproject.mavenproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/jerseyws")
public class Jersey {

    @GET
    @Path("/test")
    public String testMethod() {
        return "this is a test..!";
    }
}

