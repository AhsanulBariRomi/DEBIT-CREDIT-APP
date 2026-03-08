<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="header.jsp" %> <br>
	
	<div align="center">
		<h1>Enter the amount in the field to WITHDRAW</h1>
		<s:form action="withDrawAction" class="formTable" readonly="true">
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
			<s:submit value="withdraw" class="actionBtn"/>
		</s:form>
	</div>
	
	<!-- 
	<div align="center" style="font-size:xx-large">
	
		<s:label value="Customer Name:" />
		<s:property value="name" /> <br/>
	
		<s:label value="Account No:" />
		<s:property value="accountNo" /> <br/>
	
		<s:label value="Account Balance:" />
		<s:property value="accountBalance" /> <br/>
		
	</div>
	
	
	 <div align="center">
		<s:form action="withDrawAction" class="loginForm">
			<s:textfield name="amount" label="Insert the amount" class="formTextField" />
			<s:submit value="WITHDRAW" class="actionBtn" />
		</s:form>
	</div> 
	-->
	
	
</body>
</html>