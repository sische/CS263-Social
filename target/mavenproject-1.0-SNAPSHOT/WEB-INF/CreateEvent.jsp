<!DOCTYPE html>
<html>
	<head>
	  	<title>CreateEvent</title>
	  	<link rel="stylesheet" href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
	  	
	</head>

	<body>
    <div class="col-md-1">
    </div>
    <div class="col-md-6">

		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <a class="navbar-brand" href="Futura.html">Social</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li><a href="/geojson">Home</a></li>
              <li><a href="geojson">Find position</a><li>
              <li class="active"><a href="createEvent">Create event</a><li>
              <li><a href="http://www.vg.no">Log out</a><li>
            
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

		  	<!--<fieldset>
			    <legend>Personal Particular</legend>
			    Name: <input type="text" name="username" /><br /><br />
			    Password: <input type="password" name="password" /><br /><br />
			    Gender: <input type="radio" name="gender" value="m" checked />Male
			    <input type="radio" name="gender" value="f" />Female<br /><br />
			    Age: <select name = "age">
			      <option value="1">&lt; 1 year old</option>
			      <option value="99">1 to 99 years old</option>
			      <option value="100">&gt; 99 years old</option>
			    </select>
		  	</fieldset> -->
		 
		  <input type="hidden" name="secret" value="888" />
		  <input type="submit" value="SEND" />
		  <input type="reset" value="CLEAR" />
		</form>
	</div>
    <div class="col-md-6">
	</body>



</html>