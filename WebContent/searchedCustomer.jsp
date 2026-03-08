<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched Person</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="header.jsp" %> <br>
	<div align="center">
		<h2>Searched Person</h2>
		<s:form action="updateCustomerDataAction" class="formTable" readonly="true">
			<s:textfield name="name" label="Customer Name" class="formTextField" readonly="true"/>
			<s:textfield name="dob" label="Date of Birth(yyyy/mm/dd)" class="formTextField" readonly="true"/>
			<s:textfield name="nid" label="NID Number" class="formTextField" readonly="true"/>
			<s:textfield name="fathers_name" label="Father's Name" class="formTextField" readonly="true"/>
			<s:textfield name="mothers_name" label="Mother's Name" class="formTextField" readonly="true"/>
			<s:textfield name="phone" label="Phone Number" class="formTextField" readonly="true"/>
			<s:textfield name="email" label="Email" class="formTextField" readonly="true"/>
			<s:textfield name="accountNo" label="Account No" class="formTextField" readonly="true"/>
			<s:textfield name="accountBalance" label="Account Balance" class="formTextField" readonly="true"/>
			<s:submit value="Update Customer Info" class="actionBtn"/>
		</s:form>
	</div>
	<table width="20%" class="productTable" align="center">
		<tr>
			<td>
				<a href="withdrawDataAction?accountNo=<s:property value="accountNo"/>">
					<button class = "actionBtn">Withdraw</button>
				</a>
			</td>
			
			<td>
				<a href="depositDataAction?accountNo=<s:property value="accountNo"/>">
					<button class = "actionBtn">Deposit</button>
				</a>	
			</td>
		</tr>
	</table>

</body>
</html>