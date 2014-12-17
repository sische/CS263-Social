<!DOCTYPE html>
<html>
	<head>
	  	<title>CreateEvent</title>
	  	<link rel="stylesheet" href="/stylesheets/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
	  	
	</head>

	<body>
    <div class="col-md-1">
    </div>
    <div class="col-md-6">

		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <a class="navbar-brand" href="/geojson">Social</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
            	<li><a href="welcome">Sign in</a><li>
              	<li><a href="/geojson">Home</a></li>
              	<li><a href="geojson">Find position</a><li>
              	<li class="active"><a href="createEvent">Create event</a><li>
            </ul>
          </div>
        </div>
      </nav>
		<br><br><br><br><br>
			<form method="get" action="databaseServlet?gustbookName=Social1">

		  	<fieldset>
		    	<legend>Event name</legend>
		    	<textarea rows="1" cols="30" name="name">Enter event name</textarea>	
		  	</fieldset>
		  	<fieldset>
		    	<legend>Event time (tt.mm.MM.DD.YYYY)</legend>
		    	<textarea rows="1" cols="30" name="time">Enter event time</textarea>	
		  	</fieldset>

		  	<fieldset>
			    <legend>Number of participants</legend>
			    <textarea rows="1" cols="30" name="maxNum">Enter maximum number of participants</textarea>
		  	</fieldset>

		   	<fieldset>
		    	<legend>Event location (XX.XXXXXXXXXXXXXXX)</legend>
		    	<textarea rows="1" cols="30" name="latitude">Enter latitude</textarea>
		    	<textarea rows="1" cols="30" name="latitude">Enter longitude</textarea>
		  	</fieldset>

		  	<fieldset>
		    	<legend>Description</legend>
		    	<textarea rows="5" cols="30" name="description">Enter your description of the event here</textarea>
		  	</fieldset>
		 
		  <input type="hidden" name="secret"/>
		  <input type="submit" value="SEND" />
		  <input type="reset" value="CLEAR" />
		</form>
	</div>
    <div class="col-md-6">
	</body>



</html>