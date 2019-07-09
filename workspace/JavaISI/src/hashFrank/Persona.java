package hashFrank;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	
	public Persona(int dni, String nombre, String apellido) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	public Persona() {}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
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
	
	@Override
	public String toString() {
		return this.getDni()+" "+this.getNombre()+" "+this.getApellido();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}
	
	
	
}
