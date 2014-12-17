<!DOCTYPE html>
<html>
	<head>
	  	<title>Social app</title>
	  	<link rel="stylesheet" href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
	  	<script src="https://apis.google.com/js/client:platform.js" async defer></script>
	</head>

	<body>
		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        	<div class="container">
          		<div class="navbar-header">
            		<a class="navbar-brand" href="Futura.html">Social</a>
          		</div>
          		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
	              <li class="active"><a href="/geojson">Home</a></li>
	              <li><a href="geojson">Find position</a><li>
	              <li><a href="createEvent">Create event</a><li>
	              <li><a href="http://www.vg.no">Log out</a><li>
            
            </ul>
          	</div>
        	</div>
    	  </nav>
		<h6>WELCOME!</h6>

		<span id="signinButton">
		  <span
		    class="g-signin"
		    data-callback="signinCallback"
		    data-clientid="932509171625-4gs5h46igrou68blt3cekpobvqv500nr.apps.googleusercontent.com"
		    data-cookiepolicy="single_host_origin"
		    data-requestvisibleactions="http://schema.org/AddAction"
		    data-scope="https://www.googleapis.com/auth/plus.login">
		  </span>
		</span>

		<script type="text/javascript">

		{
  			"id_token": string,
		  	"access_token": string,
		  	"expires_in": string,
		  	"error": string
		  	"status": { /* object */
			    "google_logged_in" : boolean,
			    "signed_in" : boolean,
			    "method" : string /* null, PROMPT, or AUTO */
		  	}
		}

		function signinCallback(authResult) {
			if (authResult['status']['signed_in']) {
	    	// Update the app to reflect a signed in user
	    	// Hide the sign-in button now that the user is authorized, for example:
	    	document.getElementById('signinButton').setAttribute('style', 'display: /geojson');
	  		} 	
	  		else {
	    	// Update the app to reflect a signed out user
	    	// Possible error values:
	    	//   "user_signed_out" - User is signed-out
	    	//   "access_denied" - User denied access to your app
	    	//   "immediate_failed" - Could not automatically log in the user
	    	console.log('Sign-in state: ' + authResult['error']);
  			}
		}

		</script> 

	</body>

</html>