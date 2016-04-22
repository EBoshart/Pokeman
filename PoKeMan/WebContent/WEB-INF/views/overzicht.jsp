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
<a href=http://10.2.22.55/ServiceDemo/game.zip>download game Toon</a><br>

<a href=/PoKeMan.zip>download game Erwin</a>
	<ol type=1>
	
		<c:forEach items="${ritten}" var="rit">
			<li>
		
				Gamescore plaats: ${rit.id}: <a href="<c:url value="/rit/${rit.id}" />"> ${rit.naam} </a>score= ${rit.start}
				<!--  <a href="<c:url value="/delete/${rit.id}" />">verwijder</a> -->
			</li>
		</c:forEach>
	</ol>
	
	<!-- Let op! We MOETEN hier form:form gebruiken in plaats van een normale HTML form -->

</body>
</html>