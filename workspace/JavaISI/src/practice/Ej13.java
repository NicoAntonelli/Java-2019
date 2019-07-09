package practice;

import javax.swing.JOptionPane;

/*
Ejercicio 13: Escriba una aplicación que lea los coeficientes a, b y c de una ecuación
de segundo, y estudie si tiene o no solución. En caso positivo, las soluciones se
calcularán e imprimirán en pantalla
*/

public class Ej13 {

	public static void main(String[] args) {
		
		// Ingresar Coeficienes A,B,C
		double A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Coeficiente A:"));
		double B = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Coeficiente B:"));
		double C = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Coeficiente C:"));
		
		// Discriminante y Resolvente
		double discrim = (B*B-4*A*C);
		double r1,r2;
		if (discrim < 0) {
			JOptionPane.showMessageDialog(null,"No Tiene Raíces Reales","RAÍCES",JOptionPane.INFORMATION_MESSAGE);
		} else {
			r1 = (-B+Math.sqrt(discrim))/2*A;
			r2 = (-B-Math.sqrt(discrim))/2*A;
			JOptionPane.showMessageDialog(null,"Raiz 1: "+r1+"\nRaiz 2: "+r2,"RAÍCES",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
