<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="headerTwo.jsp" %> <br>
	
	<h2 align="center">Employee Information:</h2>
	
	<div align="center">
		<s:form action="searchByEmailAction" class="loginForm">
			<s:textfield name="email" label="Search by employee Email" class="formTextField" />
			<s:submit value="Search" class="actionBtn" />
		</s:form>
	</div>
	
	<table width="100%" class="productTable" align="center">
		<thead>  
			<tr>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PHONE</th>
				<th>BLOOD GROUP</th>
			</tr>
		</thead>
		
		<s:iterator value="employee" var="employee">
			<tr>
				<td>
					<s:property value="#employee.name"/>
				</td>
				<td>
					<s:property value="#employee.email"/>
				</td>
				<td>
					<s:property value="#employee.phone"/>
				</td>
				<td>
					<s:property value="#employee.blood"/>
				</td>
			
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>