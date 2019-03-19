<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<html>
	<head>
		<title>Spring MVC form Handling</title>
	</head>
	
	<style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
   
	<body>
		<h2>Student Information</h2>
		<form:form method="POST" action="/HelloWeb/addStudent" modelAttribute="student">
		<form:errors path = "*" cssClass = "errorblock" element = "div" />
			<table>
				<tr>
					<td><form:label path="id">Id</form:label> </td>
					<td><form:input path="id"/></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"/></td>
					<td><form:errors path = "name" cssClass = "error" /></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age"/></td>
				</tr>
				<tr>
					<td><form:label path="userName">User Name</form:label> </td>
					<td><form:input path="userName"/> </td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label> </td>
					<td><form:password path="password"/></td>
				</tr>
				<tr>
					<td><form:label path="address">Address</form:label> </td>
					<td><form:textarea path="address" cols="35" rows="4"/> </td>
				</tr>
				<tr>
					<td><form:label path="receivePaper">Subscribe Newsletter</form:label> </td>
					<td><form:checkbox path="receivePaper"/> </td>
				</tr>
				<tr>
					<td><form:label path="favoriteFrameworks">Favorite Web Framework</form:label> </td>
					<td><form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks"/> </td>
				</tr>
				<tr>
					<td><form:label path="gender">Gender</form:label> </td>
					<td><form:radiobutton path="gender" value="Male" label="Male"/> &nbsp;<form:radiobutton path="gender" value="Female" label="FeMale"/> </td>
				</tr>
				<tr>
					<td><form:label path="favoriteNumber">Favorite Number</form:label> </td>
					<td><form:radiobuttons path="favoriteNumber" items="${numberList}"/>
				</tr>
				<tr>
					<td><form:label path="country">Country</form:label> </td>
					<td>
						<form:select path="country">
							<form:option value="NONE" label="--Select--"/>
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
					<td colspan="2"><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>