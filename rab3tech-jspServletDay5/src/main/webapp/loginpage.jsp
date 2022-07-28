<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>login page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container"> <hr/>
  <h4> ${msg} </h4>
   <img alt="login image" src="image/login.jpg" style="height: 150px ">
  <h1>Login form</h1>
  
  <form action="LoginServlet" method="post">
    <div class="form-group">
      <label for="Email">Email:</label>
      <input type="email" class="form-control" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="pswd">
    </div>
    
    <button type="submit" class="btn btn-danger">Submit</button>
  </form>
  <a href="registration.jsp">Click here to Sign up</a>
</div>
</body>
</html>