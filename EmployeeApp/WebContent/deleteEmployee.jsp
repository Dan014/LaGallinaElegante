<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<style><%@include file="/css/empStyle.css"%></style>
</head>
<div class="content"> 
<body>
<h1> EMPLOYEE APP</h1>
 <h2> Hola, por favor ingrese los datos del usuario que desea eliminar</h2>
 <form action="EmployeeDelete" method="post">
 <table cellspacing="3" cellpadding="3" border="1" >
 <tr>
 <td align="right"> ID Empleado: </td>
 <td><input type="text" name="emp_id"></td>
 </tr>
 </table>
 <input type="submit" value="Enviar">
 </form>
</body>
</div>
</html>