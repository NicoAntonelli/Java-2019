package ejercicio30;

/* 
Ejercicio 30: Modificar el Ejercicio 12 de manera que los pares de valores estén acomodados en un array.
Texto del Ejercicio 12: Escriba una aplicación que a partir de la expresión algebraica de la ecuación de 1° grado indique un conjunto de 10 pares de coordenadas x,y para trazar la recta que representa.
*/

public class Main {

	public static void main(String[] args) {
		Ecuacion ecu = new Ecuacion();
		ecu.setFormula();
		ecu.loadCoeficients();
		ecu.calcPoints();
		ecu.displayP();
		
	}

}
