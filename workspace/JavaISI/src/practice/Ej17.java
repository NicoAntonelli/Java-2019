package practice;

import javax.swing.JOptionPane;

/*
Ejercicio 17: Realizar una aplicaci�n en la cual ingresados los tres lados de un
tri�ngulo me informe si el tri�ngulo es IS�SCELES, ESCALENO o EQUIL�TERO.
*/

public class Ej17 {

	public static void main(String[] args) {
		
		// Ingresar los 3 valores de los lados
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 1:"));
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 2:"));
		double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 3:"));
		
		if(lado1==lado2) {
			if(lado1==lado3) {
				JOptionPane.showMessageDialog(null,"Es Equil�tero","TIPO DE TRI�NGULO",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"Es Is�sceles","TIPO DE TRI�NGULO",JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			if(lado1==lado3) {
				JOptionPane.showMessageDialog(null,"Es Is�sceles","TIPO DE TRI�NGULO",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"Es Escaleno","TIPO DE TRI�NGULO",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}
