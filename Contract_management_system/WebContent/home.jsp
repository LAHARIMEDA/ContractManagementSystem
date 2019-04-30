<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<h1>
       <center>
             <font style="color: #E0E6BF; font-size: 50px;"><font face="frozen">Contract Management System (CMS)</font>
       </center>
</h1>
</head>
</head>
<body background="cms2.jpg" style="color: white;" >
<br/>
<br/>

<center>
<div class="container" style="width:500px; height:300px;">
  <div class="btn btn-primary">
    <div class="panel-body"><center><a href="http://localhost:8080/Contract_management_system/Adminlogin.jsp" style="color:#E0E6BF"> &nbsp;&nbsp;&nbsp;ADMIN &nbsp;&nbsp;</a>
  </div>
  </div>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <div class="btn btn-primary">
    <div class="panel-body"><center><a href="http://localhost:8080/Contract_management_system/Supplierlogin.jsp" style="color:#E0E6BF">SUPPLIER</a></center></div></div>
</div>
</center>
<%
if(request.getSession().getAttribute("iddf")==null){	
}else{
	%>
	<p>
Registration Successful</p>
	<%
request.getSession().setAttribute("iddf", null);	
}
%>

<%
if(request.getSession().getAttribute("idde")==null){	
}else{
	%>
	<p>
<center>Registration Successful</center></p>
	<%
request.getSession().setAttribute("idde", null);	
}
%>
</body>
</html>