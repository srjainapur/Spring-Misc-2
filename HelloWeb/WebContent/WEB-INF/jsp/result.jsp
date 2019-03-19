<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
	<head>
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
		<h2>Submitted Student Information</h2>
		<table border="1">
			<tr>
				<td>Id</td>
				<td>${id}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${name}</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${age}</td>
			</tr>
			<tr>
				<td>User Name</td>
				<td>${userName}</td>			
			</tr>
			<tr>
				<td>Password</td>
				<td>${password}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${address}</td>
			</tr>
			<tr>
				<td>Subscribe News Letter</td>
				<td>${receivePaper}</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${gender}</td>
			</tr>
			<tr>
            	<td>Favorite Web Frameworks</td>
            	<td> 
            		<% 
            			String[] favoriteFrameworks = (String[])request.getAttribute("frameWorks");
            			for(String framework: favoriteFrameworks) {
               				out.println(framework);
            			}
            		%>
            	</td>
         </tr>  
         <tr>
            <td>Favourite Number</td>
            <td>${favNumber}</td>
         </tr> 
         <tr>
         	<td>Country</td>
         	<td>${country}</td>
         </tr> 
         <tr>
            <td>Skills</td>
            <td> <% String[] skills = (String[])request.getAttribute("skills");
            for(String skill: skills) {
               out.println(skill);
            }
            %></td>
         </tr>     	  
		</table>
	</body>
</html>