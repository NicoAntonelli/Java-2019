package practice;

import javax.swing.JOptionPane;

// Ejercicio 3: Indicar si el n�mero entero ingresado es par o impar.(Uso de sentencias de ingreso, salida, c�lculo matem�tico y decisi�n l�gica).

public class Ej03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un N�mero Entero",JOptionPane.QUESTION_MESSAGE));
		
		String res = (num%2==0) ? "Es Par" : "Es Impar";
		System.out.println(res);

	}

}
