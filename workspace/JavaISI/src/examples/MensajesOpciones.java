package examples;

import javax.swing.JOptionPane;

public class MensajesOpciones {

	public static void main(String[] args) {
		
		// Mensaje Sencillo
		JOptionPane.showMessageDialog(
				null, // componente padre/ventana
				"El cielo es de color azul",
				"Di�logo sencillo",
				JOptionPane.PLAIN_MESSAGE);
				// JOptionPane.ERROR_MESSAGE
		
		// Mensaje Multiopci�n
		int seleccion = JOptionPane.showOptionDialog(
			null, // componente padre
			"Seleccione opci�n",
			"SELECTOR DE OPCIONES",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, // null para icono por defecto.
			new Object[] { "Opci�n 1", "Opci�n 2", "Opci�n 3" }, // null para YES, NO y CANCEL
			"Opci�n 1");
		if (seleccion != -1) {
			System.out.println("Seleccionada Opci�n " + (seleccion + 1));
		} else {
			System.out.println("Se ha cerrado el Cuadro de Di�logo");
		}
				
		// Input con Caja de Texto
		String seleccion2 = JOptionPane.showInputDialog(
			null, // componente padre
			"Input Dialog",
			JOptionPane.QUESTION_MESSAGE); // el icono ser� un interrogante
		if (seleccion2 != null) {
			System.out.println("El usuario ha escrito "+seleccion2);
		} else {
			System.out.println("El usuario no ha escrito nada");
		}
		
		// Con JCombobox
		Object seleccion3 = JOptionPane.showInputDialog(
			null, // componente padre
			"Seleccione Opci�n",
			"SELECTOR DE OPCIONES",
			JOptionPane.QUESTION_MESSAGE,
			null, // null para icono defecto
			new Object[] { "Opci�n 1", "Opci�n 2", "Opci�n 3" },
			"Opci�n 1");
		if (seleccion3 != null) {
			System.out.println("El usuario ha elegido "+seleccion3);
		} else {
			System.out.println("Se ha cerrado el Cuadro de Di�logo");
		}
		
	}

}
