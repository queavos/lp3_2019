<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>/home</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet" href="${urlPublic}/bootstrap/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="../pages/menu.jsp"></jsp:include>
<h1>Hello world - ${urlPublic}</h1>
<img alt=" " src="${urlPublic}/images/unae.logo.png">
<ul>
<c:forEach items="${ peliculas }" var="pelicula">
			<li>${pelicula.getTitulo()}</li>
			</c:forEach>
			</ul>
</body>
</html>