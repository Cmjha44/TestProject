<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
  <title>All user data</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<div class="container">
<img alt="login emage" src="image/congrats.jpg" style=height:200px;>
  <h2>Congratulations!!! You have successfully logged-in</h2>
            
  <table class="table table-hover">
    <thead>
      <tr bgcolor="blue">
        <th>email</th>
        <th>password</th>
        <th>name</th>
         <th>country</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="tempa">
      <tr bgcolor="pink">
        <td>${tempa.email}</td>
        <td>${tempa.password}</td>
        <td>${tempa.name}</td>
        <td>${tempa.country}</td>
       
      </tr>
    </c:forEach> 
 
    </tbody>

  </table>
</div>



</body>
</html>