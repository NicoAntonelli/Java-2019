package bressSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Probé con 2306 y 3306 (Son mis Ports de MySQL y MariaDB)

public class conec {
	public static void main(String[] args) {
		// conexiones
		Connection conexión1 = null;
		Connection conexión2 = null;
		Connection conexión3 = null;
		// usuario y clave
		String user = "root";
		String password = "reptile";
		try {
			// una sola cadena de conexión, en conexión parámetro se concatena el usuario y el password
			String url1 = "jdbc:mysql://localhost:3306/datos?user=" + user + "&pasword=" + password;
			conexión1 = DriverManager.getConnection(url1);
			if (conexión1 != null) {
				System.out.println("Conexión 1: Conexión a la base de datos en forma satisfacoria");
			}
			// se envía la cadena y los datos de usuario y password por separado
			Properties datos = new Properties();
			datos.put("user", user);
			datos.put("password", password);
			String url2 = "jdbc:mysql://localhost:3306/datos";
			conexión2 = DriverManager.getConnection(url2, datos);
			if (conexión2 != null) {
				System.out.println("Conexión 2: Conexión a la base de datos en forma satisfacoria");
			}
			// se envía la cadena, el usuario y el password por separado
			String url3 = "jdbc:mysql://localhost:3306/datos";
			conexión3 = DriverManager.getConnection(url3, user, password);
			if (conexión3 != null) {
				System.out.println("Conexión 3: Conexión a la base de datos en forma satisfacoria");
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
			e.printStackTrace();
		}
	}
}
