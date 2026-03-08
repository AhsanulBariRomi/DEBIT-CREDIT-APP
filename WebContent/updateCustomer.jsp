<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix="s" uri="/struts-tags" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="header.jsp" %> <br>
	
	<div align="center">
		<h2>Update Customer Information</h2>
		<s:form action="updateCustomerAction" class="formTable">
			<s:textfield name="name" label="Customer Name" class="formTextField"/>
			<s:textfield name="dob" label="Date of Birth(yyyy/mm/dd)" class="formTextField"/>
			<s:textfield name="nid" label="NID Number" class="formTextField"/>
			<s:textfield name="fathers_name" label="Father's Name" class="formTextField"/>
			<s:textfield name="mothers_name" label="Mother's Name" class="formTextField"/>
			<s:textfield name="phone" label="Phone Number" class="formTextField"/>
			<s:textfield name="email" label="Email" class="formTextField"/>
			<s:textfield name="accountNo" label="Account No (Fixed)" class="formTextField" readonly="true"/>
			<s:textfield name="accountBalance" label="Account Balance" class="formTextField"/>
			<s:submit value="Update" class="actionBtn"/>
		</s:form>
	</div>
	
</body>
</html>