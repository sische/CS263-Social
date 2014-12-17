<!DOCTYPE html">
<html>

<%-- //[START all]--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<head>
    <title>Database</title>
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
    <link rel="stylesheet" href="/stylesheets/bootstrap.css">
</head>

<body>
<div class="col-md-6">
</div>
<div class="col-md-6">
<div id="wrapper">
    <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <a class="navbar-brand" href="/geojson">Social</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li><a href="welcome">Sign in</a><li>
              <li class="active"><a href="/geojson">Home</a></li>
              <li><a href="geojson">Find position</a><li>
              <li><a href="createEvent">Create event</a><li>
            </ul>
          </div>
        </div>
      </nav>
      <br><br>
<%
    String databaseName = request.getParameter("databaseName");
    if (databaseName == null) {
        databaseName = "socialDatabase";
    }
    pageContext.setAttribute("databaseName", databaseName);
    UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();
    if (user != null) {
        pageContext.setAttribute("user", user);
%>

<p>Hello, ${fn:escapeXml(user.nickname)}! (You can
    <a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">sign out</a>.)</p>
<%
} else {
%>
<p>Hello!
    <!--<a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Sign in</a>
    to include your name with greetings you post.</p>-->
<%
    }
%>

<%
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    Key databaseKey = KeyFactory.createKey("Database", databaseName);
    Key cancel = KeyFactory.createKey("Cancel", "Cancel");
    // Run an ancestor query to ensure we see the most up-to-date
    // view of the Greetings belonging to the selected Guestbook.
    Query query = new Query("Greeting", databaseKey).addSort("date", Query.SortDirection.DESCENDING);
    List<Entity> greetings = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(5));
    if (greetings.isEmpty()) {
%>
<p>The database '${fn:escapeXml(databaseName)}' has no entries.</p>
<%
} else {
%>
<p>Entries in database '${fn:escapeXml(databaseName)}'.</p>
<%
    for (Entity greeting : greetings) {
        pageContext.setAttribute("greeting_content",
                greeting.getProperty("content"));
 //       pageContext.setAttribute("greeting_content2", 
  //              greeting.getProperty("description")); 
  //      pageContext.setAttribute("greeting_content3", 
  //              greeting.getProperty("name")); 
        if (greeting.getProperty("user") == null) {
%>
<p>An anonymous person wrote:</p>
<%
} else {
    pageContext.setAttribute("greeting_user",
            greeting.getProperty("user"));
%>
<p><b>${fn:escapeXml(greeting_user.nickname)}</b> wrote:</p>
<%
    }
%>
<blockquote>${fn:escapeXml(greeting_content)}</blockquote>
<%
        }
    }
%>

<form action="/databaseServlet" method="post">
    <!--<div><textarea name="content" rows="3" cols="60"></textarea></div> -->
    <div><input type="submit" value="Post Greeting"/></div>
    <input type="hidden" name="databaseName" value="${fn:escapeXml(databaseName)}"/>
</form>
<form action="/geojson" method="post">
    <div><input type="submit" value="Cancel"/></div>
</form>

</div>
    </div>
    <div class="col-md-6">
    </div>
</body>
</html>
<%-- //[END all]--%>