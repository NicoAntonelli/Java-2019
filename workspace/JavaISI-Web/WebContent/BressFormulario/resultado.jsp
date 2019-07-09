<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% String nombre=request.getParameter("nombre");
String apellido=request.getParameter("apellido");
String domicilio=request.getParameter("domicilio");
String provincia=request.getParameter("provincia");
String tel=request.getParameter("tel");
String cel=request.getParameter("cel");
String nota=request.getParameter("nota");
String cuidad=request.getParameter("cuidad");
%>
<title>Resultado de formulario</title>
</head>
<body bgcolor="#CCDDAA">
<h1>Resultado final de su formulario</h1>
Su nombre : <%=nombre%><br> Su apellido : <%=apellido%><br>
Su domicilio : <%=domicilio%><br> Su cuidad : <%=cuidad%><br>
Su provincia : <%=provincia%><br> Su celular : <%=cel%><br>
Su telefono : <%=tel%><br> Su nota : <%=nota%><br>
<p> El nombre de su PC : <%=request.getRemoteHost()%><br>
El IP de su PC : <%=request.getRemoteAddr()%><br>
<hr> <h3>Enlaces</h3>
<a href="index.jsp">Regresar al indice</a><br>
<a href="formulario.jsp">Regresar al formulario</a>
</body> </html>
