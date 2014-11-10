package mavenproject.mavenproject;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("maps")
public class Maps extends HttpServlet {
	//Class to create the API of Google Maps
	
	//<iframe width="600" height="450" frameborder="0" style="border:0" src="https://www.google.com/maps/embed/v1/view?zoom=12&center=34.4208%2C-119.6982&key=AIzaSyDUVRWdfOz13o7qpe_qF034-EdqIFtRK2o">
    
	//</iframe>	
	
	//Constructor to make a map interface on the web page
	public Maps(){
		System.out.println("We are now in the constructor, in the class Maps");
		
	}
	@GET
	@Path("testmethod")
	public String TestMethod(){
		return "You are now in class Maps, in the main constructor. You are here because a maps object was created. ";
		
	}
	
	@GET
	@Path("current")  // http://localhost:8080/context/maps/current
	@Produces(MediaType.TEXT_HTML)
	public String returnMap(){
		Maps currentMap = new Maps();
		servletResponse.sendRedirect("")
		return "<!DOCTYPE html>"+"<html>"+"<head>"+"<style>"+"#map_canvas"+"{width: 500px; height: 400px;} "+"</style>"
				+ "<script src'https://maps.googleapis.com/maps/api/js'>"+"</script>"
						+ "<script>"+"function initialize() {"+"var mapCanvas = document.getElementById('map_canvas');"
								+ "var mapOptions = {"+"center: new google.maps.LatLng(44.5403, -78.5463),"+"zoom: 8,"
										+ "mapTypeId: google.maps.MapTypeId.ROADMAP}"+"var map = new google.maps.Map(mapCanvas, mapOptions)}"
							+"google.maps.event.addDomListener(window, 'load', initialize);"+"</script>"+"</head>"+"<body>"
									+ "<div id='map_canvas'>"+"</div>"+"</body>"+"</html>";
		
	}
	
	@GET
	@Path("testpath")
	public String testReturnHtml(){
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}
	
	
	
}
