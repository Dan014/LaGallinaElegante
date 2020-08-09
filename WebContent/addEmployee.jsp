<%@page import="edu.uptc.model.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<style><%@include file="/css/empStyle.css"%></style>
</head>
<div class="content"> 
<body>
<h1> EMPLOYEE APP</h1>
 <h2> Hola, por favor ingrese los datos del usuario </h2>
 <form action="EmployeeServlet" method="post">
 <table cellspacing="3" cellpadding="3" border="1" >
 <tr>
 <td align="right"> ID Empleado: </td>
 <td><input type="text" name="emp_id"></td>
 <%EmployeeManager employeeManager = new EmployeeManager();
 	employeeManager.addEmployee(2, "OLGA", "LUCIA", 23);%>
 </tr>
 <tr>
 <td align="right"> Nombre Empleado: </td>
 <td> <input type="text" name="emp_name"> </td>
 </tr>
 <tr>
 <td align="right"> Email empleado: </td>
 <td> <input type="text" name="emp_email"> </td>
 </tr>
 <tr>
 <td align="right"> Teléfono empleado: </td>
 <td> <input type="text" name="emp_phone"> </td>
 </tr>
 </table>
 <input type="submit" value="Enviar">
 </form>
</body>
</div>
</html>