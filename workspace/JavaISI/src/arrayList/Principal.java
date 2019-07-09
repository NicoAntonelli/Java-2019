package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean cont = true;
		ArrayList<String> palabras = new ArrayList<String>();
		
		while(cont) {
			System.out.print("Ingrese Palabra: ");
			String pal=s.nextLine();
			
			palabras.add(pal);
			
			System.out.print("�Desea Continuar? (S/N): ");
			cont = (s.nextLine().equalsIgnoreCase("s"));
		}
		
		System.out.println("Palabras Ingresadas: "+palabras.size());
		System.out.println("------------------------");
		for (String pal : palabras) {
			System.out.println(pal);
		}
		
		System.out.println();
		System.out.println("�ltima Palabra Ingresada: "+palabras.get(palabras.size()-1));
		System.out.println();
		System.out.println("Ingrese Palabra a Buscar");
		String aBuscar = s.nextLine();
		String contiene;
		
		if(palabras.contains(aBuscar)) {
			// Containts utiliza el m�todo equals de la clase asociada al ArrayList
			// Es String, por lo que distingue de may�sculas y minuscukas
			contiene="si";
		} else {
			contiene="no";
		}
		
		System.out.println("El ArrayList 'palabras' "+contiene+" tiene la palabra "+aBuscar+" en la posici�n: "+palabras.indexOf(aBuscar));
		// Si no lo encuentra, indexOf retorna -1
		
		System.out.println();
		System.out.println("Ingrese Palabra a insertar:");
		String aInsertar = s.nextLine();
		System.out.print("Ingrese Posici�n para insertarla: ");
		int pos = Integer.parseInt(s.nextLine());
		palabras.add(pos,aInsertar);
		
		System.out.println();
		System.out.println("Ingrese Palabra de reemplazo:");
		String aReemplazar = s.nextLine();
		System.out.print("Ingrese Posici�n para reemplazar: ");
		int posRemp = Integer.parseInt(s.nextLine());
		palabras.set(posRemp,aReemplazar);
		
		System.out.println();
		System.out.println("Palabras Modificadas: ");
		System.out.println("------------------------");
		for (String pal : palabras) {
			System.out.println(pal);
		}
		
		System.out.println();
		System.out.println("Ingrese Palabra a eliminar:");
		String aEliminar = s.nextLine();
		palabras.remove(aEliminar);
		
		System.out.println();
		System.out.print("Ingrese Posici�n para eliminar otra palabra: ");
		int posEliminar = Integer.parseInt(s.nextLine());
		palabras.remove(posEliminar);
		
		System.out.println();
		System.out.println("Palabras Modificadas: ");
		System.out.println("------------------------");
		for (String pal : palabras) {
			System.out.println(pal);
		}
		
		s.close();
		// Hacer el EJ4 y EJ5 ArrayList
		
	}

}
