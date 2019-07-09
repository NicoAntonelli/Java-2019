package firstPractice;

import java.util.Scanner;

public class Sintaxis_Ej2 {

	public static void main(String[] args) {
		// Leer un entero, luego leer 5 enteros más
		// Guardar solo los mayores al primero, y mostrarlos al final
		
		Scanner escaner = new Scanner(System.in);
		int number, cantidad=0;
		int numArr[] = new int[6];
		
		System.out.print("Ingrese Primer Número: ");
		number = Integer.parseInt(escaner.nextLine());
		
		System.out.println();
		System.out.println("Ingrese 5 Números");
		
		int unNum=0;
		for (int i=0; i<5; i++) {
			// escaner.nextInt
			unNum = Integer.parseInt(escaner.nextLine());
			if(unNum>number) { numArr[cantidad]=unNum; cantidad++; }
		}
		
		System.out.println();
		System.out.println("Números mayores al primero ingresado:");
		for(int i=0; i<cantidad; i++) {
			System.out.println(numArr[i]);
		}
		
		escaner.close();

	}

}
