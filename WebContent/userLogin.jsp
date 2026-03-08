<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>End User Login</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>

	<div align="center">
		<h2>End User Login</h2>
		<s:form action="UserloginAction" class="loginForm">
			<s:textfield name="userName" label="User Name" class="formTextField" />
			<s:password name="password" label="Password" class="formTextField" />
			<s:submit value="Login" class="actionBtn"/>
		</s:form>
		<div style="color:red">
			<s:property value="msg" default="..."/>
		</div>
	</div>
	
</body>
</html>