<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Resultado de formulario</title>
</head>
<body bgcolor="#CCDDAA">
<h1>Resultado de su formulario</h1>
<%-- Recuperación de datos del formulario anterior--%>
<% String nombre=request.getParameter("nombre");
String apellido=request.getParameter("apellido");
String domicilio=request.getParameter("domicilio");
String provincia=request.getParameter("provincia");
if (provincia==null)
provincia="Otra";
String tel=request.getParameter("tel");
String cel=request.getParameter("cel");
String nota=request.getParameter("nota");
%>
<hr>
<p> Estimado/a señor(a) <big><%=apellido%></big>,
<br>
<br> Le/a informamos que su formulario fue transmitido con éxito. </p>
<hr>
<% if (!provincia.equals("Otra")) { %>
Notamos que Usted vive en <big><%=provincia%></big>, por favor elija su cuidad:<br>
<%} %>
<form name="formulario" action="resultado.jsp" method=POST>
<% if (provincia.equals("Santa Fe")) { %>
<select name="cuidad">
<option selected>Rosario
<option>San Lorenzo
<option>Casilda
<option>Otra
</select>
<% } else if (provincia.equals("Buenos Aires")) { %>
<h1><select name="cuidad">
<option>San Nicolás
<option>Mar del Plata
<option>Pergamino
<option>Otra
</select></h1>
<% } else { %>
<h1>Otra</h1> <% } %>
<input type=hidden name="nombre" value="<%=nombre%>">
<input type=hidden name="apellido" value="<%=apellido%>">
<input type=hidden name="domicilio" value="<%=domicilio%>">
<input type=hidden name="provincia" value="<%=provincia%>">
<input type=hidden name="cel" value="<%=cel%>">
<input type=hidden name="tel" value="<%=tel%>">
<input type=hidden name="nota" value="<%=nota%>">
<button type=submit>Enviar</button> </form>
<hr> <h3>Enlaces</h3>
<a href="index.jsp">Regresar al indice</a>
<br> <a href="formulario.jsp">Regresar al formulario</a>
</body>
</html>
