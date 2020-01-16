<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>SSA Web Reg Form</h2>
${sMsg}
<form:form action="handleSunbmit" method="POST" modelAttribute="ssaweb">
<table>
<tr>
<td>First Name</td>
<td><form:input path="fname"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><form:input path="lname"/></td>
</tr>
<tr>
<td>Date  of Birth</td>
<td><form:input type="date" path="dob" pattern="dd-mm-yyyy"/></td>
</tr>
<tr>
<td>Gender</td>
<td><form:radiobutton  path="gender" value="Male"/>Male &nbsp;&nbsp;
<form:radiobutton path="gender" value="Female"/>Female
</td>
</tr>
<tr>
<td>State</td>
<td><form:select path="state">
						<form:option value="">--select State--</form:option>
						<form:options items="${states}" />
					</form:select></td>
</tr>

</table>

<input align="center" type="submit" value="Submit'" />

</form:form>

</body>
</html>