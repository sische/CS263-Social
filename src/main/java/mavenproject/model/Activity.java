package mavenproject.model;

import java.io.IOException;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.joda.time.DateTime;

public class Activity extends HttpServlet {
	
	private String place;
	private String description;
	private DateTime time;
	private int maxParticipants;
	private boolean addedToDatabase = false;
	private double latitude;
	private double longditude; 
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
	}
	
	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double d) {
		this.latitude = d;
	}


	public double getLongditude() {
		return longditude;
	}


	public void setLongditude(double d) {
		this.longditude = d;
	}
	
	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public DateTime getTime() {
		return time;
	}


	public void setTime(DateTime time) {
		this.time = time;
	}


	public int getMaxParticipants() {
		return maxParticipants;
	}


	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

		
	public Activity(){
		//Activity activity = new Activity();
		
	}

	public static void main(String args[]){
		
	}

	public boolean isAddedToDatabase() {
		return addedToDatabase;
	}

	public void setAddedToDatabase(boolean addedToDatabase) {
		this.addedToDatabase = addedToDatabase;
	}

}
