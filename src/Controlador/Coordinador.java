package Controlador;
import Vista.*;

import java.awt.Window;
import java.util.ArrayList;

import Modelo.*;

public class Coordinador {
	//inicializamos todas las clases que vamos a usar en un futuro
	
	//Clases de la vista
	private Principal miVentanaPrincipal;
	private NuevoArticulo miNuevoArticulo;
	private NuevaCategoria miNuevaCategoria;
	private NuevoProveedor miNuevoProveedor;
	
	//Clases del modelo
	private ArticuloDao articuloDao;
	private CategoriaDao categoriaDao;
	private ProveedorDao proveedorDao;
	
	//Clases Controlador
	
	private ControladorPrincipal controladorPrincipal;
	private Logica logica;
	private BusquedaAvanzadaClientes miBusquedaAvanzadaClientes;
	private BusquedaAvanzadaArt miBusquedaAvanzadaArt;
	
	////////////////////////////////////////////////////////////////////////////////////////
	//Aca al final solo declaramos los metodos para setear las instancias que vamos a usar//
	////////////////////////////////////////////////////////////////////////////////////////
	
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
	public void setBusquedaAvanzandaClientes (BusquedaAvanzadaClientes busquedaAvanzadaClientes){
		this.miBusquedaAvanzadaClientes=busquedaAvanzadaClientes;
	}
	public void setBusquedaAvanzadaArt(BusquedaAvanzadaArt busquedaAvanzadaArt){
		this.miBusquedaAvanzadaArt=busquedaAvanzadaArt;
	}
	
	//Acciones generadas por el usuario
	
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
	
	//Acciones sobre la Categoria 
	public void insertarCategoria(Categoria categoria) {
		categoriaDao.insertarCategoria(categoria);
	}
	public void eliminarCategoria(Categoria categoria){
		categoriaDao.eliminarCategoria(categoria);
	}
	public ArrayList<Categoria> listarCategorias(){
		return (ArrayList<Categoria>) categoriaDao.listarCategorias();
	}
	//////////////////////////////////////////////////////////
	
	//Acciones sobre el Proveedor
	public void insertarProveedor(Proveedor proveedor) {
		proveedorDao.insertarProveedores(proveedor);
	}
	public void eliminarProveedor(Proveedor proveedor){
		proveedorDao.eliminarProveedor(proveedor);
	}
	public ArrayList<Proveedor> listarProveedores() {
		return (ArrayList<Proveedor>) proveedorDao.listarProveedores();
	}
	
	/////////////////////////////////////////////////////////
	
	//Acciones sobre el Articulo
	public void insertarArticulo(Articulo articulo){
		articuloDao.insertarArticulo(articulo);
	}
	public void eliminarArticulo(int id){
		articuloDao.eliminarArticulo(id);
	}
	public ArrayList<Articulo> listarArticulos() {
		return articuloDao.listarArticulos();
		
	}
	public void nuevaBusquedaAvanzadaClientes() {
		miBusquedaAvanzadaClientes.setVisible(true);
	}
	public void nuevaBusquedaAvanzadaArt() {
		this.miBusquedaAvanzadaArt.setVisible(true);
	}
	
	
	
}
