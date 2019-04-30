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
              <b><p style="color: tomato; font-size: 50px;">Terms and Conditions</p></b>
       </center>
</h1>
</head>

  <body background="5.jpg"  style="color: #E0E6BF">
<br><br><br><br><br><br><center><center>


<TABLE WIDTH=100%>
<TR>
<TD>
<% int contract_id = new ContractDAOImpl().getLastContract(); %>
<form autocomplete="off" action="TnCServlet" method="post" style="margin-top:2%;margin-right:80%; margin-left:0%;">
  <div class="form-group">
    <label for="exampleInputEmail1">Contract ID</label>
    <input type="text" class="form-control" placeholder="Enter Contract ID" name="contract_id" value="<%=contract_id%>" readonly="readonly" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Term 1</label>
    <p><input type="text" class="form-control" placeholder="Enter Term 1" name="term1" required /></p>
  </div>
  </TD>
 <td>
 &nbsp;&nbsp;&nbsp;
 </td>
  
 
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 1</label>
    <input type="text" class="form-control" placeholder="Enter Condition 1" name="Condition1" required />
  </div>
  </TD>
   </TR>
   
   <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 2</label>
    <input type="text" class="form-control" placeholder="Enter Term 2" name="term2" required />
  </div>
  </TD>
 <td>
 &nbsp;&nbsp;&nbsp;
 </td>
  
  
  
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 2</label>
    <input type="text" class="form-control" placeholder="Enter Condition 2" name="Condition2" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 3</label>
    <input type="text" class="form-control" placeholder="Enter Term 3" name="term3" required />
  </div>
  </TD>
 <td>
 &nbsp;
 </td>

  
  

  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 3</label>
    <input type="text" class="form-control" placeholder="Enter Condition 3" name="Condition3" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 4</label>
    <input type="text" class="form-control" placeholder="Enter Term 4" name="term4" required />
  </div>
  </TD>
 
 <td>
 &nbsp;
 </td>
  

  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 4</label>
    <input type="text" class="form-control" placeholder="Enter Condition 4" name="Condition4" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 5</label>
    <input type="text" class="form-control" placeholder="Enter Term 5" name="term5" required />
  </div>
  </TD>
  
  <td>
  &nbsp;
  </td>
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 5</label>
    <input type="text" class="form-control" placeholder="Enter Condition 5" name="Condition5" required />
  </div>
  </TD>
  </TR>
  
  
 
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Other Info</label>
    <input type="text" class="form-control" placeholder="Enter Other Info(If any)" name="other_info" required />
  </div>
  </TD>
   <TR>
  <TD>
  <center>
 
  <center><button type="submit" class="btn btn-primary">Sign In</button></center>
  </center>
  </TD>
  
  </TR>

</TABLE>
</form>
</body>
</html>