<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
${message}   // retry---login again
<h2>Login Form</h2>
<form action="LoginServlet" method="post">
  <label for="uname">User Name:</label><br>
  <input type="text" name="username"><br>
  <label for="pass">Password:</label><br>
  <input type="password" name="password" ><br><br>
  <input type="submit" value="Submit">
  <input type="reset" value="Reset">
</form> 
</body>
</html>