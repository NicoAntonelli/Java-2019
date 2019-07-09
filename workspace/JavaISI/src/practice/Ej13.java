package practice;

import javax.swing.JOptionPane;

/*
Ejercicio 13: Escriba una aplicaci�n que lea los coeficientes a, b y c de una ecuaci�n
de segundo, y estudie si tiene o no soluci�n. En caso positivo, las soluciones se
calcular�n e imprimir�n en pantalla
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
			JOptionPane.showMessageDialog(null,"No Tiene Ra�ces Reales","RA�CES",JOptionPane.INFORMATION_MESSAGE);
		} else {
			r1 = (-B+Math.sqrt(discrim))/2*A;
			r2 = (-B-Math.sqrt(discrim))/2*A;
			JOptionPane.showMessageDialog(null,"Raiz 1: "+r1+"\nRaiz 2: "+r2,"RA�CES",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
