<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!doctype html>
<html>
<head>
<link rel=icon type=image/ico href=resources/favicon.ico>

<title>PoKeMan</title>
</head>
<body>
<!-- <a href=http://10.2.22.55/ServiceDemo/game.zip>download game Toon</a><br> -->

<a href=resources/PoKeMan.zip>download game version 1.337 </a>
<%-- <center> --%>
<table style=font-size:50px align=center>
 <col width="500">
		<tr> <td>   <strong style="font-size: 100px;"><b>Name</b></strong><br /></td>
    <td><strong style="font-size: 100px;"><b>Score</b></strong></td> 
    </tr>
		
		<c:forEach items="${scores}" var="rit">

		
				<tr><td>  <a href="<c:url value="/rit/${rit.id}" />"> ${rit.naam} </a> </td><td> ${rit.start} </td></tr>
			
	
		</c:forEach>
	
	</table>
<%-- 	</center> --%>
	<!-- Let op! We MOETEN hier form:form gebruiken in plaats van een normale HTML form -->

</body>
</html>