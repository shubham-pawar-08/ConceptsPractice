<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">

Enter Username: <input type ="text" name="uname"><br>
Old Password: <input type="password" name="pwd"><br>
New Password:<input type="password" name="npwd"><br>
<button formaction="ChangePassword">Change Password</button>
</form>
<% 
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

%>


</body>
</html>