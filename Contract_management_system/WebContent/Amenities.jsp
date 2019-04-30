<%@page import="DAO1.ContractDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login Portal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <h1>
       <center>
              <p style="color: #B25B54; font-size: 50px;"><font face="frozen">Amenities Provided</font></p>
       </center>
</h1>
</head>

  <body background="5.jpg" style="color: #E0E6BF;">
<br><br><br><br><br><br><center><center>
<% int contract_id = new ContractDAOImpl().getLastContract(); %>
<form autocomplete="off" action="AmenitiesServlet" method="post" style="margin-top:2%;margin-right:30%; margin-left:30%;">
  <div class="form-group">
    <label for="exampleInputEmail1">Contract ID</label>
    <input type="text" class="form-control" placeholder="Enter Contract ID" name="contract_id" value="<%=contract_id%>" readonly="readonly" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Amenity 1</label>
    <input type="text" class="form-control" placeholder="Enter Amenity 1" name="Amenity1" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 2</label>
    <input type="text" class="form-control" placeholder="Enter Amenity 2" name="Amenity2" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 3</label>
    <input type="text" class="form-control" placeholder="Enter Amenity 3" name="Amenity3" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 4</label>
    <input type="text" class="form-control" placeholder="Enter Amenity 4" name="Amenity4" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 5</label>
    <input type="text" class="form-control" placeholder="Enter Amenity 5" name="Amenity5" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Other Info </label>
    <input type="text" class="form-control" placeholder="Enter Other Info" name="other_info" required />
  </div>
  <button type="submit" class="btn btn-primary">Sign In</button>
  
</center></center>
</form>

</body>
</html>