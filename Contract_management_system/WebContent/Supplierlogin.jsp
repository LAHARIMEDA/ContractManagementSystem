<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Login Portal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <h1>
       <center>
              <p style="color: black; font-size: 50px;">Supplier LOGIN</p>
       </center>
</h1>
</head>

  <body background="3.jpg"  style="color:black ;">
<br><br><br><br><br><br><center><center>
<form autocomplete="off" action="SupplierLoginServlet" method="post" style="margin-top:2%;margin-right:40%; margin-left:40%;">
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input type="text" class="form-control" placeholder="Enter Username" name="uname" required />
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
     <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    <input type="password" class="form-control" name="pwd" placeholder="Password" required/>
  </div>
 
  <button type="submit" class="btn btn-success">Sign In</button>
  <a href=" http://localhost:8080/Contract_management_system/SupReg.jsp " ><button type="button" class="btn btn-primary">Register Here </button></a>
</center></center>
</form>

</body>
</html>