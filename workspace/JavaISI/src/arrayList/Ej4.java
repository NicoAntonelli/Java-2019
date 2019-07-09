package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Leer un entero y luego una lista de 20 enteros.
// Guardar los mayores al número inicial y mostrarlos al final.
public class Ej4 {
	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		int number;
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		
		System.out.print("Ingrese Primer Número: ");
		number = Integer.parseInt(escaner.nextLine());
		
		System.out.println();
		System.out.println("Ingrese 20 Números");
		
		// Puede ser con while y "cero" para salir
		int unNum=0;
		for (int i=0; i<20; i++) {
			// escaner.nextInt
			unNum = Integer.parseInt(escaner.nextLine());
			if(unNum>number && !numArr.contains(unNum)) { numArr.add(unNum); }
		}
		
		System.out.println();
		System.out.println("Números mayores al primero ingresado:");
		for(int num : numArr) {
			System.out.println(num);
		}
		
		escaner.close();

	}
}
