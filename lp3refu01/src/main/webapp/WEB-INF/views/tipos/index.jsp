<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Soy tipos/index</h2>
<table border="1">
<tr>
<th>Id</th>
<th>Nombre</th>
<th>Estado</th>
<td colsapan=2><a href="new"> Nuevo</a></td>
</tr>
<c:forEach items="${tipolista}" var="tipo">
<tr>
<td>${tipo.id}</td>
<td>${tipo.nombre}</td>
<td>${tipo.active}</td>
<td>Editar</td>
<td>Borrar</td>
</tr>
</c:forEach>
</table>

</body>
</html>