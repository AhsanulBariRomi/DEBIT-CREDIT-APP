<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Open Account </title>
<s:head/>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="header.jsp" %> <br>
	
	<div align="center">
		<h2>Create New Customer Account</h2>
		<s:form action="addCustomerAction" class="formTable">
			<s:textfield name="name" label="Customer Name*" class="formTextField"/>
			<s:textfield name="dob" label="Date of Birth(yyyy/mm/dd)*" class="formTextField"/>
			<s:textfield name="nid" label="NID Number*" class="formTextField"/>
			<s:textfield name="fathers_name" label="Father's Name*" class="formTextField"/>
			<s:textfield name="mothers_name" label="Mother's Name*" class="formTextField"/>
			<s:textfield name="phone" label="Phone Number*" class="formTextField"/>
			<s:textfield name="email" label="Email" class="formTextField"/>
			<s:textfield name="accountNo" label="Account No*" class="formTextField"/>
			<s:textfield name="accountBalance" label="Account Balance*" class="formTextField"/>
			<s:submit value="Create Account" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>