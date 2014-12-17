<!DOCTYPE html>
<html>
  <head>
    <title>Position</title>
    <link rel="stylesheet" href="/stylesheets/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <style>
      html, body, #map-canvas {
        height: 500px;
        width: 500px;
        margin: 10px;
        padding: 50px
        bottom: 50px;
      }
    </style>
    <div class="col-md-2">
    </div>
    <div class="col-md-6">

    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>

    <script>

var map;
var currPos

function initialize() {
  var mapOptions = {
    zoom: 6
  };
  map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);

  if(navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(position) {
      var pos = new google.maps.LatLng(position.coords.latitude,
                                       position.coords.longitude);
      currPos = pos;
      var infowindow = new google.maps.InfoWindow({
        map: map,
        position: pos,
        content: 'Current location'
      });

      //document.write(currPos)

      map.setCenter(pos);
    }, function() {
      handleNoGeolocation(true);
    });
  } else {

    handleNoGeolocation(false);
  }
}

function handleNoGeolocation(errorFlag) {
  if (errorFlag) {
    var content = 'Error: We could not find your current location. Please check that your browser allows to share your location to continue using Social.';
  } else {
    var content = 'Error: Your browser doesn\'t support geolocation. Please allow your browser to share your position to continue using Social. ';
  }

  var options = {
    map: map,
    position: new google.maps.LatLng(60, 105),
    content: content
  };

  var infowindow = new google.maps.InfoWindow(options);
  map.setCenter(options.position);
}

google.maps.event.addDomListener(window, 'load', initialize);

    </script>
  </head>
  <body>

    <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <a class="navbar-brand" href="/geojson">Social</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li><a href="welcome">Sign in</a><li>
              <li><a href="/geojson">Home</a></li>
              <li class="active"><a href="geojson">Find position</a><li>
              <li><a href="createEvent">Create event</a><li>
          </ul>
          </div>
        </div>
      </nav>
    <div id="map-canvas"></div>
  </div>
</div>
    <div class="col-md-3">
      <br><br><br><br><br><br>
    </div>
  </body>
</html>