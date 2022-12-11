<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
 <%@include file="alljs_css.jsp" %>
</head>
<body>
<div class="container-fluid p-0 m-0" >
   <%@include file="navbar.jsp" %>
   <br>
   <h1> Please fill the details</h1>
   <br> 
<!-- This is form bootstrap -->
<form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input name = "title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter Title">
    
  </div>
  <div class="form-group">
    <label for="content">Content</label>
    <textarea name = "content" required id="content" placeholder="Enter your content" class="form-control" style="height:300px"></textarea>
  </div>
  <div class= "container text-center">
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>
   </div>
</body>
</html>