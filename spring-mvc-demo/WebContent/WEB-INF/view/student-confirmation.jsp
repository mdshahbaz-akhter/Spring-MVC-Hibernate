<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Confirmation Page</title>
</head>
<body>

	Student Name:${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Favorite Language: ${student.favoriteLanguage}
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>