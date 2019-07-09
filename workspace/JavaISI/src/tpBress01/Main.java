package tpBress01;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> usuarios = new ArrayList<Persona>();
		Persona usuario1 = new Persona("nick","12345678","Nico","Antonelli","niconelli2@gmail.com");
		usuarios.add(usuario1);
		LogIn aplicacion = new LogIn(usuarios);
		aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
