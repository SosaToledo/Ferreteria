package Controlador;

import javax.swing.plaf.ComponentInputMapUIResource;

import Vista.*;

public class ControladorPrincipal {
	public void iniciar(){
		//Inicializar todas las clases que se van a utilizar
		Coordinador miCoordinador = new Coordinador();
		Logica miLogica = new Logica();
		Principal miVentanaPrincipal = new Principal();
		NuevoArticulo miNuevoArticulo = new NuevoArticulo();
		NuevaCategoria miNuevaCategoria = new NuevaCategoria();
		NuevoProveedor miNuevoProveedor = new NuevoProveedor();
		
		//Establecer la relacion Clase - coordinador
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miNuevoArticulo.setCoordinador(miCoordinador);
		miNuevaCategoria.setCoordinador(miCoordinador);
		miNuevoProveedor.setCoordinador(miCoordinador);
		
		//Establecer la relacion coordinador - clase
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiNuevoArticulo(miNuevoArticulo);
		miCoordinador.setMiNuevaCategoria(miNuevaCategoria);
		miCoordinador.setMiNuevoProveedor(miNuevoProveedor);
		
		//Al final de todo se setea visible la ventana principal.
		miVentanaPrincipal.setVisible(true);
	}
	public static void main(String[] args) {
		ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
		controladorPrincipal.iniciar();
	}
}
