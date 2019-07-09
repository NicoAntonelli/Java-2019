package conexionADB;

import java.sql.*;

// import entidades.Documento;
// import entidades.Persona;

// Introducción Bases de Datos

public class PrincipalOld {
	private static String driver="com.mysql.jdbc.Driver";
	
	public static void main(String[] args) {
		
		try {
			Class.forName(driver);
			// Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "java", "java2019");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:2306", "root", "reptile");
			Statement stmt = conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from java_db.persona");

			while(rs.next()) {
				Persona p=new Persona();
				Documento d=new Documento();
				p.setDocumento(d);
				
				p.setId(rs.getInt("id"));
				d.setNro(rs.getString("nro_doc"));
				d.setTipo(rs.getString("tipo_doc"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido(rs.getString("apellido"));
				p.setEmail(rs.getString("email"));
				p.setTel(rs.getString("tel"));
				
				
				
				System.out.println(p);
				
			}
			
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}
			conn.close(); 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
