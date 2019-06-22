<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tipos</title>
<link href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />
<script  src="/webjars/jquery/3.4.1/jquery.min.js" ></script>
<script  src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</head>
<body>

<h2>Soy tipos/index</h2>
<table  class="table  table-striped" >
<thead class="thead-dark">
<tr>
<th>Id</th>
<th>Nombre</th>
<th>Estado</th>
<th colspan=2><a href="new" class="btn btn-light"> Nuevo</a></th>
</tr>
</thead>
<tbody>
<c:forEach items="${tipolista}" var="tipo">
<tr>
<td>${tipo.id}</td>
<td>${tipo.nombre}</td>
<td>${tipo.active}</td>
<td><a class="btn btn-warning">Editar</a></td>
<td><a class="btn btn-danger">Borrar</a></td>
</tr>
</c:forEach>
</table>
</tbody>
</body>
</html>