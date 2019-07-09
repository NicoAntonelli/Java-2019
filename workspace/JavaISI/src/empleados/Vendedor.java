package empleados;

public class Vendedor extends Empleado {

	// Attributes
	private double porcenComision;
	private int totalVentas;
	
	// Journal
	public double calcSueldo() {
		double sueldoBase = super.getSueldoBase();
		return sueldoBase+(porcenComision*totalVentas)/100;
	}
	
	// Get All Data (Polymorphic Redefinition)
	public String getData() {
		return super.getData()+"\nPorcentaje Comisión: "+getPorcenComision()+" --- Total Ventas: "+getTotalVentas();
	}
	
	// Load Data (Call Super)
	public void loadData(String dni, String apellido, String nombre, String mail, double sueldoBase, double porcenComision, int totalVentas) {
		super.loadData(dni, apellido, nombre, mail, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
	
	// Getters and Setters
	public double getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
}
