package tpBress01;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class LogIn extends JFrame {    
	private static final long serialVersionUID = -4199597382147743442L; // Serializable
	
	// Componentes
	private JTextField usuarioCampo, contraseniaCampo;
				
	public LogIn(ArrayList<Persona> usuarios) {       
		super("LogIn"); // Nombre del Frame
		configurarVentana(); // Mis Configuraciones
		JLabel usuarioEtiqueta = new JLabel("Usuario");      
		JLabel contraseniaEtiqueta = new JLabel("Contraseña");                       
		JButton aceptarBoton = new JButton("Aceptar"); 
		JButton borrarBoton = new JButton("Borrar");
		JButton registrarBoton = new JButton("Registrar");
		usuarioCampo = new JTextField(15); 
		contraseniaCampo = new JPasswordField(15); 
		
		JPanel usuario = new JPanel();       
		usuario.add(usuarioEtiqueta);       
		usuario.add(usuarioCampo); 
		
		JPanel contrasenia = new JPanel();       
		contrasenia.add(contraseniaEtiqueta);       
		contrasenia.add(contraseniaCampo); 
		
		JPanel botones = new JPanel();       
		botones.add(aceptarBoton); 
		botones.add(borrarBoton);      
		botones.add(registrarBoton); 
		
		LogIn ventana = this;
		
		aceptarBoton.addActionListener(                        
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {                
					if (validar(usuarios)) {
						// JOptionPane.showMessageDialog(null,"Bienvenido usuario "+usuarioCampo.getText());
						ingresar(usuarioCampo.getText(),ventana);
						borrarCampos();
						setVisible(false);
					};             
				}                          
		}); 
		
		
		
		registrarBoton.addActionListener(                        
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					borrarCampos();
					setVisible(false);
					registrarse(usuarios,ventana);
				}                          
		}); 	
		
		borrarBoton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					borrarCampos();
				}
		});
		
		Container contenedor = getContentPane();
		contenedor.setLayout( new GridLayout(6,1)); 
		contenedor.add(usuario);
		contenedor.add(contrasenia);
		contenedor.add(botones);
		
		// setSize(400,250); // --> Configuraciones aparte
		setVisible(true);
					
	}
	
	// Mis Configuraciones
	public void configurarVentana() {
	    this.setTitle("NickApp");								// Título
	    this.setSize(400,250);									// Tamaño (Ancho,Alto)
	    this.setLocationRelativeTo(null);                       // Centrar Ventana en la Pantalla
	    this.setLayout(null);                                   // Layout Null, Posicionamiento Manual de Componentes
	    this.setResizable(true);                              	// Ventana Redimensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Terminar Proceso al Cerrar
	}
	
	public void registrarse(ArrayList<Persona> usuarios, LogIn ventana) {
		Registrarse logOn = new Registrarse(usuarios,ventana);
		usuarios = logOn.getMisUsuarios();
		
		/* Testing
		JTextArea cartel = new JTextArea();
		cartel.setText("Usuarios: \n");
		for(Persona usu : usuarios) {
			cartel.append("USUARIO : "+usu.getUsuario()+"  ///  CONTRASEÑA: "+usu.getContrasenia()+"\n");
		}
		JOptionPane.showMessageDialog(null, cartel);
		*/
		
		logOn.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public void borrarCampos() {
		usuarioCampo.setText("");
		contraseniaCampo.setText("");
	}
				
	public boolean validar(ArrayList<Persona> usuarios) {
		boolean flag = true;
		if((usuarioCampo.getText().isEmpty()) || (contraseniaCampo.getText().isEmpty())) {
			JOptionPane.showMessageDialog( null, "Por favor llene todos los campos" );flag=false;
		} else if(Persona.existeUsuario(usuarioCampo.getText(),contraseniaCampo.getText(),usuarios)==false) {
			JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");flag=false;
		}
		return flag;
	}
	
	public void ingresar(String usuario, LogIn ventana) {
		Bienvenido bienv = new Bienvenido(usuario,ventana);
		bienv.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
}