package polymorphism;

public class B extends A {
	public B() { nombre = "B"; id++; }
	
	public String getNombre() { return nombre; }
	public String getDesc() { return super.getDesc()+" - clase hija"; }

}
