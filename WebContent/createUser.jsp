<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %> 
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create user</title>
<link rel="stylesheet" href="styletwo.css">
</head>
<body>
	<%@ include file="headerTwo.jsp" %> <br>
	
	<div align="center">
		<h2>Insert into the empty fields to Create an user account</h2>
		<s:form action="addUserAndSendEmailAction" class="loginForm">
			<s:textfield name="myEmail" label="User Name" class="formTextField" />
			<s:password name="myPass" label="Password" class="formTextField" />
			
			<s:textfield name="email" label="Email" class="formTextField" readonly="true" />
			<s:textfield name="userName" label="User Name" class="formTextField" />
			
			<s:select list="{'A','B','C','D'}" name="role" 
    		headerKey="null" headerValue="Select a role" label="Role" class="formTextField" />
    		
			<s:textfield name="randPass" label="Password" class="formTextField" readonly="true" />
			<s:submit value="CREATE & SEND to the employee email" class="actionBtn" />
		</s:form>
	</div>
		
</body>
</html>