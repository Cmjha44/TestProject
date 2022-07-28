<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration page</title>
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
   <img alt="login image" src="image/registration.jpg" style="height: 150px ">
  <h1>Login form</h1>
  
  <form action="RegistrationServlet" method="post">
   <div class="form-group">
      <label for="Name">Name:</label>
      <input type="text" class="form-control" placeholder="Enter your name" name="name">
    </div>
    <div class="form-group">
      <label for="Email">Email:</label>
      <input type="email" class="form-control" placeholder="Enter your email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter your password" name="pswd">
    </div>
     <div class="form-group">
      <label for="Country">Country:</label>
      <input type="text" class="form-control" placeholder="Enter your country" name="country">
    </div>
    
    <button type="submit" class="btn btn-danger">Sign up</button>
  </form>
  <a href="loginpage.jsp">Already a member.</a>
</div>
</body>
</html>