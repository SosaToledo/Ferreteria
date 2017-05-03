package Controlador;
import Vista.*;
import Modelo.*;

public class Coordinador {
	//definimos todas las clases que vamos a usar en un futuro
	
	//Clases de la vista
	private NuevoArticulo nuevoArticulo;
	
	//Clases del modelo
	private ArticuloDao articuloDao;
	private Articulo articulo;
	private Categoria categoria;
	private CategoriaDao categoriaDao;
	private Proveedor proveedor;
	private ProveedorDao proveedorDao;
	
	//Clases Controlador
	
	private ControladorPrincipal controladorPrincipal;
	private Logica logica;
}
