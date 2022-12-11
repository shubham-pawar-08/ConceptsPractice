<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.Entities.Note" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Notes</title>
 <%@include file="alljs_css.jsp" %>
</head>
<body>
<div class="container-fluid p-0 m-0" >
   <%@include file="navbar.jsp" %>
   <br>
   <h1 class ="text-uppercase">All notes:</h1>
   <div class="row">
   <div class="col-12">
   <%
   Session s= FactoryProvider.getFactory().openSession();
   Query q = s.createQuery("from Note");
   List<Note> list = q.list();
for(Note note: list)
{
	%>
	<div class="card" mt-3>

	  <img class="card-img-top" style="max-width:50px" src="img/pencil.png" alt="Card image cap">
  	<div class="card-body">
    <h5 class="card-title"><%=note.getTitle()%></h5>
    <p class="card-text"><%=note.getContent()%></p>
    
    <p><b> <%= note.getAddedDate() %></b></p>
    <a href="DeleteServlet?note_id=<%=note.getId()%>" class="btn btn-danger">Delete</a>
     <a href="edit.jsp?note_id=<%=note.getId()%>" class="btn btn-primary">Edit</a>
  </div>
</div>

<% 
}
   s.close();
   %>
   
   </div>
   
   </div>
</body>
</html>