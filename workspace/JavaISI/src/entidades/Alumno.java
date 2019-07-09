package entidades;

public class Alumno extends Persona {
	private int legajo;
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public Alumno() {
		this.legajo=0;
	}
	public Alumno(int legajo) {
		this.legajo=legajo;
	}
	public Alumno(String dni, String apellido, String nombre, int legajo) {
		super(dni,apellido,nombre);
		this.legajo = legajo;
	}
	public String getDetalle() {
		return "Legajo: "+this.legajo+" - "+super.getDetalle();
	}
	
	public String getDetalleAlumno() {
		return "Alumno: "+this.getDetalle();
	}
}
