<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

 response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");	
}

%>
Welcome ${username}
<a href ="videos.jsp" input type ="button" > For Videos </a>
<form action="logout">
<input type="submit" value ="Logout">
</form>
</body>
</html>