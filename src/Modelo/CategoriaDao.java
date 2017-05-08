package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.Coordinador;

public class CategoriaDao {

	private Coordinador miCoordinador = new Coordinador();
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	public void insertarCategoria(Categoria categoria){
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("INSERT INTO categorias (nombre) VALUES (?);");
			stat.setString(1, categoria.getNombre());
			stat.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			Conexion.close();
		}
	}

	public void eliminarCategoria(Categoria categoria) {
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("DELETE FROM categorias WHERE id = ?;");
			stat.setInt(1, categoria.getId());
			stat.execute();
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			Conexion.close();
		}
	}

	public ArrayList<Categoria> listarCategorias() {
		ResultSet resultSet = null;
		ArrayList<Categoria> categorias = new ArrayList<>();
		Connection conn = Conexion.getConnection();
			try {
				Statement stat = conn.createStatement();
				resultSet = stat.executeQuery("select * from categorias;");
				while (resultSet.next()){
					Categoria cat = new Categoria(resultSet.getString(2),resultSet.getInt(1));
					categorias.add(cat);
				}
			} catch (Exception exc) {
				throw new RuntimeException(exc);
			} finally {
				Conexion.close();
			}
		return categorias;
	}

	

}
