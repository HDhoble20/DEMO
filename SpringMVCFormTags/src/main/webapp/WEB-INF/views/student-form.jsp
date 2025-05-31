<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
<hr>
<form:form action="studentConfirm" method="post" modelAttribute="theStudent"> 
Enter FirstName: <form:input path="firstName"/>
<br><br>
Enter LastName: <form:input path="lastName"/>
<br><br>
Enter Country:
<form:select path="country">
<form:options items="${theStudent.countryOptions}"/>
</form:select>
<br><br>
Select Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Spring Boot <form:radiobutton path="favoriteLanguage" value="SpringBoot"/>
Microservices <form:radiobutton path="favoriteLanguage" value="Microservices"/>
<br><br>
Select Operating Systems:
Windows <form:checkbox path="operatingSystem" value="Windows"/>
Linux <form:checkbox path="operatingSystem" value="Linux"/>
Mac OS <form:checkbox path="operatingSystem" value="Mac"/>
<br><br>
<input type="submit" value="Register">
</form:form>
</body>
</html>