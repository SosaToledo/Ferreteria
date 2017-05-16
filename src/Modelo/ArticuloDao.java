package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

import Controlador.Coordinador;

public class ArticuloDao {
	private Coordinador miCoordinador = new Coordinador();
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public void insertarArticulo(Articulo articulo) {
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("insert into articulos (categoria, nombre, costo, cantidad, precio, descripcion) values (?,?,?,?,?,?);");
			stat.setInt(1, articulo.getCategoria().getId());
			stat.setString(2, articulo.getNombre());
			stat.setFloat(3, articulo.getCosto());
			stat.setInt(4, articulo.getCantidad());
			stat.setFloat(5, articulo.getPreciofinal());
			stat.setString(6, articulo.getDescripcion());	
			stat.execute();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			Conexion.close();
		}
		
	}

	public void eliminarArticulo(int id) {
		Connection conn = Conexion.getConnection();
		try{
			PreparedStatement stat = conn.prepareStatement("delete from articulos where id = ?;");
			stat.setInt(1, id);
			stat.execute();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			Conexion.close();
		}	
	}

	public ArrayList<Articulo> listarArticulos() {
		ResultSet resultset = null;
		ArrayList<Articulo> articulos = new ArrayList<>();
		Connection conn = Conexion.getConnection();
		try{
			Statement stat = conn.createStatement();
			resultset = stat.executeQuery("select c.nombre, c.id, a.nombre, costo, cantidad, precio, descripcion from articulos a inner join categorias c a.id = c. id;");
			while (resultset.next()){
				Articulo a = new Articulo(
					new Categoria(resultset.getString(1),resultset.getInt(2)),
					resultset.getString(3),
					resultset.getFloat(4),
					resultset.getInt(5),
					resultset.getFloat(6),
					resultset.getString(7)
				);
				articulos.add(a);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return articulos;
		
	}
	
	

}
