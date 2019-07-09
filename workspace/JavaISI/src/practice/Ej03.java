package practice;

import javax.swing.JOptionPane;

// Ejercicio 3: Indicar si el número entero ingresado es par o impar.(Uso de sentencias de ingreso, salida, cálculo matemático y decisión lógica).

public class Ej03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un Número Entero",JOptionPane.QUESTION_MESSAGE));
		
		String res = (num%2==0) ? "Es Par" : "Es Impar";
		System.out.println(res);

	}

}
