package firstPractice;

import java.util.Scanner;

public class Sintaxis_Ej1 {

	public static void main(String[] args) {
		// Practicamos For-Each y Scanner
		
		String[] palabras = new String[20];
		Scanner escaner = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			System.out.print("Ingrese Palabra " + (i + 1) + ": ");
			palabras[i] = escaner.nextLine();
		}

		System.out.println();
		System.out.println("PALABRAS INGRESADAS (Forma Inversa):");
		for (int j = (palabras.length - 1); j >= 0; j--) {
			System.out.println("Palabra " + (j + 1) + ": " + palabras[j]);
		}

		System.out.println();
		System.out.println("For Each: ");
		for (String pal : palabras) {
			System.out.println(pal);
		}

		System.out.println();
		System.out.print("Ingrese palabra a buscar: ");
		String unaPal = escaner.nextLine();
		boolean found = false;
		for (String pal : palabras) {
			if (pal.equals(unaPal)) {
				found = true;
				break;
			}
			// equals compara caracteres, el == compara si el objeto es el mismo
			// puedo usar "equalsIgnoreCase"
		}
		if (found) {
			System.out.print("La palabra existe");
		} else {
			System.out.print("La palabra no se encuentra");
		}

		escaner.close();

		/*
		 * String[] palabras = new String[10]; palabras[0]="Hola"; palabras[9] =
		 * "Adiós"; for(int i=0;i<10;i++) { System.out.println(palabras[i]); }
		 */
	}

}
