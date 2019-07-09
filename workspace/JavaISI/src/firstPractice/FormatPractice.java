package firstPractice;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
// CALCULAR PROMEDIO DE ALUMNO A PARTIR DE LA NOTA DE 2 PARCIALES
// EJ Hecho con Franco
public class FormatPractice {

	public static void main(String[] args) {
		String sValor1, sValor2, cartel;
		double valor1, valor2, promedio;
		DecimalFormat formato = new DecimalFormat("0.00");
		
		sValor1 = JOptionPane.showInputDialog("Ingrese un valor: ");
		sValor2 = JOptionPane.showInputDialog("Ingrese un valor: ");
		
		valor1 = Double.parseDouble(sValor1);
		valor2 = Double.parseDouble(sValor2);
		promedio = ((valor1 + valor2)/2);
		
		if(promedio>=6)
		{
			cartel = "Aprobado";
		}
		else
		{
			cartel = "Desaprobado";
		}
		
		JOptionPane.showMessageDialog(null, cartel+" con promedio: "+formato.format(promedio));
	}

}
