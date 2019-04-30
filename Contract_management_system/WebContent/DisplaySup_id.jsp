<%@page import="DAO1.SupplierDAOImpl"%>
<%@page import="DAO1.SupplierDAO"%>
<%@page import="model.Supplier"%>
<%@page import="DAO1.StatusDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Status"%>
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
   
 color: black ;
}
h1{
color: white;
}

 </style> 
</head>
<font color="white">
<h2>LIST OF UNAPPROVED SUPPLIERS</h2>
<body  >
<div align="right">
<a href="LogoutServlet">Logout</a>


</div>

 <%  
     List<Supplier> approve = new ArrayList<>();
     SupplierDAO supp = new SupplierDAOImpl();
     approve = supp.notApproved();
     
     %>
     <table class="table table-hover">
       <% for( Supplier temp: approve) { %> 
       <tr><td><a href="getDetails.jsp?sup_id=<%=temp.getSupplier_ID()%>"><%=temp.getSupplier_ID() %></a></td><td><%=temp.getFrist_Name() %></td><td><%=temp.getStatus() %></td></tr>
       
     <%} %>
      
</table>





<h2>LIST OF APPROVED SUPPLIERS</h2>

 <%  
     List<Supplier> sup = new ArrayList<>();
    
     sup = supp.suppliername();
     
     %>
     <table class="table table-hover">
       <% for( Supplier temp: sup) { %> 
       <tr><td><a href="DisplayCon_id.jsp?con_id=<%=temp.getSupplier_ID()%>"><%=temp.getSupplier_ID() %></a></td><td><%=temp.getFrist_Name() %></td><td><%=temp.getStatus() %></td></tr>
       
     <%} %>
     
     
</table>
 </font>
</body>
</html>

