package Modelo;

public class Categoria {
	private String nombre;
	private int id;
	
	public Categoria(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
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
		this.id = 0;
		this.nombre = nombre;
	}
	public Categoria(int id) {
		super();
		this.id = id;
	}
	
	 
}
