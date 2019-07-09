package practice;

import java.util.Scanner;

// import javax.swing.JOptionPane;

// Ejercicio 28: Cargar por teclado una matriz de cuadrada de n filas y columnas. Mostrar el valor de la diagonal principal y el de la diagonal secundaria

public class EJ28 {

	public static void main(String[] args) {
		
		// Cargo Dimensión de Matriz N
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduzca dimensión de la Matriz Cuadrada: ");
		int N = escaner.nextInt();
		
		// Cargo Matriz
		int matrix[][] = new int[N][N];
		System.out.println();
		System.out.println("Cargar Matriz de "+N+"x"+N+":");
		for (int i=0; i<N; i++) {
	        for (int j=0; j<N; j++) {
	        	System.out.print("Introduzca el elemento [" + i + "," + j + "]: ");
	            matrix[i][j] = escaner.nextInt();
	        }
	    }
		escaner.close();
		
		// Exhibo Matriz
		System.out.println();
		System.out.println("Matriz de "+N+"x"+N+":");
		for (int x=0; x < matrix.length; x++) {
			for (int y=0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
		
		// Calculo Diagonales
		int diagPrinc = 1;
		int diagSec = 1;
		for (int i=0; i<N; i++) {
			diagPrinc=diagPrinc*matrix[i][i];
			diagSec=diagSec*matrix[i][N-i-1];
		}
		
		// Exhibo Productos
		System.out.println();
		// String show = String.valueOf(diagPrinc*diagSec);
		System.out.println("Valor de Diagonal Principal: "+diagPrinc);
		System.out.println("Valor de Diagonal Secundaria: "+diagSec);
		
	}

}
