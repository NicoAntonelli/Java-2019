package practice;

import java.util.Scanner;

// import javax.swing.JOptionPane;

/*
Ejercicio 29: Cargar por teclado una matriz de 4 filas y 4 columnas.
Mostrar el valor del producto de la diagonal principal por el de la diagonal secundaria
*/

public class EJ29 {

	public static void main(String[] args) {
		
		// Cargo Matriz
		int matrix[][] = new int[4][4];
		Scanner escaner = new Scanner(System.in);
		System.out.println("Cargar Matriz de 4x4:\n");
		for (int i=0; i<4; i++) {
	        for (int j=0; j<4; j++) {
	        	System.out.print("Introduzca el elemento [" + i + "," + j + "]: ");
	            matrix[i][j] = escaner.nextInt();
	        }
	    }
		escaner.close();
		
		// Exhibo Matriz
		System.out.println();
		System.out.println("Matriz de 4x4:");
		for (int x=0; x < matrix.length; x++) {
			for (int y=0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
		
		// Calculo y Exhibo Producto
		int diagPrinc = matrix[0][0]+matrix[1][1]+matrix[2][2]+matrix[3][3];
		int diagSec = matrix[0][3]+matrix[1][2]+matrix[2][1]+matrix[3][0];
		String show = String.valueOf(diagPrinc*diagSec);
		System.out.println();
		System.out.println("Valor del Producto entre Diagonales: "+show);
		
	}

}
