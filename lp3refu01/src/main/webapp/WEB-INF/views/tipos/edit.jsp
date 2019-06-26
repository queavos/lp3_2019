<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Tipo</title>
<link href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />
<script  src="/webjars/jquery/3.4.1/jquery.min.js" ></script>
<script  src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</head>
<body>
<div class="container">
<h3>Editar Tipo</h3>
<form:form  action="/tipos/update/" method="post" modelAttribute="tipo">
<form:input type="hidden" id="id" name="id" path="id"/>
<label for="nombre"> Nombre:</label>
<form:input id="nombre" name="nombre" path="nombre" class="form-control" />
<br />
<button type="submit"class="btn " >Guardar</button>
<br />
</form:form>
<a href="/tipos/" class="btn btn-link" >Volver a Lista </a>