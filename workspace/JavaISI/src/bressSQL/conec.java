package bressSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Prob� con 2306 y 3306 (Son mis Ports de MySQL y MariaDB)

public class conec {
	public static void main(String[] args) {
		// conexiones
		Connection conexi�n1 = null;
		Connection conexi�n2 = null;
		Connection conexi�n3 = null;
		// usuario y clave
		String user = "root";
		String password = "reptile";
		try {
			// una sola cadena de conexi�n, en conexi�n par�metro se concatena el usuario y el password
			String url1 = "jdbc:mysql://localhost:3306/datos?user=" + user + "&pasword=" + password;
			conexi�n1 = DriverManager.getConnection(url1);
			if (conexi�n1 != null) {
				System.out.println("Conexi�n 1: Conexi�n a la base de datos en forma satisfacoria");
			}
			// se env�a la cadena y los datos de usuario y password por separado
			Properties datos = new Properties();
			datos.put("user", user);
			datos.put("password", password);
			String url2 = "jdbc:mysql://localhost:3306/datos";
			conexi�n2 = DriverManager.getConnection(url2, datos);
			if (conexi�n2 != null) {
				System.out.println("Conexi�n 2: Conexi�n a la base de datos en forma satisfacoria");
			}
			// se env�a la cadena, el usuario y el password por separado
			String url3 = "jdbc:mysql://localhost:3306/datos";
			conexi�n3 = DriverManager.getConnection(url3, user, password);
			if (conexi�n3 != null) {
				System.out.println("Conexi�n 3: Conexi�n a la base de datos en forma satisfacoria");
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexi�n, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
			e.printStackTrace();
		}
	}
}
