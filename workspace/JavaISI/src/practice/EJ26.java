package practice;

/*
Ejercicio 26: Crear una matriz de 2 por 2 con los elementos {7,5,6,8},
calcular la cantidad de filas y la cantidad de columnas.
*/

public class EJ26 {

	public static void main(String[] args) {
		
		// Cargo Matriz
		int matrix[][] = {{7,5},{8,6}};
		
		// Exhibo Matriz y Calculo
		int filas=0;
		int columnas=0;
		System.out.println("Matriz de 2x2:");
		for (int x=0; x<2; x++) {
			for (int y=0; y<2; y++) {
				System.out.print(matrix[x][y]);
				if(x==0) { filas++; }
			}
			System.out.println();
			columnas++;
		}
		System.out.println();
		System.out.println("Columnas: "+columnas);
		System.out.println("Filas: "+filas);
	}

}
