package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//--Elimine el patron singleton porque me daba error.
//--El error ocurria cuando queria usar otro metodo.
//Ejemplo: guardaba una categoria y despues las queria mostrar.
//en esa parte me decia que esa conexión estaba cerrada, lo modifique
//y ahora funciona bien.
public class Conexion {
	private  static String url = "jdbc:postgresql://localhost:5432/Ferreteria";
	private  static String user = "postgres";
	private  static String password = "postgres";
	private  static Connection connection = null;
	

	public static Connection getConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("Conexiòn establecida");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al conectarse a la base");
		}
		return connection;
	}
	
	public void connect(){
		
	}
	public static void close(){
		try {
			connection.close();
			System.out.println("Se cerro la conexion");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
	}
}
