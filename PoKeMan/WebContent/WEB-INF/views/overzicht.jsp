<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!doctype html>
<html>
<head>

<title>Rittenregistratie</title>
</head>
<body>
	<ul>
		<c:forEach items="${ritten}" var="rit">
			<li>
				Gamescore plaats: ${rit.id}: <a href="<c:url value="/rit/${rit.id}" />"> ${rit.naam}</a>, 
				<!--  <a href="<c:url value="/delete/${rit.id}" />">verwijder</a> -->
			</li>
		</c:forEach>
	</ul>
	
	<!-- Let op! We MOETEN hier form:form gebruiken in plaats van een normale HTML form -->
	<%-- <form:form method="post">
		<p>
			Naam: <input type="text" name="naam"><br>
			Score: <input type="text" name="start"><br>
			
			<input type="submit">
		</p>
	</form:form> --%>
</body>
</html>