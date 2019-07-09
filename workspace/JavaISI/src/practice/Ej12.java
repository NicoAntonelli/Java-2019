package practice;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

// Ejercicio 12: Escriba una aplicación que a partir de la expresión algebraica de la ecuación de 1° grado indique un conjunto de 10 pares de coordenadas x,y para trazar la recta que representa.

// Ecuacuón del tipo Y = AX+B, donde A y B son números reales
// Ecuacion Ejemplo: 20X+5 (arranca en (0,5)... desplazamiento en Y multiplicando X)

public class Ej12 {

	public static void main(String[] args) {
		
		// Ingresar Ecuación de la Recta
		String ecu = JOptionPane.showInputDialog("Ingrese Ecuación de 1er Grado").toUpperCase();
		double a = 1;
		if(ecu.indexOf('X') != 0) {
			a = Double.parseDouble(ecu.substring(0,ecu.indexOf('X')));
		}
		double b=0;
		if (ecu.indexOf('+') >= 0) {
			b = Double.parseDouble(ecu.substring(ecu.indexOf('+')+1,ecu.length()));
		} else {
			if  (ecu.indexOf('-') >= 0) {
			b = Double.parseDouble(ecu.substring(ecu.indexOf('-'),ecu.length()));	
			}
		}
		
		// Generación de 20 Primeros Puntos de la Recta
		double[][] puntos = new double[10][2];
		for(int i=0;i<10;i++) {
			puntos[i][0] = i;
			puntos[i][1] = a*i+b;
		}
		
		// Display de Puntos
		JTextArea display = new JTextArea();
		display.setText("Ecuación: "+ecu);
		for(int i=0; i<10; i++) {
			display.append("\n"+"("+puntos[i][0]+","+puntos[i][1]+")");
		}
		JOptionPane.showMessageDialog(null, display, "Resultados",JOptionPane.INFORMATION_MESSAGE);
	}

}
