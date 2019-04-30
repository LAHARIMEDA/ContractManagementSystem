<%@page import="model.Supplier"%>
<%@page import="DAO1.SupplierDAOImpl"%>
<%@page import="DAO1.SupplierDAO"%>
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
<title>Insert title here</title>
</head>
<body>
<%
String name="";
if(request.getSession().getAttribute("Current_user_id")==null){
	response.sendRedirect("home.jsp");
	
}else
	{
	name = request.getSession().getAttribute("Current_user_id").toString();
	}
 %>


<%
Supplier obj=new Supplier();
try{
	int sup_id=Integer.parseInt(request.getParameter("sup_id").toString());
	SupplierDAO dao=new SupplierDAOImpl();
	obj=dao.getdet(sup_id);
}
catch(Exception e){}

%>
<div align="right">
<a href="LogoutServlet">Logout</a>


</div>
<table border=1	><tr>
<td>First name : <%=obj.getSupplier_ID() %></td>
<td>First name : <%=obj.getFrist_Name() %></td>
<td>Last name : <%=obj.getLast_Name() %></td>
<td>Age :<%=obj.getAge() %></td>
<td>Gender :<%=obj.getGender() %></td>
<td>Dob :<%=obj.getdOB() %> </td>
<td>Contact Number : <%=obj.getContact_Number() %></td>

<td>Alternate Contact Number :<%=obj.getAlt_contact_number() %></td>

<td>Email ID :<%=obj.getEmail_ID() %></td>
<td>Password : <%=obj.getPassword() %></td>

<td>Address 1 : <%=obj.getAddress_Line_1() %></td>
<td>Address 2 : <%=obj.getAddress_Line_2() %></td>
<td>City : <%=obj.getCity() %></td>
<td>State : <%=obj.getState() %></td>
<td>Zip-code : <%=obj.getZipcode() %></td>
<td><a href="acceptservlet?id=<%=obj.getSupplier_ID() %>">ACCEPT</a></td>
<td><a href="rejectservlet?id=<%=obj.getSupplier_ID() %>">REJECT</a></td>

</tr></table>
</body>
</html>