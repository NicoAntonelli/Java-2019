package ejercicio41;

import javax.swing.JOptionPane;

public class Empleado {
	
	// Attributes
	private String nombre;
	private String apellido;
	private int cantHS;
	
	// Load Attributes
	public void loadData() {
		this.nombre = JOptionPane.showInputDialog(null,"Ingrese Nombre del Empleado",JOptionPane.QUESTION_MESSAGE);
		this.apellido = JOptionPane.showInputDialog(null,"Ingrese Apellido del Empelado",JOptionPane.QUESTION_MESSAGE);
		this.cantHS = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Cantidad de HS Trabajadas",JOptionPane.QUESTION_MESSAGE));
	}
	
	// Load Attributes (OverLoad)
	public void loadData(String nom, String apell, int HS) {
		this.nombre = nom;
		this.apellido = apell;
		this.cantHS = HS;
	}
	
	// Get Full Name
	public String getNyA() {
		return this.apellido+", "+this.nombre;
	}
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCantHS() {
		return cantHS;
	}
	public void setCantHS(int cantHS) {
		this.cantHS = cantHS;
	}
	
}
