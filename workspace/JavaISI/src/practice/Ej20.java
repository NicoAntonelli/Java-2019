package practice;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
Ejercicio 20: Ingresar el valor del radio de una circunferencia y calcular el valor de
su �rea. Realizar el ejercicio usando otro m�todo en la clase
*/

public class Ej20 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("0.00");
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
		double area = Math.PI*radio*radio;
		JOptionPane.showMessageDialog(null,"El �rea es: "+formato.format(area),"�REA",JOptionPane.INFORMATION_MESSAGE);
		// ESTE EJERCICIO FUE HECHO TAMBI�N CON OBJETOS EN EL PACKAGE DEL EJ20
		
	}

}
