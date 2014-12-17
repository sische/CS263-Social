<!DOCTYPE html>
<html contentType="text/html;charset=UTF-8">
	<head>
	  	<title>Social app</title>
	  	<link rel="stylesheet" href="/stylesheets/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
	  	<script src="https://apis.google.com/js/client:platform.js" async defer></script>
	</head>

	<body>
		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        	<div class="container">
          		<div class="navbar-header">
            		<a class="navbar-brand" href="/geojson">Social</a>
          		</div>
          		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	            <ul class="nav navbar-nav">
	            	<li class="active"><a href="welcome">Sign in</a><li>
		            <li><a href="/geojson">Home</a></li>
		            <li><a href="geojson">Find position</a><li>
		            <li><a href="createEvent">Create event</a><li>
	            </ul>
          		</div>
        	</div>
    	</nav>

    	<div class="col-md-2">
		</div>
		<div class="col-md-6">  
		<p>Please sign in, using a Google account:</p>

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
		  	"status": { 
			    "google_logged_in" : boolean,
			    "signed_in" : boolean,
			    "method" : string 
		  	}
		}

		function signinCallback(authResult) {
			if (authResult['status']['signed_in']) {
	    	document.getElementById('signinButton').setAttribute('style', 'display: /geojson');
	  		} 	
	  		else {
	    	console.log('Sign-in state: ' + authResult['error']);
  			}
		}

		</script> 
	</div>
	<div class="col-md-6">
	</div>
	</body>

</html>