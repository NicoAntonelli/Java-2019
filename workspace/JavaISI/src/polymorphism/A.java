package polymorphism;

public class A {
	protected String nombre;
	protected int id;
	
	public String getNombre() { return id + " - " + nombre; }
	public String getDesc() { return "Clase " + nombre + ": " + getNombre(); }
	public A() {nombre = "A"; id = 2;}

}
