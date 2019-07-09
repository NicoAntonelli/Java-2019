package tpBress01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class Bienvenido extends JFrame {
	private static final long serialVersionUID = 8264353745855008973L;
	
	public Bienvenido(String usuario, LogIn principal) {
        
		super("NickApp"); // Nombre del Frame
		configurarVentana(); // Mis Configuraciones
		
		JPanel user = new JPanel();
		JPanel botones = new JPanel();
		
		JLabel userLabel = new JLabel("Bienvenido "+usuario+"!!");
		// new font size is 20
		userLabel.setFont(new Font(userLabel.getFont().getName(), userLabel.getFont().getStyle(), 20));
	    // draw label border to verify the new label size
		userLabel.setBorder(new LineBorder(Color.BLACK));
	    // change label size
		userLabel.setPreferredSize(new Dimension(200, 200));
		user.add(userLabel);
		
		JButton salirBoton = new JButton("Cerrar Sesión");
		botones.add(salirBoton);
		
		salirBoton.addActionListener(                        
			new ActionListener() {
				public void actionPerformed(ActionEvent evento) {                
					setVisible(false);
					principal.setVisible(true);         
				}                          
		}); 
		getContentPane().setLayout(new FlowLayout());
		Container contenedor = getContentPane();
		contenedor.add(user);
		contenedor.add(botones);
		contenedor.setLayout(new GridLayout(2,1));
		setVisible(true);
					
	}
	
	// Mis Configuraciones
	public void configurarVentana() {
		this.setTitle("NickApp");								// Título
		this.setSize(400,550);									// Tamaño (Ancho,Alto)
	    this.setLocationRelativeTo(null);                       // Centrar Ventana en la Pantalla
	    this.setLayout(null);                                   // Layout Null, Posicionamiento Manual de Componentes
	    this.setResizable(true);                              	// Ventana Redimensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Terminar Proceso al Cerrar
	}
	
}

