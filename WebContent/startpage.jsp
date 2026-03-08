<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %> 
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Debit Credit</title>
<link rel="stylesheet" href="start.css">
</head>
<body>
	<div align ="center"><h1> <br><br> <br><br>WELCOME TO SIMPLE DEBIT CREDIT APPLICATION</h1> <br><br></div>
	<div align="center">
		<s:form action="StartpageAction">
			<s:submit value="ADMIN PANEL" class="actionBtn"/>
		</s:form>
	</div>
	<div align="center">
		<s:form action="StartpageActionUser">
			<s:submit value="END USER PANEL" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>