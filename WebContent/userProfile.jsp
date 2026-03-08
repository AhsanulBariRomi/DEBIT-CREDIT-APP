<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>

	<%@ include file="header.jsp" %> <br>
	
	<div style="font-size:xx-large">
	<h1>User Information: </h1>
		<s:label value="User Name:" />
		<s:property value="user.userName" /> <br/>
		
		<s:label value="Email:" />
		<s:property value="user.email" /> <br/>
		
		<s:label value="Role:" />
		<s:property value="user.role" /> <br/>
	</div>
	
	<div align="center">
		<a href="updatePasswordDataAction?userName=<s:property value="user.userName"/>">
			<button class = "actionBtn">UPDATE PASSWORD</button>
		</a>
	</div>				
	
</body>
</html>