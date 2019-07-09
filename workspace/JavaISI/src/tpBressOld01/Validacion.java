package tpBressOld01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Validacion extends JFrame {
	private static final long serialVersionUID = 1L; // Serializable
	private JTextField nombreCampoTexto, apellidoCampoTexto, usuarioCampoTexto, contraseniaCampoTexto, emailCampoTexto;

	public static void main(String args[])  {
		Validacion aplicacion = new Validacion();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Frame
	}

	public Validacion() {
		super("Validaci�n"); // Nombre del Frame
	
		// Crear los componentes de GUI
		JLabel nombreEtiqueta = new JLabel("Nombre");
		JLabel apellidoEtiqueta = new JLabel("Apellido");
		JLabel usuarioEtiqueta = new JLabel("Usuario");
		JLabel contraseniaEtiqueta = new JLabel("Contrase�a");
		JLabel emailEtiqueta = new JLabel("Email");
	
		JButton aceptarBoton = new JButton("Aceptar");
		JButton borrarBoton = new JButton("Borrar");
		aceptarBoton.addActionListener(
			// Clase interna
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					validarRegistro();
				}
			} // Fin de la clase interna
		); // Fin de la llamada a addActionListener
		borrarBoton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					validarExistencia();
				}
			}
		);

		// getSource() --> Para poner todas las acciones del Listener, juntas...
		
		nombreCampoTexto = new JTextField(20);
		apellidoCampoTexto = new JTextField(20);
		usuarioCampoTexto = new JTextField(20);
		contraseniaCampoTexto = new JTextField(20);
		emailCampoTexto = new JTextField(20);

		JPanel nombre = new JPanel();
		nombre.add(nombreEtiqueta);
		nombre.add(nombreCampoTexto);

		JPanel apellido = new JPanel();
		apellido.add(apellidoEtiqueta);
		apellido.add(apellidoCampoTexto);

		JPanel usuario = new JPanel();
		usuario.add(usuarioEtiqueta);
		usuario.add(usuarioCampoTexto);

		JPanel contrasenia = new JPanel();
		contrasenia.add(contraseniaEtiqueta);
		contrasenia.add(contraseniaCampoTexto);

		JPanel email = new JPanel();
		email.add(emailEtiqueta);
		email.add(emailCampoTexto);

		JPanel buttons = new JPanel();
		buttons.add(aceptarBoton);
		buttons.add(borrarBoton);

		// Agregar los componentes a la aplicaci�n
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(6,1)); // 6 Filas y 1 Columna
		contenedor.add(nombre);
		contenedor.add(apellido);
		contenedor.add(usuario);
		contenedor.add(contrasenia);
		contenedor.add(email);
		contenedor.add(buttons);
		setSize(400,275); // Tama�o del Frame
		setVisible(true);
	} // Fin del constructor de Validacion
	
	
	// Maneja el evento de acci�n de aceptarBoton
	private void validarRegistro() {

		// Asegurar que no haya cuadros de texto vac�os
		if (apellidoCampoTexto.getText().equals( "" ) ||
			nombreCampoTexto.getText().equals( "" ) ||
			usuarioCampoTexto.getText().equals( "" ) ||
			contraseniaCampoTexto.getText().equals( "" ) ||
			emailCampoTexto.getText().equals( "" ) ) // Fin de la condici�n
		JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );
		// Si el formato de nombre es inv�lido, mostrar mensaje
		else if ( !nombreCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
		JOptionPane.showMessageDialog( this, "Nombre inv�lido" );
		// Si el formato de apellido es inv�lido, mostrar mensaje
		else if ( !apellidoCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
		JOptionPane.showMessageDialog( this, "Apellido inv�lido" );
		// Si el formato de usuario es inv�lido, mostrar mensaje
		else if ( !usuarioCampoTexto.getText().matches( "[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$" ) )
		JOptionPane.showMessageDialog( this, "Usuario inv�lido" );
		// Si el formato de contrase�a es inv�lido, mostrar mensaje
		else if ( !contraseniaCampoTexto.getText().matches( ".{8,}" ) )
		JOptionPane.showMessageDialog( this, "Contrase�a inv�lida (8 Caracteres M�nimo)" );
		// Si el formato de email es inv�lido, mostrar mensaje
		else if ( !emailCampoTexto.getText().matches( "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$" ) )
		JOptionPane.showMessageDialog( this, "Email inv�lido" );
		else // La informaci�n es v�lida, avisar al usuario
		JOptionPane.showMessageDialog( this, "Gracias" ); // COMO LO GUARDO???
	
	} // Fin del m�todo validarRegistro
	
	// Maneja el evento de acci�n de borrarBoton
	private void validarExistencia() {
		// Asegurar que no haya cuadros de texto vac�os
		if (apellidoCampoTexto.getText().equals( "" ) ||
			nombreCampoTexto.getText().equals( "" ) ||
			usuarioCampoTexto.getText().equals( "" ) ||
			contraseniaCampoTexto.getText().equals( "" ) ||
			emailCampoTexto.getText().equals( "" ) ) // fin de la condici�n
		JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );
		else {
			// Existe ? --> Corroborar
			JOptionPane.showMessageDialog( this, "Usuario Eliminado" );
		}

	} // Fin del m�todo validarExistencia
	
} // Fin de la clase Validacion
