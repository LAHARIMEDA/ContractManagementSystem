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

</head>

  <body background="5.jpg" style="color: #E0E6BF;">
    <h1>
       <center>
              <p style="color: #E0E6BF; font-size: 50px;"><font face="frozen">Contract Registration Portal</font></p>
       </center>
</h1>
<br><br><br><br><br><br><center><center>
<form autocomplete="off" action="ContractCreateServlet" method="post" style="margin-top:2%;margin-right:30%; margin-left:30%;">

  <div class="form-group">
    <label for="exampleInputEmail1">Contract Description</label>
    <input type="text" class="form-control" placeholder="Enter Contract Description" name="contract_desc" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Submission Date</label>
    <input type="date" class="form-control" placeholder="Enter Contract Submission date" name="contract_sub_date" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Processing Date</label>
    <input type="date" class="form-control" placeholder="Enter Contract Processing date" name="contract_proc_date" required />
  </div>                                                                                                                                                      

  <button type="submit" class="btn btn-primary">Sign In</button>
  
</center></center>
</form>

</body>
</html>