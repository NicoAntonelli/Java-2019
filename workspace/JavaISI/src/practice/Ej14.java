package practice;

import java.util.Scanner;
import java.util.ArrayList;

/*
Ejercicio 14: Escriba una aplicación que permita conocer el costo de una compra.
La selección puede ser hecha entre 5 artículos diferentes. (Uso de while y switch)
*/

public class Ej14 {
	public static void main(String[] args) {
		
		// Variables Principales
		Scanner escaner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int option = -1;
		int resp = 0;
		boolean seguir=true;
		// int cantProd = 0;
		float total = 0;
		
		System.out.println("NICO'S CONSOLE OLD MARKET\n");
		System.out.println("Ingrese Número de Producto ('0' = CANCELAR)\n");
		System.out.println("1- Xiaomi Redmi Note 7 - Precio: $12.000\n"+
			"2- PlayStation 4 Pro 2TB - Precio: $14.000\n"+
			"3- TV LED 4K Sony 64'' - Precio: $80.000\n"+
			"4- Chocolate Cofler del Himalaya - Precio: $4.000\n"+
			"5- Agua Mineral Villavicencio 500ml - Precio: $30\n");
		while (seguir) {
			System.out.print("Ingrese Opción del 1 al 5: ");
			option = escaner.nextInt();
			while (option<0||option>5) {
				System.out.print("Ingrese Opción del 1 al 5: ");
				option = escaner.nextInt();
			}
			
			String prod = "";
			float prec = 0;
			switch(option) {
				case 1:
					prod = "Xiaomi Redmi Note 7";
					prec = 12000;
					break;
				case 2:
					prod = "PlayStation 4 Pro 2TB";
					prec = 14000;
					break;
				case 3:
					prod = "TV LED 4K Sony 64''";
					prec = 80000;
					break;
				case 4:
					prod = "Chocolate Cofler del Himalaya";
					prec = 4000;
					break;
				case 5:
					prod = "Agua Mineral Villavicencio 500ml";
					prec = 30;
					break;
				default:
					resp=1;
					seguir=false;
					break;
			}
			
			if(seguir) {
				total+=prec;
				// cantProd++;
				list.add(prod);
				System.out.println(prod+" Agregado al Carrito! - SubTotal: $"+total);
			
				System.out.println();
				while(resp!=1&&resp!=2) {
					System.out.print("Desea Finalizar la Venta (1) o agregar otro producto al Carrito(2)?: ");
					resp = escaner.nextInt();
				}
				
				if (resp==2) { resp=0; seguir=true; }
				else { seguir=false; }
				
			} else { System.out.println("VENTA CANCELADA"); }
		}
		
		if (option!=0) {
			System.out.println();
			System.out.println("PRODUCTOS: ");
			for(String prods : list) {
				System.out.println(prods);
			}
			System.out.println();
			System.out.println("TOTAL A PAGAR: $"+total);
		}
		
		escaner.close();
		
	}

}
