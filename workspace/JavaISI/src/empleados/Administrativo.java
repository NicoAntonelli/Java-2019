package empleados;

public class Administrativo extends Empleado {
	
	// Attributes
	private int hsExtras;
	private int hsMes;
	
	// Journal
	public double calcSueldo() {
		
		return getSueldoBase()*((hsExtras*1.5)+hsMes)/hsMes;
	}
	
	// Get All Data (Polymorphic Redefinition)
	public String getData() {
		return super.getData()+"\nHoras Mes: "+getHsMes()+" --- Horas Extra: "+getHsExtras();
	}
	
	// Load Data (Call Super)
	public void loadData(String dni, String apellido, String nombre, String mail, double sueldoBase, int hsExtras, int hsMes) {
	super.loadData(dni, apellido, nombre, mail, sueldoBase);
		this.hsExtras = hsExtras;
		this.hsMes = hsMes;
	}
	
	// Getters and Setters
	public int getHsExtras() {
		return hsExtras;
	}
	public void setHsExtras(int hsExtras) {
		this.hsExtras = hsExtras;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
}
