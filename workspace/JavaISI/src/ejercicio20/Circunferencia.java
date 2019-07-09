package ejercicio20;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Circunferencia {
	
	// Methods
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setRadio() {
		this.radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double calcArea() {
		radio = this.getRadio();
		return Math.PI*radio*radio;
	}
	
	public void showArea() {
		double show = this.calcArea();
		JOptionPane.showMessageDialog(null,"El Área es: "+formato.format(show),"ÁREA",JOptionPane.INFORMATION_MESSAGE);
	}
	
	// Attributes
	private double radio;
	
	// Class Attributes
	private static DecimalFormat formato = new DecimalFormat("0.00");

}
