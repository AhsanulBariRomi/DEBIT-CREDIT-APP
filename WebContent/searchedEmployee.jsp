<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="headerTwo.jsp" %> <br>
	
	<div align="center">
		<h2>Searched Employee</h2>
		<s:form action="empToUserAction" class="formTable" readonly="true">
			<s:textfield name="name" label="Employee Name" class="formTextField" readonly="true"/>
			<s:textfield name="email" label="Email" class="formTextField" readonly="true"/>
			<s:textfield name="phone" label="Phone No" class="formTextField" readonly="true"/>
			<s:textfield name="blood" label="Blood Group" class="formTextField" readonly="true"/>
			<s:submit value="User Account Info" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>