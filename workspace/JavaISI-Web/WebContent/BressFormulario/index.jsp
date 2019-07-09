<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Test formulario</title>
</head>
<body bgcolor="#CCDDAA">
<h1>Formulario de prueba</h1>
<hr>
<p>
<form name="formulario" action="formulario.jsp" method=POST>
<table border=0>
<tr>
<th>Su nombre:</th><td><input type=text name="nombre" size=30></td>
<th>Su apellido:</th><td><input type=text name="apellido" size=30></td>
</tr>
<tr>
<th>Su dirección:</th><td colspan=3><input type=text name="domicilio" size=100></td>
</tr>
<tr>
<th>Su Provincia:</th>
<td><select name="provincia">
<option selected>Santa Fe
<option>Buenos Aires
<option>Otra
</select>
</td>
</tr>
<tr>
<th>Su N° de tel:</th><td><input type=text name="tel" size=30></td>
<th>Su N° celular:</th><td><input type=text name="cel" size=30></td>
</tr>
<tr>
<th>Su nota:</th><td colspan=3><textarea name="nota" cols=75 rows=5></textarea></td>
</tr>
<tr>
<th></th><td><button type=reset>Limpiar></button>></td>
<th></th><td><button type=submit>Enviar></button>></td>
</tr>
</table>
</form>
</body>
</html>
