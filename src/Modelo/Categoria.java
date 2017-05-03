package Modelo;

public class Categoria {
	private String nombre;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	 
}
