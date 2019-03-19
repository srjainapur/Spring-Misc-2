<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>User Information</h2>
	<form:form method="POST" action="/Spring_Form_Tag_lib/addUser">
		<table>
			<tr>
				<td><form:label path="userName">UserName</form:label></td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:textarea path="address" cols="30" rows="5"/> </td>
			</tr>
			<tr>
				<td><form:label path="recievePaper">Receive Paper</form:label> </td>
				<td><form:checkbox path="recievePaper"/> </td>
			</tr>
			<tr>
				<td><form:label path="favoriteFrameworks">Favorite Frameworks</form:label></td>
				<td>
					<form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="gender">Male</form:label></td>
				<td>
					<form:radiobutton path="gender" value="M" label="Male"/>&nbsp;&nbsp;
					<form:radiobutton path="gender" value="F" label="Female"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="favoriteNumber">Favorite Number</form:label></td>
				<td><form:radiobuttons path="favoriteNumber" items="${numberList}"/> </td>
			</tr>
			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td> 
					<form:select path="country">
						<form:option value="NONE" label="--SELECT--"></form:option>
						<form:options items="${countryList}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td><form:label path="skills">Skills</form:label> </td>
				<td>
					<form:select path="skills" items="${skillsList}" multiple="true"></form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>