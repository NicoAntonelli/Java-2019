package polymorphism;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Objeto A con Tipo Din�mico B:");
		A unObj = new B();
		System.out.println(unObj.getNombre());
		System.out.println(unObj.getDesc());
		System.out.println();
		
		System.out.println("Objeto B con Tipo Din�mico B:");
		B otroObj = new B();
		System.out.println(otroObj.getNombre());
		System.out.println(otroObj.getDesc());
		
	}

}
