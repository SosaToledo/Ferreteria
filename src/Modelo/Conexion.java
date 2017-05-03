package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class Conexion {
	private  String url = "jdbc:postgresql://localhost:5432/postgres";
	private  String user = "postgres";
	private  String password = "postgres";
	private  Connection connection;
	
	public Connection getConnection(){
		return connection;
	}
	
	public void connect(){
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("conectado a la base");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al conectarse a la base");
		}
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
