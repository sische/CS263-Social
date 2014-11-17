package mavenproject.user;

import java.util.Set;

import com.google.appengine.api.users.UserService;

public class User implements UserService {
	
	private boolean loggedIn;
	
//	private String username;
//	private String useremail;
//	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getUseremail() {
//		return useremail;
//	}
//	public void setUseremail(String useremail) {
//		this.useremail = useremail;
//	}
	
	
	public User(){
		//User user = new User();
	}
	
	
	@Override
	public String createLoginURL(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return ("http://vg.no");
	}
	@Override
	public String createLoginURL(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String createLoginURL(String arg0, String arg1, String arg2,
			Set<String> arg3) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String createLogoutURL(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String createLogoutURL(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public com.google.appengine.api.users.User getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isUserAdmin() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isUserLoggedIn() {
		// TODO Auto-generated method stub
		return loggedIn;
	}
	

}
