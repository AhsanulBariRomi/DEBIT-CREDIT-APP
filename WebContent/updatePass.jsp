<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>password update</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
<%@ include file="header.jsp" %> <br>
	<div align="center">
		<h2>Type New Password</h2>
		<s:form action="updatePasswordAction" class="loginForm">
			<s:textfield name="userName" label="User Name" class="formTextField" readonly="true"/>
			<s:password name="password" label="Password" class="formTextField" />
			<s:submit value="update password" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>