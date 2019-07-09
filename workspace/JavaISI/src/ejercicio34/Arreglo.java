package ejercicio34;

import javax.swing.JOptionPane;

public class Arreglo {
	
	// Attributes
	private double nums[];
	
	// Constructor
	public Arreglo() {
		nums = new double[5];
	}
	
	// Getters and Setters
	public double[] getNums() {
		return nums;
	}
	public void setNums(double[] nums) {
		this.nums = nums;
	}

	// Load 5 Numbers
	public void loadNums() {
		for(int i=0;i<5;i++) {
			this.nums[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el "+(i+1)+"º número","Promedio de 5 Números",JOptionPane.QUESTION_MESSAGE));
		}
	}
	
	// Average Calculation
	public double calcProm() {
		double prom = 0;
		for(double num : this.nums) {
			prom+=num;
		}
		prom=prom/this.nums.length;
		return prom;
	}
	
	// Display Average
	public void display() {
		double prom = calcProm();
		JOptionPane.showMessageDialog(null,prom,"Promedio", JOptionPane.PLAIN_MESSAGE);
	}
	
}
