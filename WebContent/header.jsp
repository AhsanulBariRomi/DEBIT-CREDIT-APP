<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>header</title>
</head>
<body>
<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); // Proxies


if(session.getAttribute("loggedinUser")==null){
	response.sendRedirect("userLogin.jsp");
}

%>

	<div class="topnav">
	  <a href="profileAction">Profile</a>
	  <a href="userWelcomeAction">Customer List</a>
	  <a href="addCustomer.jsp">OPEN NEW CUSTOMER ACCOUNT</a>
	  <a href="userLogoutAction" style="float:right">LogOut</a>
	</div>
</body>
</html>