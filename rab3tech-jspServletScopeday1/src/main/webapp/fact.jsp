<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>factorial page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
${email}
<div class="container"> <hr/>
  <h1>factorial form</h1>
  
  <form action="factorialServlet" method="post">
    <div class="form-group">
      <label for="fact">input number:</label>
      <input type="fact" class="form-control" placeholder="Enter number" name="num">
    </div>
    <div class="form-group">
     
    </div>
    
    <button type="submit" class="btn btn-danger">click to get factorial number</button>
  </form>
  
</div><br><br>
Output=${result}<br><br>
<a href="fact2.jsp">click here to get the result on fact2.jsp</a><br>
</body>
</html>