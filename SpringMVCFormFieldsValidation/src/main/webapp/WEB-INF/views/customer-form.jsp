<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cutsomer FOrm</title>
<style type="text/css">
	.error {color: red}
</style>
</head>
<body>
<i>Fill out the form. Asterisk(*) means required</i>
<br><br>
<form:form action="processForm" modelAttribute="customer">
Enter FirstName: <form:input path="firstName"/>
<br><br>
Enter LastName(*): <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
<input type="submit" value="SUBMIT">
</form:form>
</body>
</html>