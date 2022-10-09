<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<form:errors path="country" cssClass="error" />
		<br><br>
		Favorite Language:
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
		<form:errors path="favoriteLanguage" cssClass="error" />
		<br><br>
		Operating System:
		<form:checkboxes path="operatingSystem" items="${student.operatingSystemOptions}" />
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>