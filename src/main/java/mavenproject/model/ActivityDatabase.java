package mavenproject.model;

import java.util.ArrayList;

public class ActivityDatabase {
	
	protected ArrayList<Activity> currentActivities = new ArrayList<Activity>();
	
	public void addActivity(Activity a){
		currentActivities.add(a);
	}
	
	public ArrayList<Activity> getActivities(){
		return currentActivities;
	}
	
	public String getListOfActivities(){
		
		return null;
	}
	
	public Activity getSpecificActivity(int i){
		return currentActivities.get(i);
	}
	
	
}
