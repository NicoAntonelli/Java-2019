package practice;

import javax.swing.JOptionPane;

// Ejercicio 11: Escriba una aplicaci�n que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados Celsius mostr�ndola. El programa finalizar� cuando lea un valor de temperatura igual a 999. La conversi�n de grados Farenheit (F) a Celsius (C) est� dada por C = 5/9(F - 32)

public class Ej11 {

	public static void main(String[] args) {
		double tempF=0, tempC;
		
		tempF = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese valor de Temperatura en (F)",JOptionPane.QUESTION_MESSAGE));
		while(tempF!=999) {
			tempC = (5/9)*(tempF-32);
			JOptionPane.showMessageDialog(null, tempC+" grados", "Temperatura en (C)", JOptionPane.PLAIN_MESSAGE);
			tempF = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese valor de Temperatura en (F)",JOptionPane.QUESTION_MESSAGE));
		}
		
	}

}
