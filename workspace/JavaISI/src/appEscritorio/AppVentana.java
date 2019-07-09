package appEscritorio;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class AppVentana extends JFrame {    

	private static final long serialVersionUID = -4199597382147743442L;
	
	//atributos para logIn()
	private JTextField usuarioCTLI; 
	private JPasswordField contraseniaCTLI;
	
	//atributos para Registrarse() 
	private JTextField nombreCTLO, apellidoCTLO, usuarioCTLO, emailCTLO;
	private JPasswordField contraseniaCTLO;
	
	private Container contenedor = getContentPane();
	
	private ArrayList<Persona> usuarios = new ArrayList<Persona>();
	
	//LEER : Todo método y/o atributo que termine con 'LI' significa que pertenece al LogIn y todo el que termina con 'LO' al formulario de usuario.
	
				public static void main(String[] args) {
					AppVentana aplicacion = new AppVentana(); 
					aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				}

	
				public AppVentana()    {       
					super("Aplicación de Escritorio");
					logIn();
				}

				public void logIn() {
					
					JLabel logInEtiqueta = new JLabel( "LogIn" );  
					JLabel usuarioEtiqueta = new JLabel( "Usuario" );      
					JLabel contraseniaEtiqueta = new JLabel( "Contraseña" );                       
					JButton aceptarBoton = new JButton( "Aceptar" ); 
					JButton borrarBoton = new JButton( "Borrar" );
					JButton registrarBoton = new JButton( "Registrarse" );
					usuarioCTLI = new JTextField( 15 ); 
					contraseniaCTLI = new JPasswordField( 15 ); 
					
					
					aceptarBoton.addActionListener(                        
							new ActionListener() {
								public void actionPerformed( ActionEvent evento ) {                
									if (validarLogIn()) {
										String usuarioCT = usuarioCTLI.getText();
										contenedor.removeAll();
										repaint();
										bienvenida(usuarioCT); 
									};            
												}                          
							}); 
					registrarBoton.addActionListener(                        
							new ActionListener() {
								public void actionPerformed( ActionEvent evento ) {  
									contenedor.removeAll();
									repaint();
									registrarse();
									}                          
							}); 	
					
					borrarBoton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent evento) {
									borrarCamposLI();
								}
							}
						);
					
					JPanel login = new JPanel();       
					login.add( logInEtiqueta );       
					
					JPanel usuario = new JPanel();       
					usuario.add( usuarioEtiqueta );       
					usuario.add( usuarioCTLI ); 
					
					JPanel contrasenia = new JPanel();       
					contrasenia.add( contraseniaEtiqueta );       
					contrasenia.add( contraseniaCTLI ); 
					
					JPanel botones = new JPanel();  
					 botones.add( aceptarBoton ); 
					 botones.add( borrarBoton );      
					 botones.add( registrarBoton ); 
					
					
					contenedor.setLayout( new GridLayout( 4, 1 ) );
					contenedor.add(login);
					contenedor.add(usuario);
					contenedor.add(contrasenia);
					contenedor.add(botones);
					setSize(400,200);
					setVisible(true);
				}
				
				
				public void bienvenida(String usuarioCT) {
					JLabel bievenidaEtiqueta = new JLabel( "Bienvenido "+usuarioCT);
					JLabel etiqueta1 = new JLabel( "" );
					JLabel etiqueta2 = new JLabel( "" );
					JLabel etiqueta3 = new JLabel( "" );
					JButton botonCerrarSesion = new JButton("Cerrar Sesión");
					
					botonCerrarSesion.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent evento) {
										contenedor.removeAll();
										repaint();
										logIn(); 
								}
							}
						);
					
					JPanel bienvenida = new JPanel(); 
					bienvenida.add( bievenidaEtiqueta ); 
					JPanel cerrarSesion = new JPanel(); 
					cerrarSesion.add( botonCerrarSesion ); 
					contenedor.setLayout( new GridLayout( 5, 1 ) );
					contenedor.add(bienvenida);
					contenedor.add(etiqueta1);
					contenedor.add(etiqueta2);
					contenedor.add(etiqueta3);
					contenedor.add(cerrarSesion);
					setSize(640,480);
					setVisible(true);
				}
				
				
				
				public void registrarse() {
					// Crear los componentes de GUI
					JLabel logOnEtiqueta = new JLabel( "Registrarse" );  
					JLabel nombreEtiqueta = new JLabel("Nombre");
					JLabel apellidoEtiqueta = new JLabel("Apellido");
					JLabel usuarioEtiqueta = new JLabel("Usuario");
					JLabel contraseniaEtiqueta = new JLabel("Contraseña");
					JLabel emailEtiqueta = new JLabel("Email");
				
					JButton aceptarBoton = new JButton("Aceptar");
					JButton cancelarBoton = new JButton("Cancelar");
					JButton borrarBoton = new JButton("Borrar");
					
					
					aceptarBoton.addActionListener(
							// Clase interna
							new ActionListener() {
								public void actionPerformed(ActionEvent evento) {
										if(validarRegistro()) {
											registrarUsuario(usuarioCTLO.getText(),nombreCTLO.getText(),apellidoCTLO.getText(),desencriptarContrasenia(contraseniaCTLO.getPassword()),emailCTLO.getText());
											JOptionPane.showMessageDialog( null, "Usuario "+usuarioCTLO.getText()+" registrado" );
											contenedor.removeAll();
											repaint();
											logIn(); 
											}

								}
							} // Fin de la clase interna
						); // Fin de la llamada a addActionListener
						cancelarBoton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent evento) {
										contenedor.removeAll();
										repaint();
										logIn(); 
								}
							}
						);
						
						borrarBoton.addActionListener(
								new ActionListener() {
									public void actionPerformed(ActionEvent evento) {
										borrarCamposLO();
									}
								}
							);
						
						
						// getSource() --> Para poner todas las acciones del Listener, juntas...
				
					
					nombreCTLO = new JTextField(20);
					apellidoCTLO = new JTextField(20);
					usuarioCTLO = new JTextField(20);
					contraseniaCTLO = new JPasswordField(20);
					emailCTLO = new JTextField(20);
					
					JPanel logon = new JPanel();       
					logon.add( logOnEtiqueta );   
					
					JPanel nombre = new JPanel();
					nombre.add(nombreEtiqueta);
					nombre.add(nombreCTLO);

					JPanel apellido = new JPanel();
					apellido.add(apellidoEtiqueta);
					apellido.add(apellidoCTLO);

					JPanel usuario = new JPanel();
					usuario.add(usuarioEtiqueta);
					usuario.add(usuarioCTLO);

					JPanel contrasenia = new JPanel();
					contrasenia.add(contraseniaEtiqueta);
					contrasenia.add(contraseniaCTLO);

					JPanel email = new JPanel();
					email.add(emailEtiqueta);
					email.add(emailCTLO);
					
					JPanel buttons = new JPanel();
					buttons.add(aceptarBoton);
					buttons.add(borrarBoton);
					buttons.add(cancelarBoton);

					// Agregar los componentes a la aplicación
					contenedor.setLayout(new GridLayout(7,1)); // 6 Filas y 1 Columna
					contenedor.add(logon);
					contenedor.add(nombre);
					contenedor.add(apellido);
					contenedor.add(usuario);
					contenedor.add(contrasenia);
					contenedor.add(email);
					contenedor.add(buttons);
					setSize(400,275); // Tamaño del Frame
					setVisible(true);

				}
				
				
				//Métodos internos de logIn()
				
				public boolean validarLogIn() {
					boolean flag = true;
					if((usuarioCTLI.getText().isEmpty()) || (this.desencriptarContrasenia(this.contraseniaCTLI.getPassword()).isEmpty())) {
						JOptionPane.showMessageDialog( null, "Por favor llene todos los campos" );flag=false;}
						else if(!this.existeUsuarioLI()) {
							JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");flag=false;
							}
					return flag;
				}
				
				public boolean existeUsuarioLI() {
					boolean flag = false;
					for(Persona us : usuarios) {
						if(us.getUsuario().equals(this.usuarioCTLI.getText()) && us.getContrasenia().equals(this.desencriptarContrasenia(this.contraseniaCTLI.getPassword()))) flag = true;
					}
					return flag;
				}
				
				public void borrarCamposLI() {
					usuarioCTLI.setText("");
					contraseniaCTLI.setText("");
				}
					
				
				//Métodos internos de registrarse()
				
				// Maneja el evento de acción de aceptarBoton de
				private boolean validarRegistro() {
					boolean flag = true;
					// Asegurar que no haya cuadros de texto vacíos
					if (apellidoCTLO.getText().equals( "" ) ||
						nombreCTLO.getText().equals( "" ) ||
						usuarioCTLO.getText().equals( "" ) ||
						desencriptarContrasenia(contraseniaCTLO.getPassword()).equals( "" ) ||
						emailCTLO.getText().equals( "" ) ) // Fin de la condición
					{JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );flag = false;}
					// Si el usuario ya existe, mostrar mensaje
					else if ( this.existeUsuarioLO())
					{JOptionPane.showMessageDialog( this, "Usuario ya existente" );flag = false;}
					// Si el email ya existe, mostrar mensaje
					else if ( this.existeEmail())
					{JOptionPane.showMessageDialog( this, "Email ya existente" );flag = false;}
					// Si el formato de nombre es inválido, mostrar mensaje
					else if ( !nombreCTLO.getText().matches( "[A-Z][a-zA-Z]*" ) )
					{JOptionPane.showMessageDialog( this, "Nombre inválido" );flag = false;}
					// Si el formato de apellido es inválido, mostrar mensaje
					else if ( !apellidoCTLO.getText().matches( "[A-Z][a-zA-Z]*" ) )
					{JOptionPane.showMessageDialog( this, "Apellido inválido" );flag = false;}
					// Si el formato de usuario es inválido, mostrar mensaje
					else if ( !usuarioCTLO.getText().matches( "[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$" ) )
					{JOptionPane.showMessageDialog( this, "Usuario inválido" );flag = false;}
					// Si el formato de contraseña es inválido, mostrar mensaje
					else if ( !desencriptarContrasenia(contraseniaCTLO.getPassword()).matches( ".{8,}" ) )
					{JOptionPane.showMessageDialog( this, "Contraseña inválida (8 Caracteres Mínimo)" );flag = false;}
					// Si el formato de email es inválido, mostrar mensaje
					else if ( !emailCTLO.getText().matches( "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$" ) )
					{JOptionPane.showMessageDialog( this, "Email inválido" );flag = false;}
					return flag;

				}
				
				public boolean existeUsuarioLO() {
					boolean flag = false;
					for(Persona us : usuarios) {
						if(us.getUsuario().equals(this.usuarioCTLO.getText())) flag = true;
					}
					return flag;
				}
				
				public boolean existeEmail() {
					boolean flag = false;
					for(Persona us : usuarios) {
						if(us.getEmail().equals(this.emailCTLO.getText())) flag = true;
					}
					return flag;
				}
				
				public void borrarCamposLO() {
					usuarioCTLO.setText("");
					nombreCTLO.setText("");
					apellidoCTLO.setText("");
					contraseniaCTLO.setText("");
					emailCTLO.setText("");
				}
				
				public void registrarUsuario(String usuario,String nombre,String apellido,String contrasenia, String email) {
					Persona usu = new Persona(usuario,nombre,apellido,contrasenia,email);
					this.usuarios.add(usu);
				}
									
				
				//Método para desencriptar la contraseña
				public String desencriptarContrasenia(char[] pass) {
					String password = "";
					for(int i=0;i<pass.length;i++) {
						password += pass[i];
					}
					return password;
				}
				
				
				
}