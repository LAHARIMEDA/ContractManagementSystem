`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<title>Admin Registration Page</title>
<h1>
       <center>
              <b><p style="color: #E0E6BF; font-size: 50px;">ADMIN REGISTRATION</p></b>
       </center>
</h1>
</head>

<body class="container-solid" background="5.jpg"
       style="color: #E0E6BF;">
       <form autocomplete="off" action="AdminRegServlet" method="post" style="margin-top:2%;margin-right:40%; margin-left:7%;">
       
      
   <div class="form-group ">
     <label for="exampleInputEmail1">Enter First Name</label>  
    	
    <input type="text" class="form-control" placeholder="First Name" name="fname" required>
  </div>
  
  	
  <div class="form-group">
     <label for="exampleInputPassword1">Enter Last Name</label>
    <input type="text" class="form-control" name="lname" placeholder="Last Name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Enter Age</label>
    <input type="number" class="form-control" name="age" placeholder="Age" required>
  </div>
  <label for="exampleInputPassword1">Gender</label></br>
              <input type="radio" name="gender" value="male"> Male<br>
              <input type="radio" name="gender" value="female"> Female<br>
              <p></p>
  <div class="form-group">
    <label for="exampleInputPassword1">DOB</label>
    <input type="Date" class="form-control" name="dob" placeholder="dob" required>
  </div>
 <div class="form-group">
    <label for="exampleInputPassword1">CONTACT_NO</label>
    <input type="number" class="form-control" name="conno" placeholder="contact" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">ALT_CONTACT_NO</label>
    <input type="number" class="form-control" name="altconno" placeholder="altconno" required>
  </div>
   </div>
   <div class="form-group">
    <label for="exampleInputPassword1">E-MAIL</label>
    <input type="Email" class="form-control" name="email" placeholder="email" required>
  </div>
   </div>
   <div class="form-group">
    <label for="exampleInputPassword1">PASSWORD</label>
    <input type="text" class="form-control" name="password" placeholder="password" required>
  </div>
  <button type="submit" class="btn btn-primary">REGISTER AS ADMIN</button>
</form>

</body>
</html>
