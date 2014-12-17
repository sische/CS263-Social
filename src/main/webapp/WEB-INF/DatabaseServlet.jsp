<!DOCTYPE html>
<html>

<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreService" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<%@ page import="com.google.appengine.api.datastore.FetchOptions" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page import="com.google.appengine.api.datastore.Query" %>
-->	

	<head>
	  	<title>DatabaseServlet</title>
	  	<link rel="stylesheet" href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css">
    	<link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/> 	
	</head>

	<body>
    <div class="col-md-6">
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
		<form method="get" action="createEvent">
			<input type="back" value="BACK" />
		</form>
	</div>
    <div class="col-md-6">
	</body>
</html>