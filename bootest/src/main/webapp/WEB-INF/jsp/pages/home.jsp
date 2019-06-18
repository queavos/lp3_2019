<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo}</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link rel="stylesheet" href="${urlPublic}/boots/css/bootstrap.min.css" />
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

${contenido}
</body>
</html>