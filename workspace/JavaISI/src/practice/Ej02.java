package practice;

import javax.swing.JOptionPane;

// Ejercicio 2: Sumar dos n�meros enteros y mostrar el resultado. (Uso de sentencias de ingreso, salida y c�lculo matem�tico).

public class Ej02 {

	public static void main(String[] args) {
		float num1,num2,total;
		
		num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese un N�mero",JOptionPane.QUESTION_MESSAGE));
		num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese un N�mero",JOptionPane.QUESTION_MESSAGE));
		total = num1+num2;
		
		System.out.println("El total es: "+total);

	}

}
