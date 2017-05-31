package Controlador;



import Modelo.*;
import Vista.*;

public class ControladorPrincipal {
	public void iniciar(){		
		//Inicializar todas las clases que se van a utilizar
		
		//Estas pertenecen a vista
		Principal miVentanaPrincipal = new Principal();
		NuevoArticulo miNuevoArticulo = new NuevoArticulo();
		NuevaCategoria miNuevaCategoria = new NuevaCategoria();
		NuevoProveedor miNuevoProveedor = new NuevoProveedor();
		BusquedaAvanzadaClientes miBusquedaAvanzadaClientes = new BusquedaAvanzadaClientes();
		BusquedaAvanzadaArt miBusquedaAvanzadaArt = new BusquedaAvanzadaArt();
		
		//estas pertenecen a controlador
		Coordinador miCoordinador = new Coordinador();
		Logica miLogica = new Logica();
		
		//Estas a Modelo
		ArticuloDao articuloDao = new ArticuloDao();
		CategoriaDao categoriaDao = new CategoriaDao();
		ProveedorDao proveedorDao = new ProveedorDao();
		
		//Establecer la relacion Clase - coordinador
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miNuevoArticulo.setCoordinador(miCoordinador);
		miNuevaCategoria.setCoordinador(miCoordinador);
		miNuevoProveedor.setCoordinador(miCoordinador);
		miBusquedaAvanzadaClientes.setCoordinador(miCoordinador);
		miBusquedaAvanzadaArt.setCoordinador(miCoordinador);
		
		miLogica.setCoordinador(miCoordinador);
		
		articuloDao.setCoordinador(miCoordinador);
		categoriaDao.setCoordinador(miCoordinador);
		proveedorDao.setCoordinador(miCoordinador);
		
		/////////////////////////////////////////////////////
		//Establecer la relacion coordinador - clase/////////
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiNuevoArticulo(miNuevoArticulo);
		miCoordinador.setMiNuevaCategoria(miNuevaCategoria);
		miCoordinador.setMiNuevoProveedor(miNuevoProveedor);
		miCoordinador.setBusquedaAvanzandaClientes(miBusquedaAvanzadaClientes);
		miCoordinador.setBusquedaAvanzadaArt(miBusquedaAvanzadaArt);
		
		miCoordinador.setLogica(miLogica);
		
		miCoordinador.setArticuloDao(articuloDao);
		miCoordinador.setCategoriaDao(categoriaDao);
		miCoordinador.setProveedorDao(proveedorDao);
		
		//Al final de todo se setea visible la ventana principal.
		miVentanaPrincipal.setVisible(true);
	}
	public static void main(String[] args) {
		ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
		controladorPrincipal.iniciar();
	}
}
