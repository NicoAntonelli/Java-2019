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
		super("Validación"); // Nombre del Frame
	
		// Crear los componentes de GUI
		JLabel nombreEtiqueta = new JLabel("Nombre");
		JLabel apellidoEtiqueta = new JLabel("Apellido");
		JLabel usuarioEtiqueta = new JLabel("Usuario");
		JLabel contraseniaEtiqueta = new JLabel("Contraseña");
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

		// Agregar los componentes a la aplicación
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(6,1)); // 6 Filas y 1 Columna
		contenedor.add(nombre);
		contenedor.add(apellido);
		contenedor.add(usuario);
		contenedor.add(contrasenia);
		contenedor.add(email);
		contenedor.add(buttons);
		setSize(400,275); // Tamaño del Frame
		setVisible(true);
	} // Fin del constructor de Validacion
	
	
	// Maneja el evento de acción de aceptarBoton
	private void validarRegistro() {

		// Asegurar que no haya cuadros de texto vacíos
		if (apellidoCampoTexto.getText().equals( "" ) ||
			nombreCampoTexto.getText().equals( "" ) ||
			usuarioCampoTexto.getText().equals( "" ) ||
			contraseniaCampoTexto.getText().equals( "" ) ||
			emailCampoTexto.getText().equals( "" ) ) // Fin de la condición
		JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );
		// Si el formato de nombre es inválido, mostrar mensaje
		else if ( !nombreCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
		JOptionPane.showMessageDialog( this, "Nombre inválido" );
		// Si el formato de apellido es inválido, mostrar mensaje
		else if ( !apellidoCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
		JOptionPane.showMessageDialog( this, "Apellido inválido" );
		// Si el formato de usuario es inválido, mostrar mensaje
		else if ( !usuarioCampoTexto.getText().matches( "[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$" ) )
		JOptionPane.showMessageDialog( this, "Usuario inválido" );
		// Si el formato de contraseña es inválido, mostrar mensaje
		else if ( !contraseniaCampoTexto.getText().matches( ".{8,}" ) )
		JOptionPane.showMessageDialog( this, "Contraseña inválida (8 Caracteres Mínimo)" );
		// Si el formato de email es inválido, mostrar mensaje
		else if ( !emailCampoTexto.getText().matches( "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$" ) )
		JOptionPane.showMessageDialog( this, "Email inválido" );
		else // La información es válida, avisar al usuario
		JOptionPane.showMessageDialog( this, "Gracias" ); // COMO LO GUARDO???
	
	} // Fin del método validarRegistro
	
	// Maneja el evento de acción de borrarBoton
	private void validarExistencia() {
		// Asegurar que no haya cuadros de texto vacíos
		if (apellidoCampoTexto.getText().equals( "" ) ||
			nombreCampoTexto.getText().equals( "" ) ||
			usuarioCampoTexto.getText().equals( "" ) ||
			contraseniaCampoTexto.getText().equals( "" ) ||
			emailCampoTexto.getText().equals( "" ) ) // fin de la condición
		JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );
		else {
			// Existe ? --> Corroborar
			JOptionPane.showMessageDialog( this, "Usuario Eliminado" );
		}

	} // Fin del método validarExistencia
	
} // Fin de la clase Validacion
