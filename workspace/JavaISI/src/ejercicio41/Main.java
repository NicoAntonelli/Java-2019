package ejercicio41;

/*
Ejercicio 41: En una empresa se desea confeccionar una aplicaci�n Java que calcule el jornal de sus empleados.
Esta aplicaci�n debe calcular y presentar el resultado empleado por empleado en forma detallada.

EJEMPLO:___________________________________________________
EMPLEADO: XXXXXXXX, XXXXXX
CANTIDAD HORAS TRABAJADAS: XX		SUELDO B�SICO: $XXX.XX
CANTIDAD HORAS SIMPLES: XX			DESCUENTOS: $XX.XX
CANTIDAD HORAS EXCEDENTES: XX		PREMIO: $XXX.XX
A COBRAR: $XXX.XX
___________________________________________________________

De los mismos se conoce su nombre y apellido y cantidad de horas trabajadas.
El jornal se paga por semana con el siguiente detalle: Valor pagado por hora 25$ (hasta 40 hs semanales), pasadas las 40hs el valor por cada hora excedente es de 30$.
Los descuentos aplicados son del 19,5 % sobre el valor calculado sobre las primeras 40 horas.
Adem�s si trabaja al menos 40 hs percibe una bonificaci�n de 100$ sin descuentos.
*/

public class Main {

	public static void main(String[] args) {
		Negocio emp = new Negocio();
		emp.menu();
	}

}
