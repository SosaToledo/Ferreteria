package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import Controlador.Coordinador;

public class ProveedorDao {

	private Coordinador miCoordinador = new Coordinador();
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;		
	}
	
	public void insertarProveedores(Proveedor proveedor){
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("INSERT INTO proveedores (nombre) VALUES (?);");
			stat.setString(1, proveedor.getNombre());
			stat.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			Conexion.close();
		}
	}
}
