package mavenproject.model;

import java.sql.Time;

import com.google.appengine.repackaged.org.joda.time.DateTime;

public class Activity {
	
	private String place;
	private String description;
	private DateTime time;
	private int maxParticipants;
	
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

}
