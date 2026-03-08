<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="header.jsp" %> <br>
	
	<div align="center">
		<h1>Enter the amount in the field to DEPOSIT</h1>
		<s:form action="depositAction" class="formTable" readonly="true">
			<s:textfield name="name" label="Customer Name" class="formTextField" readonly="true"/>
			<s:textfield name="dob" label="Date of Birth(yyyy/mm/dd)" class="formTextField" readonly="true"/>
			<s:textfield name="nid" label="NID Number" class="formTextField" readonly="true"/>
			<s:textfield name="fathers_name" label="Father's Name" class="formTextField" readonly="true"/>
			<s:textfield name="mothers_name" label="Mother's Name" class="formTextField" readonly="true"/>
			<s:textfield name="phone" label="Phone Number" class="formTextField" readonly="true"/>
			<s:textfield name="email" label="Email" class="formTextField" readonly="true"/>
			<s:textfield name="accountNo" label="Account No" class="formTextField" readonly="true"/>
			<s:textfield name="accountBalance" label="Account Balance" class="formTextField" readonly="true"/> <br>
			<s:textfield name="amount" label="Insert the amount" class="formTextField" />
			<s:submit value="deposit" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>