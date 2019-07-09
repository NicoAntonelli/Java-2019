package tpBress01;

import java.util.ArrayList;

public class Persona {
	private String usuario,nombre,apellido,contrasenia,email;
	
	// Constructor Default (Testing)
	public Persona() { }
	
	// Constructor Full
	public Persona(String usuario, String contrasenia, String nombre,String apellido, String email) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	// Verificar si Usuario & Contraseña Existe en el ArrayList
	public static boolean existeUsuario(String usuario,String contrasenia,ArrayList<Persona> usuarios) {
		boolean flag = false;
		for(Persona us : usuarios) {
			if(us.getUsuario().contains(usuario) && us.getContrasenia().contains(contrasenia)) { flag = true; break; }
		}
		return flag;
	}
	
	// Getters & Setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
