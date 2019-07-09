package practice;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Ejercicio 25: Crear un vector con los elementos {7,5,6,8,1,2,3,4} , calcular el mayor, el
menor valor y ordenar el vector de mayor a menor
*/

public class EJ25 {

	public static void main(String[] args) {
		int arr[] = {7,5,6,8,1,2,3,4};
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int number : arr) {
			if(number>maxNum) { maxNum=number; }
			if(number<minNum) { minNum=number; }
		}
		
		// Método Burbuja
		for (int i=0; i<arr.length; i++) {
	        for (int j=0; j<arr.length-i-1; j++) {
	            if(arr[j] < arr[j+1]) {
	                int tmp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = tmp;
	            }
	        }
	    }
		
		String show = Arrays.toString(arr);
		JOptionPane.showMessageDialog(null,show+"\nMayor Valor: "+maxNum+"\nMenor Valor: "+minNum,"ARRAY!",JOptionPane.INFORMATION_MESSAGE);
		
		/*
		// Otro Método
		import java.util.ArrayLists;
		import java.util.Collections;

		ArrayList<String> list = new ArrayList<String>();
		Collections.sort(list);
		Collections.reverse(list);
		*/
		
	}
		
		

}
