<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h3>Nueva Noticia</h3>
<form:form  action="create" method="post" modelAttribute="tipo">
<label for="nombre"> Nombre:</label>
<form:input id="nombre" name="nombre" path="nombre" class="form-control"/>
<br />
<button type="submit"class="btn" >Guardar</button>

</form:form>










































</form>
</div>

</body>
</html>