package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private  static String url = "jdbc:postgresql://localhost:5432/postgres";
	private  static String user = "postgres";
	private  static String password = "postgres";
	private  static Connection connection = null;
	

	public static Connection getConnection(){
		if (connection == null){
			try {
				Class.forName("org.postgresql.Driver");
				connection=DriverManager.getConnection(url, user, password);
				System.out.println("Conexiòn establecida");
				return connection;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error al conectarse a la base");
			}
		}
		return connection;
	}
	
	public void connect(){
		
	}
	public void close(){
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
