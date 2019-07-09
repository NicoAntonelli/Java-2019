package appEscritorio;

public class Persona {
	private String usuario,nombre,apellido,contrasenia,email;
	
	public Persona() {}
	
	public Persona(String usuario,String nombre,String apellido,String contrasenia,String email) {
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contrasenia =contrasenia;
	}

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
