package empleados;

public abstract class Empleado {

	private String dni;
	private String apellido;
	private String nombre;
	private String mail;
	private double sueldoBase;
	
	// Abstract Method
	public abstract double calcSueldo();
	
	// Get All Data
	public String getData() {
		return "Nombre: "+getApellido()+", "+getNombre()+"\nDNI: "+getDni()+" --- Email: "+getMail();
	}
	
	// Load Data
	public void loadData(String dni, String apellido, String nombre, String mail, double sueldoBase) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.mail = mail;
		this.sueldoBase = sueldoBase;
	}
	
	// Getters and Setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
