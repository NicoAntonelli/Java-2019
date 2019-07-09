package entidades;

public class Persona {

	// Constructor
	public Persona(String dni, String nombre, String apellido) {
		// super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// Constructor Overload
	public Persona() {
		// Empty
	}
	
	// Getters and Setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	
	// Other Methods
	public String getDetalle(boolean datosSensibles) {
		String info="";
		if (datosSensibles) {
			info = "DNI: "+this.getDni()+" - Nombre: "+this.getApellido()+" "+this.getNombre();
		} else {
			info = "Nombre: "+this.getApellido()+" "+this.getNombre();
		}
		return info;
	}
	
	public String getDetalle() {
		return this.getDetalle(true);
	}
	
	// Variables
	private String dni;
	private String nombre;
	private String apellido;
}


