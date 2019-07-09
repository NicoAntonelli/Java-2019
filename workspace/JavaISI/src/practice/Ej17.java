package practice;

import javax.swing.JOptionPane;

/*
Ejercicio 17: Realizar una aplicación en la cual ingresados los tres lados de un
triángulo me informe si el triángulo es ISÓSCELES, ESCALENO o EQUILÁTERO.
*/

public class Ej17 {

	public static void main(String[] args) {
		
		// Ingresar los 3 valores de los lados
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 1:"));
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 2:"));
		double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 3:"));
		
		if(lado1==lado2) {
			if(lado1==lado3) {
				JOptionPane.showMessageDialog(null,"Es Equilátero","TIPO DE TRIÁNGULO",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"Es Isósceles","TIPO DE TRIÁNGULO",JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			if(lado1==lado3) {
				JOptionPane.showMessageDialog(null,"Es Isósceles","TIPO DE TRIÁNGULO",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"Es Escaleno","TIPO DE TRIÁNGULO",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}
