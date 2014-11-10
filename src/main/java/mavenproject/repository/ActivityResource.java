package mavenproject.repository;

import java.util.ArrayList;
import java.util.List;

import mavenproject.model.Activity;

public class ActivityResource {
	
	List<Activity> currentActivities = new ArrayList<Activity>();
	
	public List<Activity> getCurrentActivities(){
		return currentActivities;
	}
	
	public void addActivity(Activity a){
		currentActivities.add(a);
	}
	
	public void removeActivity(Activity a){
		currentActivities.remove(a);
	}
	
	
	public void createActivity(String desc, int max, String place, DateTime time){
		Activity activity = new Activity();
		
		activity.setDescription(desc);
		activity.setMaxParticipants(max);
		activity.setPlace(place);
		activity.setTime(time);
		
		addActivity(activity);
	}
	
	
}
