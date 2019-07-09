package examples;

import javax.swing.JOptionPane;

public class MensajesOpciones {

	public static void main(String[] args) {
		
		// Mensaje Sencillo
		JOptionPane.showMessageDialog(
				null, // componente padre/ventana
				"El cielo es de color azul",
				"Diálogo sencillo",
				JOptionPane.PLAIN_MESSAGE);
				// JOptionPane.ERROR_MESSAGE
		
		// Mensaje Multiopción
		int seleccion = JOptionPane.showOptionDialog(
			null, // componente padre
			"Seleccione opción",
			"SELECTOR DE OPCIONES",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, // null para icono por defecto.
			new Object[] { "Opción 1", "Opción 2", "Opción 3" }, // null para YES, NO y CANCEL
			"Opción 1");
		if (seleccion != -1) {
			System.out.println("Seleccionada Opción " + (seleccion + 1));
		} else {
			System.out.println("Se ha cerrado el Cuadro de Diálogo");
		}
				
		// Input con Caja de Texto
		String seleccion2 = JOptionPane.showInputDialog(
			null, // componente padre
			"Input Dialog",
			JOptionPane.QUESTION_MESSAGE); // el icono será un interrogante
		if (seleccion2 != null) {
			System.out.println("El usuario ha escrito "+seleccion2);
		} else {
			System.out.println("El usuario no ha escrito nada");
		}
		
		// Con JCombobox
		Object seleccion3 = JOptionPane.showInputDialog(
			null, // componente padre
			"Seleccione Opción",
			"SELECTOR DE OPCIONES",
			JOptionPane.QUESTION_MESSAGE,
			null, // null para icono defecto
			new Object[] { "Opción 1", "Opción 2", "Opción 3" },
			"Opción 1");
		if (seleccion3 != null) {
			System.out.println("El usuario ha elegido "+seleccion3);
		} else {
			System.out.println("Se ha cerrado el Cuadro de Diálogo");
		}
		
	}

}
