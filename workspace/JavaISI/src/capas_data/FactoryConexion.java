package capas_data;

import java.sql.*;

public class FactoryConexion {

	private static FactoryConexion instancia;
	
	private String driver="com.mysql.jdbc.Driver";
	private String host="localhost";
	private String port="2306"; // "3306"
	private String user="root"; // "java"
	private String password="reptile"; // "java2019"
	private String db="java_db";
	private String settings="?useSSL=false";
	private int conectados=0;
	private Connection conn=null;
	
	private FactoryConexion() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static FactoryConexion getInstancia() {
		if (instancia == null) {
			instancia = new FactoryConexion();
		}
		return instancia;
	}
	
	public Connection getConn() {
		try {
			if(conn==null || conn.isClosed()) {
				// conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db, user, password);
				conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+settings, user, password);
				conectados=0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conectados++;
		return conn;
	}
	
	public void releaseConn() {
		conectados--;
		try {
			if (conectados<=0) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
