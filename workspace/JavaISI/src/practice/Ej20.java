package practice;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
Ejercicio 20: Ingresar el valor del radio de una circunferencia y calcular el valor de
su área. Realizar el ejercicio usando otro método en la clase
*/

public class Ej20 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("0.00");
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
		double area = Math.PI*radio*radio;
		JOptionPane.showMessageDialog(null,"El Área es: "+formato.format(area),"ÁREA",JOptionPane.INFORMATION_MESSAGE);
		// ESTE EJERCICIO FUE HECHO TAMBIÉN CON OBJETOS EN EL PACKAGE DEL EJ20
		
	}

}
