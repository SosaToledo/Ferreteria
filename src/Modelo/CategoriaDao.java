package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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

}
