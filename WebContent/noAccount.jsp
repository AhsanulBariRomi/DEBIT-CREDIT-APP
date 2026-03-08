<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create account</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="headerTwo.jsp" %> <br>
	<div align="center">
		<h1>The Employee has no User Account</h1>
	</div>
	
	<div align="center">
		<a href="createUserAccDataAction?email=<s:property value="email"/>">
			<button class = "actionBtn">Create Account</button>
		</a>	
	</div>
</body>
</html>