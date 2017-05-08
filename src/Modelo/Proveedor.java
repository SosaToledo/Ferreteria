package Modelo;

public class Proveedor {
	private int id;
	private String nombre;
	
	public Proveedor(){
	}
	
	
	public Proveedor(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public Proveedor(String nombre) {
		super();
		this.id = 0;
		this.nombre = nombre;
	}

	public Proveedor(int parseInt) {
		super();
		this.id = parseInt;
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
	
	
}
