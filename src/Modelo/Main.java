package Modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion conexion= new Conexion();
		conexion.connect();
		conexion.close();
	}
	
	Proveedor p = new Proveedor();
	

}
