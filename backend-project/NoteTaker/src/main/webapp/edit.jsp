<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.helper.*,org.hibernate.*,com.Entities.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your Note</title>
 <%@include file="alljs_css.jsp" %>
</head>
<body>
<div class="container-fluid p-0 m-0" >
   <%@include file="navbar.jsp" %>
   <br>
   <%
   int noteId = Integer.parseInt(request.getParameter("note_id").trim());
   Session session2= FactoryProvider.getFactory().openSession();
   Note note = (Note) session2.get(Note.class, noteId);
   %>
   <form action="UpdateServlet" method="post">
   <input value="<%=note.getId() %>" name="noteId" type="hidden">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input name = "title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter Title" value="<%=note.getTitle()%>">
    
  </div>
  <div class="form-group">
    <label for="content">Content</label>
    <textarea name = "content" required id="content" placeholder="Enter your content" class="form-control" style="height:300px"> <%=note.getContent()%> </textarea>
  </div>
  <div class= "container text-center">
  <button type="submit" class="btn btn-success">Save</button>
  </div>
</form>
</body>
</html>