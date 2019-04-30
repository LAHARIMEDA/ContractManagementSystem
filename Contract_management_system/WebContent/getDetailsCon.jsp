<%@page import="model.Contract"%>
<%@page import="model.TermsAndConditions"%>
<%@page import="model.Amenities"%>
<%@page import="DAO1.ContractDAOImpl"%>
<%@page import="DAO1.TnCDAOImplement"%>
<%@page import="DAO1.AmenitiesDAOImpl"%>
<%@page import="DAO1.TnCDAO"%>
<%@page import="DAO1.AmenitiesDAO"%>
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
<style>
body, html {
  height: 100%;
}

.bg { 
  /* The image used */
  background-image: url("6.jpg");

  /* Full height */
  height: 100%; 
  color: black;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<center><h2>DETAILS OF CONTRACT</h2></center>
<body class="bg">
<div align="right">
<a href="LogoutServlet">Logout</a>


</div>
<%
int cont_id=Integer.parseInt(request.getParameter("cont_id"));

Contract con1=new ContractDAOImpl().getContract(cont_id);
request.getSession().setAttribute("contract_id", cont_id);
%>


<h3>CONTRACT</h3>
<table class="table table-striped"><tr>
 <thead>
      <tr>
       <th> Contract_ID:</th>
        <th>Contract_Description : </th>
        <th>Contract_Processing_Date :</th>
        <th>Contract_Processing_Date :</th>
      </tr>
      </thead>
        <tbody>
      <tr>
<td>Contract_ID:<%=con1.getContract_ID() %></td>

<td> <%=con1.getContract_Description() %></td>
<td> <%=con1.getContract_Processing_Date() %></td>
<td><%=con1.getContract_Submission_Date() %></td>

</tr>
 </tbody></table>
<br><br>
<%
int cont_id1=Integer.parseInt(request.getParameter("cont_id"));

TermsAndConditions TnC=new TnCDAOImplement().getTnC(cont_id);
%>
<h3>TERMS AND CONDITIONS</h3>
<table class="table table-striped"><tr>
<thead>
<tr>
<th>Contract_ID:</th>
<th>Term1 : </th>
<th> Term1: </th>
<th>Term3:</th>
<th>Term4:</th>
<th>Term5:</th>
<th>Condition1:</th>
<th>Condition2:</th>
<th>Condition3:</th>
<th>Condition4:</th>
<th>Condition5:</th>
<th>OtherInfo:</th>
</tr>
</thead>
<tbody>
<tr>
<td><%=TnC.getContract_ID() %> </td>
<td><%=TnC.getTerm1() %></td>
<td><%=TnC.getTerm2() %></td>
<td><%=TnC.getTerm3()%></td>
<td><%=TnC.getTerm4()%></td>
<td><%=TnC.getTerm5()%></td>
<td><%=TnC.getCondition1()%></td>
<td><%=TnC.getCondition2()%></td>
<td><%=TnC.getCondition3()%></td>
<td><%=TnC.getCondition4()%></td>
<td><%=TnC.getCondition5()%></td>
<td><%=TnC.getOther_Info()%></td>
</tr>
</tbody></table>
<br><br>
<%
int cont_id2=Integer.parseInt(request.getParameter("cont_id"));

Amenities amenities=new AmenitiesDAOImpl().getamenities(cont_id);
%>
<h3>AMENITIES</h3>
<table class="table table-striped"><tr>
<thead>
<tr>
<th>Contract_ID:</th>
<th>Amenities1 : </th>
<th> Amenities2: </th>
<th>Amenities3:</th>
<th>Amenities4:</th>
<th>Amenities5:</th>
<th>OtherInfo:</th>
</tr>
</thead>
<tbody>
<tr>
<td><%=amenities.getContract_ID() %></td>
<td><%=amenities.getAmenities1() %></td>
<td><%=amenities.getAmenities2() %></td>
<td><%=amenities.getAmenities3()%></td>
<td><%=amenities.getAmenities4()%></td>
<td><%=amenities.getAmenities5()%></td>
<td><%=amenities.getOther_Info()%></td>
</tr>
</tbody></table>
 &nbsp;&nbsp;&nbsp;
<form action="AcceptContractServlet" method="get">
<center><input type="submit" value="Accept" class="btn btn-success"></center></form>
 &nbsp;&nbsp;&nbsp;
<form action="RejectedContractServlet" method="get">
<center><input type="submit" value="Reject" class="btn btn-danger"></center>
</form>
</body>
</html>
