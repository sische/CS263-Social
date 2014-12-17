package mavenproject.mavenproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mavenproject.model.Activity;
import mavenproject.model.ActivityDatabase;

import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.styling.SLD;
import org.geotools.styling.Style;
import org.geotools.swing.JMapFrame;
import org.geotools.swing.data.JFileDataStoreChooser;

/**
 * Prompts the user for a shapefile and displays the contents on the screen in a map frame.
 * <p>
 * This is the GeoTools Quickstart application used in documentationa and tutorials. *
 */
public class Geojson extends HttpServlet {
	/**
	 * @throws IOException 
	 * @throws ServletException 
     * 
     * 
     */
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.getWriter().println("<br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find your position!<br><br>");
	
		performTask(req, resp);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		response.getWriter().println("<br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find your position!<br><br>");
		
		performTask(request, response);
	}

	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		
		checkParameters(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("<br><br><br><tr>      TestServlet says hi<br/>");
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
		String action = request.getParameter("action");
//		String username = request.getParameter("username");
//		System.out.println(username);
//		if (action != null) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Map1.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/MapsPos.jsp");
//			if ("include".equalsIgnoreCase(action)) {
				rd.include(request, response);
				
//			} else if ("forward".equalsIgnoreCase(action)) {
				rd.forward(request, response);
//		}
	
	}
	
	public void checkParameters(HttpServletRequest request, HttpServletResponse response) throws IOException{
		if (request.getParameter("description") != null){
			Activity activity = new Activity();
			ActivityDatabase ad = new ActivityDatabase();
			activity.setDescription(request.getParameter("description"));
			activity.setMaxParticipants(Integer.parseInt((request.getParameter("maxNum"))));
			activity.setLatitude(35.999000000000000);
			activity.setLongditude(-114.000000000000000);
			ad.addActivity(activity);
			response.getWriter().println("The activity was added to the database! It has the value: " + ad.getSpecificActivity(0).getDescription().toString());
		
		displayActivities(request, response, ad);
		
		}
	}

	public void displayActivities(HttpServletRequest request, HttpServletResponse response, ActivityDatabase ad) throws IOException {
		StringBuilder display = new StringBuilder();
		for (int i = 0; i < (ad.getActivities().size()); i++){
			display.append(ad.getSpecificActivity(i).getDescription().toString() + "<br><br>	");
			display.append(String.valueOf(ad.getSpecificActivity(i).getLatitude()) + "	<br>");
			display.append(String.valueOf(ad.getSpecificActivity(i).getLongditude()) + "	<br>");
			display.append(String.valueOf((ad.getSpecificActivity(i).getMaxParticipants())) + "	");	
			ad.getSpecificActivity(i).setAddedToDatabase(true);
		}
		response.getWriter().println("<br><br>These are the activities currently stored in the database: <br><br>" + display.toString());
        // display a data store file chooser dialog for shapefiles
//        File file = JFileDataStoreChooser.showOpenFile("shp", null);
//        if (file == null) {
//            return;
//        }

//        FileDataStore store = FileDataStoreFinder.getDataStore(file);
//        SimpleFeatureSource featureSource = store.getFeatureSource();
//
//        // Create a map content and add our shapefile to it
//        MapContent map = new MapContent();
//        map.setTitle("Quickstart");
//        
//        Style style = SLD.createSimpleStyle(featureSource.getSchema());
//        Layer layer = new FeatureLayer(featureSource, style);
//        map.addLayer(layer);
//
//        // Now display the map
//        JMapFrame.showMap(map);
    }}
		//System.out.println("doGet in Geojson");
		
	
	
//    public static void main(String[] args) throws Exception {

