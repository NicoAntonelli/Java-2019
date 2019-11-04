package practiceExam;

public abstract class Empleado {
	private String legajo;
	private String apellido;
	private String nombre;
	private Double sueldoBasico;
	private Sector sector;
	
	// Important!!!
	public abstract Double getSueldo();
	
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
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
	public Double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
}
