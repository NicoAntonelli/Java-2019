package tpBressOld01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame {
	private static final long serialVersionUID = 8042780053883136226L;
	private JTextField usuarioCampoTexto, contraseniaCampoTexto;

	public static void main(String args[])  {
		Login aplicacion = new Login();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Frame
	}

	public Login() {
		super("Login"); // Nombre del Frame
		
		// Crear los componentes de GUI
		JLabel usuarioEtiqueta = new JLabel("Usuario");
		JLabel contraseniaEtiqueta = new JLabel("Contraseña");
	
		JButton aceptarBoton = new JButton("Aceptar");
		JButton borrarBoton = new JButton("Borrar");
		JButton unirseBoton = new JButton("Unirse!");
		aceptarBoton.addActionListener(
			// Clase interna
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					validarLogin();
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
		unirseBoton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent evento) {
						callUnirse();
					}
				}
			);

		// getSource() --> Para poner todas las acciones del Listener, juntas...
		
		usuarioCampoTexto = new JTextField(20);
		contraseniaCampoTexto = new JTextField(20);

		JPanel usuario = new JPanel();
		usuario.add(usuarioEtiqueta);
		usuario.add(usuarioCampoTexto);

		JPanel contrasenia = new JPanel();
		contrasenia.add(contraseniaEtiqueta);
		contrasenia.add(contraseniaCampoTexto);

		JPanel buttons = new JPanel();
		buttons.add(aceptarBoton);
		buttons.add(borrarBoton);
		buttons.add(unirseBoton);
		
		// Agregar los componentes a la aplicación
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(3,1)); // 3 Filas y 1 Columna
		contenedor.add(usuario);
		contenedor.add(contrasenia);
		contenedor.add(buttons);
		setSize(400,200); // Tamaño del Frame
		setVisible(true);
	} // Fin del constructor de Login
	
	
	// Maneja el evento de acción de aceptarBoton
	private void validarLogin() {
		// Asegurar que no haya cuadros de texto vacíos
		if (usuarioCampoTexto.getText().equals("") || contraseniaCampoTexto.getText().equals("")) {
			JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" ); }
		// Si el formato de usuario es inválido, mostrar mensaje
		else if ( !usuarioCampoTexto.getText().matches( "[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$" ) )
		JOptionPane.showMessageDialog( this, "Usuario inválido" );
		// Si el formato de contraseña es inválido, mostrar mensaje
		else if ( !contraseniaCampoTexto.getText().matches( ".{8,}" ) )
		JOptionPane.showMessageDialog( this, "Contraseña inválida (8 Caracteres Mínimo)" );
		else // La información es válida, avisar al usuario
			// NO SE COMO BUSCAR SI EXISTE!
		JOptionPane.showMessageDialog( this, "Gracias" );
	
	} // Fin del método validarRegistro
	
	// Maneja el evento de acción de borrarBoton
	private void validarExistencia() {
		// Asegurar que no haya cuadros de texto vacíos
		if (usuarioCampoTexto.getText().equals("") || contraseniaCampoTexto.getText().equals("")) {
			JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" ); }
		else {
			// Existe ? --> Corroborar
			JOptionPane.showMessageDialog( this, "Usuario Eliminado" );
		}
	} // Fin del método validarExistencia
		
	// Maneja el evento de la acción unirseBoton
	private void callUnirse() {
		// NO SE COMO LLAMAR EL OTRO
		JOptionPane.showMessageDialog( this, "---ABRIR VALIDACION REGISTRARSE---" );
	} // Fin del método callUnirse

} // Fin de la clase Login
