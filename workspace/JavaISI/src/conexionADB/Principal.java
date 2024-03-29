package conexionADB;

import java.sql.*;
import java.util.Scanner;

// import entidades.Documento;
// import entidades.Persona;

/*
IMPORTANTE!
Instrucciones de Control a la DB: ?sentencia

-No Verificar: ?verifyServerCertificate=false
-Quitar SSL: ?useSSL=false
-Autoreconectar: ?autoReconnect=true

-Varias Instrucciones: ?autoReconnect=true&useSSL=false
-Otra Forma ?autoReconnect=true&amp;useSSL=false
*/

public class Principal {
	private static String driver="com.mysql.jdbc.Driver";
	
	public static void main(String[] args) {
		
		try {
			Class.forName(driver);
			// Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "java", "java2019");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:2306?useSSL=false", "root", "reptile");
			Statement stmt = conn.createStatement();
			// ResultSet rs = stmt.executeQuery("select * from java.persona");
			ResultSet rs = stmt.executeQuery("select * from java_db.persona");
			
			int actualID=0; // No uso "ID" en la DB, sino tipo_dni y nro_dni como PK
			System.out.println("PERSONAS REGISTRADAS EN LA DB:");
			while(rs.next()) {
				Persona p=new Persona();
				Documento d=new Documento();
				p.setDocumento(d);
				
				//p.setId(rs.getInt("id"));
				p.setId(actualID);
				d.setNro(rs.getString("nro_doc"));
				d.setTipo(rs.getString("tipo_doc"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido(rs.getString("apellido"));
				p.setEmail(rs.getString("email"));
				p.setTel(rs.getString("tel"));
				actualID++;
				
				
				System.out.println(p);
				
			}
			
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}
			
			System.out.println();
			System.out.println("------------");
			System.out.println("NUEVA ENTRADA EN LA DB");
			Persona pIns=new Persona();
			pIns.setDocumento(new Documento());
			
			
			Scanner s= new Scanner(System.in);
			System.out.print("tipo_doc: ");
			pIns.getDocumento().setTipo(s.nextLine());
			System.out.print("nro_doc: ");
			pIns.getDocumento().setNro(s.nextLine());
			System.out.print("nombre: ");
			pIns.setNombre(s.nextLine());
			System.out.print("apellido: ");
			pIns.setApellido(s.nextLine());
			System.out.print("email: ");
			pIns.setEmail(s.nextLine());
			System.out.print("tel: ");
			pIns.setTel(s.nextLine());
			
			
			
			// PreparedStatement pstmt = conn.prepareStatement("insert into persona(tipo_doc,nro_doc,nombre,apellido,email,tel) values(?,?,?,?,?,?)"
			PreparedStatement pstmt = conn.prepareStatement("insert into java_db.persona(tipo_doc,nro_doc,nombre,apellido,email,tel) values(?,?,?,?,?,?)"
					,PreparedStatement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, pIns.getDocumento().getTipo());
			pstmt.setString(2, pIns.getDocumento().getNro());
			pstmt.setString(3, pIns.getNombre());
			pstmt.setString(4, pIns.getApellido());
			pstmt.setString(5, pIns.getEmail());
			pstmt.setString(6, pIns.getTel());
			
			pstmt.executeUpdate();
			
			ResultSet keyResultSet=pstmt.getGeneratedKeys();
			
			if(keyResultSet!=null && keyResultSet.next()) {
				int id=keyResultSet.getInt(1);
				System.out.println("ID: "+id);
				pIns.setId(id);
			}
			
			s.close();
			
			System.out.println();
			System.out.println(pIns);

			
			
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
