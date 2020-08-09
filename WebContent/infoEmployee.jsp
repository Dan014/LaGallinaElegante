<%@page import="edu.uptc.model.EmployeeManager"%>
<%@page import="edu.uptc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type"
 	content="text/html; charset=UTF-8">
 	<style><%@include file="/css/empStyle.css"%></style>
 <title> INFORMACION Empleado</title>
 </head>
 <body>
<%
// Este es un scriptlet
// Es código en Javaque captura los parámetros enviados
// en el objeto "request"
String id = (String) request.getSession().getAttribute("emp_id");
String name = (String) request.getSession().getAttribute("emp_name");
String email = (String) request.getSession().getAttribute("emp_email");
String mobile = (String) request.getSession().getAttribute("emp_phone");





%>
 <div class="topnav">
 <a href="addEmployee.jsp">Crear empleado</a>
 <a href="table.jsp">Modificar empleado</a>
 <a href="deleteEmployee.jsp">Borrar Empleado</a>
</div>
 <div class="content"> 
<tr>
<td align="right"> ID: <%= id %></td>
</tr>
<tr>
<h1></h1>
<td align="right"> Nombre: <%= name %></td>
</tr>
<tr>
<h1></h1>
<td align="right"> Email: <%= email %></td>
</tr>
<tr>
<h1></h1>
<td align="right"> Telefono: <%= mobile %></td>
</tr>
 </div>
 
 <div class="footer">
  <p>Ingenieria de Software I - 2020 
  Copyright UPTC Tunja</p>
</div>
 
  </body>
</html>
