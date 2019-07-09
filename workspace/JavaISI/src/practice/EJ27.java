package practice;

import java.util.Scanner;

// import javax.swing.JOptionPane;

// Ejercicio 27: Cargar por teclado una matriz de n filas y m columnas. Mostrar el resultado por pantalla.

public class EJ27 {

	public static void main(String[] args) {
		
		// Cargo Dimensión de Matriz NxM
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduzca cantidad de Filas de la Matriz: ");
		int N = escaner.nextInt();
		System.out.print("Introduzca cantidad de Columnas de la Matriz: ");
		int M = escaner.nextInt();
		
		// Cargo Matriz
		int matrix[][] = new int[N][M];
		System.out.println();
		System.out.println("Cargar Matriz de "+N+"x"+M+":");
		for (int i=0; i<N; i++) {
	        for (int j=0; j<M; j++) {
	        	System.out.print("Introduzca el elemento [" + i + "," + j + "]: ");
	            matrix[i][j] = escaner.nextInt();
	        }
	    }
		escaner.close();
		
		// Exhibo Matriz
		System.out.println();
		System.out.println("Matriz de "+N+"x"+M+":");
		for (int x=0; x < matrix.length; x++) {
			for (int y=0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
		
	}

}
