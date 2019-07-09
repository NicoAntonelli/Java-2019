package entidadesUI;

// import entidades.Persona;
import entidades.*;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setDni("12121212");
		p.setApellido("Pérez");
		p.setNombre("Juan");
		// System.out.println(p.getNombre()+" "+p.getApellido());
		System.out.println(p.getDetalle());
		
		Persona p2 = new Persona("1234","Pepe","ElPepe");
		System.out.println(p2.getDetalle(false));
		System.out.println(p2.getDetalle(true));
		
		Alumno a = new Alumno("40905168","Antonelli","Nicolás",44852);
		System.out.println(a.getDetalle());
		
		// Unboxing (Cast): Uso métodos de una clase hijo en un objeto de la superclase
		Persona a2 = new Alumno();
		// a2.getDetalleAlumno();
		System.out.println(((Alumno)a2).getDetalleAlumno());
	}

}
