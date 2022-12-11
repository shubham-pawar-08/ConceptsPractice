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
if(session.getAttribute("justname")==null){
	response.sendRedirect("login.jsp");	
}
%>

Welcome $(justname)
<a href="login.jsp"> go back</a>
</body>
</html>