<%@page import="java.util.ArrayList"%>
<%@page import="edu.uptc.model.Employee"%>
<%@page import="edu.uptc.model.EmployeeManager"%>
<%@page import="java.awt.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 	<style><%@include file="/css/empStyle.css"%></style>
<title>HOLA</title>
</head>
<body>
<div class="topnav">
 <a href="addEmployee.jsp">Crear empleado</a>
 <a href="table.jsp">Modificar empleado</a>
 <a href="#">Borrar Empleado</a>
</div>
<h1>LISTA EMPLEADOS</h1>
<table action="EmployeeServlet" method="post">

	<tr>
	<th>ID<th>
	<th>NOMBRE<th>
	<th>CORREO<th>
	<th>MOBILE<th>
	<tr>
	<%
	EmployeeManager employeeManager = new EmployeeManager();
	String name;
	for (int i = 0; i <employeeManager.totalEmployee(); i++) {
		
	name = employeeManager.getEmployeeList().get(i).getEmail_emp();
%>
	<td>Hola</td>
	<td>DANI</td>
	<td>CA</td>
	<td>SA</td><tr>
</tr>
<%} %>
</table>
</div>
</div>
</body>
</html>