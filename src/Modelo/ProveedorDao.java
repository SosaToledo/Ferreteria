package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

	public void eliminarProveedor(Proveedor proveedor) {
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("DELETE FROM proveedores WHERE id = ?;");
			stat.setInt(1, proveedor.getId());
			stat.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			Conexion.close();
		}
		
	}

	public ArrayList<Proveedor> listarProveedores() {
		ResultSet resultSet = null;
		ArrayList<Proveedor> proveedores = new ArrayList<>();
		Connection conn = Conexion.getConnection();
			try {
				Statement stat = conn.createStatement();
				resultSet = stat.executeQuery("select * from proveedores;");
				while (resultSet.next()){
					Proveedor pro = new Proveedor(resultSet.getInt(1),resultSet.getString(2));
					proveedores.add(pro);
				}
			} catch (Exception exc) {
				throw new RuntimeException(exc);
			} finally {
				Conexion.close();
			}
		return proveedores;
	}
}
