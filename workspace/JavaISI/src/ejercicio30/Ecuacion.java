package ejercicio30;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ecuacion {

	// Attributes
	private String formula;
	private double coefA;
	private double coefB;
	private double points[][]; 
	
	// Constructor
	public Ecuacion() {
		// The writing of "this." is not necessary
		formula = "";
		coefA = 1;
		coefB = 0;
		points = new double[10][2];
	}
	
	// Formula Set was Overloaded
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public void setFormula() {
		this.formula = JOptionPane.showInputDialog("Ingrese Ecuación de 1er Grado (AX+B)").toUpperCase();
	}
	
	// Load A and B Coefficients
	public void loadCoeficients() {
		String form = this.formula;
		if(form.indexOf('X') != 0) {
			this.coefA = Double.parseDouble(form.substring(0,form.indexOf('X')));
		}
		if (form.indexOf('+') >= 0) {
			this.coefB = Double.parseDouble(form.substring(form.indexOf('+')+1,form.length()));
		} else {
			if  (form.indexOf('-') >= 0) {
			this.coefB = Double.parseDouble(form.substring(form.indexOf('-'),form.length()));	
		}
		}
	}
	
	// 20 Firsts Points Calculation (X,AX+B)
	public void calcPoints() {
		for(int x=0;x<10;x++) {
			this.points[x][0] = x;
			this.points[x][1] = this.coefA*x+this.coefB;
		}
	}
	
	// Points Display
	public void displayP() {
		JTextArea display = new JTextArea();
		display.setText("Ecuación: "+this.formula);
		for(int i=0; i<10; i++) {
			display.append("\n"+"("+this.points[i][0]+","+this.points[i][1]+")");
		}
		JOptionPane.showMessageDialog(null, display, "Resultados",JOptionPane.INFORMATION_MESSAGE);
	}
	
	// Other Getters and Setters
	public double getCoefA() {
		return coefA;
	}
	public void setCoefA(double coefA) {
		this.coefA = coefA;
	}
	public double getCoefB() {
		return coefB;
	}
	public void setCoefB(double coefB) {
		this.coefB = coefB;
	}
	public double[][] getPoints() {
		return points;
	}
	public void setPoints(double[][] points) {
		this.points = points;
	}
	
}
