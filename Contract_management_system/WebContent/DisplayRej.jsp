<%@page import="sun.security.krb5.internal.crypto.crc32"%>
<%@page import="DAO1.ContractDAO"%>
<%@page import="DAO1.TnCDAO"%>
<%@page import="DAO1.AmenitiesDAO"%>
<%@page import="DAO1.AmenitiesDAOImpl"%>
<%@page import="DAO1.TnCDAOImplement"%>
<%@page import="DAO1.ContractDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Contract"%>
<%@page import="model.TermsAndConditions"%>
<%@page import="model.Amenities"%>
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
<body background="5.jpg"><font color="#E0E6BF">
<h2>Contract</h2>

<div align="right">
<a href="LogoutServlet">Logout</a>


</div>


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
String con  = request.getParameter("id").toString();
Contract contractList = new Contract();
ContractDAO  cr = new ContractDAOImpl();
int con_id = Integer.parseInt(con);
contractList = cr.listconRej(con_id);

String con2  = request.getParameter("id").toString();
Amenities amenities=new Amenities();
AmenitiesDAO  amenities1 = new AmenitiesDAOImpl();
int con_id2 = Integer.parseInt(con2);
amenities=amenities1.getamenities(con_id2);
%>

<form action=EditContractServlet method= "post" autocomplete= "off">
<table width="50%">
<tr> <td><div class="form-group">
    <label for="exampleInputEmail1">Contract ID</label>
    <input type="text" class="form-control" name="contract_id" value = "<%=contractList.getContract_ID() %>" readonly />
    </div>
    </td></tr>
<tr> <td><div class="form-group">
    <label for="exampleInputEmail1">Contract Description</label>
    <input type="text" class="form-control" name="contract_desc" value = "<%=contractList.getContract_Description() %>"required />
    </div></td></tr>
<tr> <td><div class="form-group">
    <label for="exampleInputEmail1">Enter Submission Date</label>
    <input type="date" class="form-control" name="contract_sub_date" value = "<%=contractList.getContract_Submission_Date() %>" required />
  </div></td></tr>
<tr> <td><div class="form-group">
    <label for="exampleInputEmail1">Enter Processing Date</label>
    <input type="date" class="form-control" name="contract_proc_date" value="<%=contractList.getContract_Processing_Date() %>" required />
  </div></td></tr> 
<tr> <td><div class="form-group">
    <label for="exampleInputEmail1">Contract Status</label>
    <input type="text" class="form-control" name="contract_status" value = "<%=contractList.getContract_Status() %>"readonly />
    </div>
    </td>
    </tr>

</table>

<h2>Terms and Conditions</h2>
<% 
String con1  = request.getParameter("id").toString();
TermsAndConditions TnC=new TermsAndConditions();
TnCDAO  TnC1 = new TnCDAOImplement();
int con_id1 = Integer.parseInt(con1);
TnC=TnC1.getTnC(con_id1);
%>


<TABLE WIDTH="80%">
<TR>
<TD>


  <div class="form-group">
    <label for="exampleInputEmail1">Contract ID</label>z
    <input type="text" class="form-control" name="contract_id" value="<%=TnC.getContract_ID()%>" readonly="readonly" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Term 1</label>
    <input type="text" class="form-control"  name="term1" value = "<%=TnC.getTerm1()%>"required />
  </div>
  </TD>
 <td>
 &nbsp;&nbsp;&nbsp;
 </td>
  
 
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 1</label>
    <input type="text" class="form-control"  name="Condition1" value = "<%=TnC.getCondition1()%>" required />
  </div>
  </TD>
   </TR>
    <TR>
  <TD>
   <div class="form-group">
    <label for="exampleInputEmail1">Term 2</label>
    <input type="text" class="form-control"name="term2" value = "<%=TnC.getTerm2()%>" required />
  </div>
  </TD>
 <td>
 &nbsp;&nbsp;&nbsp;
 </td>
  
  
  
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 2</label>
    <input type="text" class="form-control"  name="Condition2" value = "<%=TnC.getCondition2()%>" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 3</label>
    <input type="text" class="form-control"  name="term3" value = "<%=TnC.getTerm3()%>"required />
  </div>
  </TD>
 <td>
 &nbsp;
 </td>

  
  

  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 3</label>
    <input type="text" class="form-control"  name="Condition3" value = "<%=TnC.getCondition3()%>" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 4</label>
    <input type="text" class="form-control" name="term4" value = "<%=TnC.getTerm4()%>" required />
  </div>
  </TD>
 
 <td>
 &nbsp;
 </td>
  

  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 4</label>
    <input type="text" class="form-control"  name="Condition4" value = "<%=TnC.getCondition4()%>" required />
  </div>
  </TD>
  </TR>
  
  <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Term 5</label>
    <input type="text" class="form-control"  name="term5" value = "<%=TnC.getTerm5()%>" required />
  </div>
  </TD>
  
  <td>
  &nbsp;
  </td>
  <TD>
  <div class="form-group">
    <label for="exampleInputEmail1">Condition 5</label>
    <input type="text" class="form-control"  name="Condition5" value = "<%=TnC.getCondition5()%>" required />
  </div>
  </TD>
  </TR>
  
  
 <TR>
  <TD>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Other Info</label>
    <input type="text" class="form-control" name="other_info" value = "<%=TnC.getOther_Info()%>"required />
  </div>
  </TD>
  </TR>
</TABLE>

<h2>Amenities</h2>

<div style="width:50%">

<div class="form-group">
    <label for="exampleInputEmail1">Contract ID</label>
    <input type="text" class="form-control"  name="contract_id" value="<%=amenities.getContract_ID()%>" readonly="readonly" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Amenity 1</label>
    <input type="text" class="form-control"  name="Amenity1" value="<%=amenities.getAmenities1()%>" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 2</label>
    <input type="text" class="form-control"  name="Amenity2" value="<%=amenities.getAmenities2()%>" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 3</label>
    <input type="text" class="form-control"  name="Amenity3" value="<%=amenities.getAmenities3()%>" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 4</label>
    <input type="text" class="form-control"  name="Amenity4" value="<%=amenities.getAmenities4()%>" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Amenity 5</label>
    <input type="text" class="form-control"  name="Amenity5" value="<%=amenities.getAmenities5()%>" required />
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Other Info </label>
    <input type="text" class="form-control"  name="other_info" value="<%=amenities.getOther_Info()%>" required />
  </div>
  <div align="right">
  <button type="submit" class="btn btn-primary"style="font-size:20px; padding : 10px 40px;">Edit</button>
  </div></div></form>
 </font> 
</body>
</html>


       
