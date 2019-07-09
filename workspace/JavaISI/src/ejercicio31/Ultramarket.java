package ejercicio31;

import java.util.Map;
import java.util.HashMap; // Keys and Values
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Ultramarket {
	
	// Attributes
	private HashMap<String,Double> products;
	private HashMap<String,Double> list;
	
	// Constructor
	public Ultramarket() {
		products = new HashMap<String,Double>();
		list = new HashMap<String,Double>();
	}
	
	// Load List of Products
	public void initialize() {
		this.products.put("Xiaomi Redmi Note 7",12000.00);
		this.products.put("PlayStation 4 Pro 2TB",14500.50);
		this.products.put("TV LED 4K Sony 64''",81999.99);
		this.products.put("Chocolate Cofler del Himalaya",3399.99);
		this.products.put("Agua Mineral Villavicencio 500ml",29.50);
		this.products.put("Alfajor Turimar Doble",20.25);
		this.products.put("Alfajor Turimar Triple",23.75);
	}
	
	// Show the Product List
	public Object showProductos() {
		// String Array for JCombobox
		String[] actProducts = new String[products.size()+1];
		actProducts[0] = "SELECCIONAR UNO";
		
		// Map to Iterate all Products and Fill String Array
		Map<String,Double> map = this.products;
		int i=1;
		for (Map.Entry<String,Double> entry : map.entrySet()) {
			actProducts[i] = (entry.getKey()+" - Precio: $"+entry.getValue());
			i++;
		}
		
		// Show JCombobox with all the Products
		Object venta = "SELECCIONAR UNO";
		while (venta=="SELECCIONAR UNO") {
			venta = JOptionPane.showInputDialog(
				null,
				"Seleecione de a uno los elementos a comprar:",
				"NICO'S ULTRAMARKET",
				JOptionPane.QUESTION_MESSAGE,
				null,
				actProducts,
				"SELECCIONAR UNO");
			if (venta == "SELECCIONAR UNO") {
				System.out.println("No se seleccionó nada!");
			}
		}
		
		return venta;
	}
	
	// Principal Menu
	public void menu() {
		boolean seguir=true;
		boolean confirmation=false;
		while(seguir) {
			Object venta = this.showProductos();
			if (venta!=null) {
				// Cast (UnBoxing) Object in (Object.toString())
				String key = (venta.toString()).substring(0,(venta.toString()).indexOf('-')-1);
				this.list.put(key,products.get(key));
				System.out.println("Nuevo elemento en carrito de compras: "+venta);
				
				int seleccion = JOptionPane.showOptionDialog(
						null,
						"El Producto fue Agregado al Carrito, Desea Agregar más productos?",
						"CONFIRMAR VENTA",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						new Object[] { "Agregar Otro", "Finalizar Venta" },
						"Agregar Otro");
					if (seleccion != -1) {
						if(seleccion==0) { seguir=true; }
						else { seguir=false; confirmation=true; }
					} else {
						System.out.println("Se ha cerrado el Cuadro de Diálogo");
						System.out.println("VENTA CANCELADA");
						seguir=false;
					}
				
			} else {
				System.out.println("Se ha cancelado, o cerrado el Cuadro de Diálogo");
				System.out.println("VENTA CANCELADA");
				seguir=false;
			}
			System.out.println();
		}
		
		// Only if the Menu wasn't closed
		if(confirmation) {
			this.moneyTime();
		}
	}
	
	public void moneyTime() {
		double total = 0;
		// Map to Iterate all Products and Fill String Array
		Map<String,Double> map = this.list;
		JTextArea display = new JTextArea();
		display.setText("PRODUCTOS:");
		for (Map.Entry<String,Double> entry : map.entrySet()) {
			display.append("\n"+entry.getKey()+" - Precio: $"+entry.getValue());
			total += entry.getValue();
		}
		display.append("\n\nTOTAL: $"+total);
		System.out.println("Puede ver el Carrito de Compras. Precio Final: $"+total);
		JOptionPane.showMessageDialog(null, display, "Carrito de Compras",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
