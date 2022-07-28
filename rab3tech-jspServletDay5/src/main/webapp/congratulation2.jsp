<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Congratulation</title>
<img src="image/congrats.jpg" alt="congrats jpg">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2> Congratulations----You have successfully signed up.</h2>
   
   
    <table class="table table-striped">
    <thead>
      <tr>
      <th>name</th>
        <th>password</th>
         <th>email</th>
          <th>country</th>
      </tr>
    </thead>
    <tbody>
      <tr>
  		<td>${userDTO.name} </td>
        <td>${userDTO.password} </td>
        <td>${userDTO.email}  </td>
        <td>${userDTO.country}  </td>
  	 </tr>
    </tbody>
  </table>
  <a href="GetAllRecord">Click here to get all records</a>
</div>
</body>
</html>