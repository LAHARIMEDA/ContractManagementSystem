`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
<title>Supplier Registration Page</title>
<h1>
       <center>
              <b><p style="color: #E0E6BF; font-size: 50px;">SUPPLIER REGISTRATION</p></b>
       </center>
</h1>
</head>

<body background="5.jpg" class="container-solid" 
       style="color: #E0E6BF;">
       <form autocomplete="off" action="SupRegServlet" method="post" style="margin-top:2%;margin-right:40%; margin-left:7%;">
       
       
   <div class="form-group">
    <label for="exampleInputEmail1">Enter First Name</label>
    <input type="text" class="form-control" placeholder="First Name" name="fname" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Enter Last Name</label>
    <input type="text" class="form-control" name="lname" placeholder="Last Name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Enter Age</label>
    <input type="text" class="form-control" name="age" placeholder="Age" required>
  </div>
  <label for="exampleInputPassword1">Gender</label></br>
              <input type="radio" name="gender" value="male"> Male<br>
              <input type="radio" name="gender" value="female"> Female<br>
              <p></p>
  <div class="form-group">
    <label for="exampleInputPassword1">DOB</label>
    <input type="text" class="form-control" name="dob" placeholder="dob" required>
  </div>
 <div class="form-group">
    <label for="exampleInputPassword1">CONTACT_NO</label>
    <input type="text" class="form-control" name="conno" placeholder="contact" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">ALT_CONTACT_NO</label>
    <input type="text" class="form-control" name="altconno" placeholder="altconno" required>
  </div>
   </div>
   <div class="form-group">
    <label for="exampleInputPassword1">E-MAIL</label>
    <input type="text" class="form-control" name="email" placeholder="email" required>
  </div>
   </div>
   <div class="form-group">
    <label for="exampleInputPassword1">PASSWORD</label>
    <input type="text" class="form-control" name="password" placeholder="password" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">ADDRESS LINE 1</label>
    <input type="text" class="form-control" name="address1" placeholder="address" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">ADDRESS LINE 2</label>
    <input type="text" class="form-control" name="address2" placeholder="address" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">CITY</label>
    <input type="text" class="form-control" name="city" placeholder="city" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">STATE</label>
    <input type="text" class="form-control" name="state" placeholder="state" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">ZIP CODE</label>
    <input type="text" class="form-control" name="zipcode" placeholder="zipcode" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1"></label>
    <input type="text" class="form-control" name="status" value ="not Approved"hidden>
  </div>
  <button type="submit" class="btn btn-primary">REGISTER AS SUPPLIER</button>
</form>
</body>
</html>
