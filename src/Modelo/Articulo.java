package Modelo;

public class Articulo {
	
	private int id;
	private String nombre;
	private String descripcion;
	private float costo;
	private float preciofinal;
	private int cantidad;
	private Categoria categoria;
	
	
	
	
	
	public Articulo(String nombre, String descripcion, float costo, float preciofinal, int cantidad,
			Categoria categoria) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.preciofinal = preciofinal;
		this.cantidad = cantidad;
		this.categoria = categoria;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public float getPreciofinal() {
		return preciofinal;
	}
	public void setPreciofinal(float preciofinal) {
		this.preciofinal = preciofinal;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
}
