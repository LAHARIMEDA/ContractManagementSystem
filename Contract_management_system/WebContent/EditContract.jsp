<%@page import="DAO1.ContractDAO"%>
<%@page import="DAO1.ContractDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Contract"%>
<%@page import="java.util.List"%>
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
</head>

<body background="5.jpg" >
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Create/View Contracts</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="ContractReg.jsp">ADD CONTRACT</a></li>
      <li ><a href="LogoutServlet">LOG OUT</a></li>
    </ul>
  </div>
</nav>

<% 
String name="";
try{
if(request.getSession().getAttribute("Current_user_id")==null){
	response.sendRedirect("home.jsp");
	
}else
	{
	name = request.getSession().getAttribute("Current_user_id").toString();
	}

%>



<% 
List<Contract> contractList = new ArrayList<>();
 
name = request.getSession().getAttribute("Current_user_id").toString();

ContractDAO  cr = new ContractDAOImpl();
int sup_id = Integer.parseInt(name);
contractList = cr.listidRej(sup_id);
 
%> 
<h2><font color="white">Contract Details</font></h2>
<br/><br/>
<table class="table table-condensed">
 <thead>
      <tr>
      	<font color="White">
        <th><font size=5>Submission Date</th>
        <th><font size=5>Processing Date</th>
        <th><font size=5>Contract ID</th>
      
      </font>
      </tr>
    </thead>
       <% for( Contract temp: contractList) { %>
       
    <tbody>
       <tr>
       <td><%=temp.getContract_Submission_Date() %></td><td><%=temp.getContract_Processing_Date() %></td><td><button><a href="DisplayRej.jsp?id=<%=temp.getContract_ID() %>"><%=temp.getContract_ID() %></a></button></td></tr></tbody>
       
     <%}
     
     
     }catch(Exception e){}
     
     
     %>
  </table> 
     
</font>
</body>
</html>