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


public class Geojson extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.getWriter().println("<br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find your position!<br><br>");
		performTask(req, resp);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

	}

	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		checkParameters(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/MapsPos.jsp");
		rd.include(request, response);
				
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

    }
}
		
