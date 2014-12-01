package mavenproject.mavenproject;

import javax.servlet.http.HttpServlet;
import mavenproject.model.Activity;

public class GetIPAddress {// extends ServletRequest {
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String ipAddress = request.getRemoteAddr();
//	
//	
//	
//	public LatLng getLocation(Context ctx) 
//	{
//	    LocationManager lm = (LocationManager) ctx.getSystemService(Context.LOCATION_SERVICE);
//	    List<String> providers = lm.getProviders(true);
//
//	    /*
//	     * Loop over the array backwards, and if you get an accurate location,
//	     * then break out the loop
//	     */
//	    Location l = null;
//
//	    for (int i = providers.size() - 1; i >= 0; i--) 
//	    {
//	        l = lm.getLastKnownLocation(providers.get(i));
//	        if (l != null)
//	            break;
//	    }
//	    return new LatLng(l.getLatitude(),l.getLongitude());
//	}
//	
//	public class MainActivity extends Activity {    
//
//		private GPSTracker gpsTracker;
//
//		@Override
//		protected void onCreate(Bundle savedInstanceState) {
//		    super.onCreate(savedInstanceState);
//		    super.setContentView(R.layout.activity_main);
//
//		    gpsTracker = new GPSTracker(context);
//		    Location location = GPSTracker.getLocation();
//		}
//
//
//		@Override
//		protected void onStart() {
//		    gpsTracker.connectToApi();
//		    super.onStart();
//		}
//
//		@Override
//		protected void onStop() {
//		    super.onStop();
//		    if(gpsTracker != null)
//		        gpsTracker.disconnectToApi();
//		}
//
//		}

}
