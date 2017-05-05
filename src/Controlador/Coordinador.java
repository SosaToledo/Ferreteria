package Controlador;
import Vista.*;
import Modelo.*;

public class Coordinador {
	//inicializamos todas las clases que vamos a usar en un futuro
	
	//Clases de la vista
	private Principal miVentanaPrincipal = new Principal();
	private NuevoArticulo miNuevoArticulo= new NuevoArticulo();
	private NuevaCategoria miNuevaCategoria= new NuevaCategoria();
	private NuevoProveedor miNuevoProveedor= new NuevoProveedor();
	//Clases del modelo
	private ArticuloDao articuloDao= new ArticuloDao();
	private CategoriaDao categoriaDao= new CategoriaDao();
	private ProveedorDao proveedorDao= new ProveedorDao();
	
	//Clases Controlador
	
	private ControladorPrincipal controladorPrincipal;
	private Logica logica;
	
	////////////////////////////////////////////////////////////////////////////////////////
	//Aca al final solo declaramos los metodos para setear las instancias que vamos a usar//
	////////////////////////////////////////////////////////////////////////////////////////
	
	public void nuevoArticulo() {
		miNuevoArticulo.setVisible(true);
	}
	public void nuevaCategoria(){
		miNuevaCategoria.setVisible(true);
	}
	public void nuevoProveedor(){
		miNuevoProveedor.setVisible(true);
	}
	public NuevoArticulo getMiNuevoArticulo() {
		return miNuevoArticulo;
	}
	public void setMiVentanaPrincipal(Principal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public void setMiNuevoArticulo(NuevoArticulo miNuevoArticulo) {
		this.miNuevoArticulo = miNuevoArticulo;
	}
	public void setMiNuevaCategoria(NuevaCategoria miNuevaCategoria) {
		this.miNuevaCategoria = miNuevaCategoria;
	}
	public void setMiNuevoProveedor(NuevoProveedor miNuevoProveedor) {
		this.miNuevoProveedor = miNuevoProveedor;
	}
	public void setArticuloDao(ArticuloDao articuloDao) {
		this.articuloDao = articuloDao;
	}
	public void setCategoriaDao(CategoriaDao categoriaDao) {
		this.categoriaDao = categoriaDao;
	}
	public void setProveedorDao(ProveedorDao proveedorDao) {
		this.proveedorDao = proveedorDao;
	}
	public void setControladorPrincipal(ControladorPrincipal controladorPrincipal) {
		this.controladorPrincipal = controladorPrincipal;
	}
	public void setLogica(Logica logica) {
		this.logica = logica;
	}
	
}
