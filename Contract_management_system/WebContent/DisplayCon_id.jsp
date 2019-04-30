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
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
body {
height:100%;
   width:100%;
   background-image:url(6.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.6.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='6-.jpg',sizingMethod='scale')";
  color: black;
}

h1 {
  color: black;
}
</style>
  
  
<title>Insert title here</title>
</head>
<div align="right">
<a href="LogoutServlet">Logout</a>


</div>

<body><font color="black">
<h2>LIST OF  CONTRACT ID</h2>
<% 
int sup_id=Integer.parseInt(request.getParameter("con_id").toString());
List<Contract> conList = new ArrayList<>();
ContractDAOImpl contract = new ContractDAOImpl();
conList = contract.listStatus(sup_id);

%> 

<table class="table table-striped">
       <% for( Contract temp: conList) {%> 
       <tr><td><%=temp.getContract_Submission_Date() %></td><td><%=temp.getContract_Processing_Date() %></td><td><button><a href="getDetailsCon.jsp?cont_id=<%=temp.getContract_ID()%>"><%=temp.getContract_ID() %></a></button></td></tr>
       
     <%} %>
     
</table>

</font>
</body>
</html>