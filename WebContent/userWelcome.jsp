<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Management</title>
<link rel="stylesheet" href="styletwo.css">
</head>

<body>
	
	<%@ include file="header.jsp" %> <br>
	
	<div align="center">
		<s:form action="searchByAccAction" class="loginForm">
			<s:textfield name="accountNo" label="Search by Account No" class="formTextField" />
			<s:submit value="Search" class="actionBtn" />
		</s:form>
	</div>

	<h2 align="center">Customer Information:</h2>
	
	<table width="100%" class="productTable" align="center">
		<thead>  
			<tr>
				<th>NAME</th>
				<th>DOB</th>
				<th>NID</th>
				<th>FATHER</th>
				<th>MOTHER</th>
				<th>PHONE</th>
				<th>EMAIL</th>
				<th>ACC_NO</th>
				<th>ACC_BALLANCE</th>
				<th colspan="4">Actions</th>
			</tr>
		</thead>
		
		<s:iterator value="customer" var="customer">
			<tr>
				<td>
					<s:property value="#customer.name"/>
				</td>
				<td>
					<s:property value="#customer.dob"/>
				</td>
				<td>
					<s:property value="#customer.nid"/>
				</td>
				<td>
					<s:property value="#customer.fathers_name"/>
				</td>
				<td>
					<s:property value="#customer.mothers_name"/>
				</td>
				<td>
					<s:property value="#customer.phone"/>
				</td>
				<td>
					<s:property value="#customer.email"/>
				</td>
				<td>
					<s:property value="#customer.accountNo"/>
				</td>
				<td>
					<s:property value="#customer.accountBalance"/>
				</td>
				<td>
					<a href="updateCustomerDataAction?accountNo=<s:property value="#customer.accountNo"/>">
						<button class = "actionBtn">UPDATE</button>
					</a>
				</td>
				<td>
					<a href="deleteCustomerAction?accountNo=<s:property value="#customer.accountNo"/>">
						<button class = "actionBtn">DELETE</button>
					</a>	
				</td>
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
		</s:iterator>
		
	</table>
	
</body>
</html>