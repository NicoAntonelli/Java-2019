package logic;

import data.*;
import entities.*;

public class Login {
	private DataPersona dp;
	
	public Login() {
		dp=new DataPersona();
	}
	
	public Persona validate(Persona p) {
		/* para hacer m�s seguro el manejo de passwords este ser� un lugar 
		 * adecuado para generar un hash de la password utilizando un cifrado
		 * asim�trico como sha256 y utilizar el hash en lugar de la password en plano 
		 */
		return dp.getByCredentials(p);
		//return null;
	}

}
