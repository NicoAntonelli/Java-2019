package tpBress01;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Registrarse extends JFrame {
	private static final long serialVersionUID = 1L; // Serializable
	
	// Componentes
	private JTextField nombreCampoTexto, apellidoCampoTexto, usuarioCampoTexto, contraseniaCampoTexto, emailCampoTexto;
	private ArrayList<Persona> misUsuarios;

	public Registrarse(ArrayList<Persona> usuarios,LogIn principal) {
		super("Registrarse"); // Nombre del Frame
		configurarVentana(); // Mis Configuraciones
		misUsuarios = usuarios;
	
		// Crear los componentes de GUI
		JLabel nombreEtiqueta = new JLabel("Nombre");
		JLabel apellidoEtiqueta = new JLabel("Apellido");
		JLabel usuarioEtiqueta = new JLabel("Usuario");
		JLabel contraseniaEtiqueta = new JLabel("Contrase�a");
		JLabel emailEtiqueta = new JLabel("Email");
	
		JButton aceptarBoton = new JButton("Aceptar");
		JButton cancelarBoton = new JButton("Cancelar");
		JButton borrarBoton = new JButton("Borrar");
		aceptarBoton.addActionListener(
			// Clase interna
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					if(validarRegistro()) {
						borrarCampos();
						setVisible(false);
						principal.setVisible(true);
					}
				}
			} // Fin de la clase interna
		); // Fin de la llamada a addActionListener
		cancelarBoton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					setVisible(false);
					principal.setVisible(true);
				}
			}
		);
		
		borrarBoton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent evento) {
						borrarCampos();
					}
				}
			);

		// getSource() --> Para poner todas las acciones del Listener, juntas...
		
		nombreCampoTexto = new JTextField(20);
		apellidoCampoTexto = new JTextField(20);
		usuarioCampoTexto = new JTextField(20);
		contraseniaCampoTexto = new JPasswordField(20);
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
		buttons.add(cancelarBoton);

		// Agregar los componentes a la aplicaci�n
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(6,1)); // 6 Filas y 1 Columna
		contenedor.add(nombre);
		contenedor.add(apellido);
		contenedor.add(usuario);
		contenedor.add(contrasenia);
		contenedor.add(email);
		contenedor.add(buttons);
		// setSize(400,275); // --> Configuraciones aparte
		setVisible(true);
	} // Fin del constructor de Validacion
	
	// Mis Configuraciones
	public void configurarVentana() {
	    this.setTitle("Registrarse");							// T�tulo
	    this.setSize(400,275);									// Tama�o (Ancho,Alto)
	    this.setLocationRelativeTo(null);                       // Centrar Ventana en la Pantalla
	    this.setLayout(null);                                   // Layout Null, Posicionamiento Manual de Componentes
	    this.setResizable(true);                              	// Ventana Redimensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Terminar Proceso al Cerrar
	}
	
	// Maneja el evento de acci�n de aceptarBoton
	private boolean validarRegistro() {
		
		// Mensajes si el Registro est� Incorrecto
		boolean invalid = false;
		JTextArea errores = new JTextArea();
		errores.setText("El Registro Contiene Errores:\n");

		// Asegurar que no haya cuadros de texto vac�os
		if (apellidoCampoTexto.getText().equals("") ||
			nombreCampoTexto.getText().equals("") ||
			usuarioCampoTexto.getText().equals("") ||
			contraseniaCampoTexto.getText().equals("") ||
			emailCampoTexto.getText().equals("")) // Fin de la condici�n
		{
			JOptionPane.showMessageDialog(this,"Por favor llene todos los campos");
			return false;
		}
		// Si el formato de nombre es inv�lido, mostrar mensaje
		if ( !nombreCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) ) {
		// JOptionPane.showMessageDialog( this, "Nombre inv�lido" );
		errores.append("-Nombre inv�lido\n");
		invalid=true;
		}
		// Si el formato de apellido es inv�lido, mostrar mensaje
		if ( !apellidoCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) ) {
		// JOptionPane.showMessageDialog( this, "Apellido inv�lido" );
		errores.append("-Apellido inv�lido\n");
		invalid=true;
		}
		// Si el formato de usuario es inv�lido, mostrar mensaje
		if ( !usuarioCampoTexto.getText().matches( "[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$" ) ) {
		// JOptionPane.showMessageDialog( this, "Usuario inv�lido" );
		errores.append("-Usuario inv�lido\n");
		invalid=true;
		}
		// Si el formato de contrase�a es inv�lido, mostrar mensaje
		if ( !contraseniaCampoTexto.getText().matches( ".{8,}" ) ) {
		// JOptionPane.showMessageDialog( this, "Contrase�a inv�lida (8 Caracteres M�nimo)" );
		errores.append("-Contrase�a inv�lida (8 Caracteres M�nimo)\n");
		invalid=true;
		}
		// Si el formato de email es inv�lido, mostrar mensaje
		if ( !emailCampoTexto.getText().matches( "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$" ) ) {
		// JOptionPane.showMessageDialog( this, "Email inv�lido" );
			errores.append("-Email inv�lido\n");
		invalid=true;
		}
		
		// Mostrar Errores en Registro
		if (invalid) {
			JOptionPane.showMessageDialog(null, errores, "No ha podido registrarse",JOptionPane.ERROR_MESSAGE);
			// invaild=false; // Reset
			return false;
		}
		// La informaci�n es v�lida, avisar al usuario
		else { 
			registrarUsuario(usuarioCampoTexto.getText(),contraseniaCampoTexto.getText(),nombreCampoTexto.getText(),apellidoCampoTexto.getText(),emailCampoTexto.getText());
			JOptionPane.showMessageDialog(this,"Usuario "+usuarioCampoTexto.getText()+" registrado");
			return true;
		}
	} // Fin del m�todo validarRegistro
	
	public void borrarCampos() {
		usuarioCampoTexto.setText("");
		nombreCampoTexto.setText("");
		apellidoCampoTexto.setText("");
		contraseniaCampoTexto.setText("");
		emailCampoTexto.setText("");
		
	}
	
	public void registrarUsuario(String usuario,String nombre,String apellido,String contrasenia, String email) {
		Persona usu = new Persona(usuario,nombre,apellido,contrasenia,email);
		misUsuarios.add(usu);
	}
	
	public ArrayList<Persona> getMisUsuarios(){
		return misUsuarios;
	}
	
	/*
	 * private void validarExistencia() { // Asegurar que no haya cuadros de texto
	 * vac�os if (apellidoCampoTexto.getText().equals( "" ) ||
	 * nombreCampoTexto.getText().equals( "" ) ||
	 * usuarioCampoTexto.getText().equals( "" ) ||
	 * contraseniaCampoTexto.getText().equals( "" ) ||
	 * emailCampoTexto.getText().equals( "" ) ) // fin de la condici�n
	 * JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );
	 * else { // Existe ? --> Corroborar JOptionPane.showMessageDialog( this,
	 * "Usuario Eliminado" ); }
	 * 
	 * }
	 */ // Fin del m�todo validarExistencia
	
} // Fin de la clase Validacion
