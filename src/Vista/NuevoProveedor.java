package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;

public class NuevoProveedor extends JFrame {
	
	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	
	//Metodos declarados por nosotros.
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	//Metodos generados solos.
	public NuevoProveedor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoProveedor = new JLabel("Nuevo Proveedor");
		lblNuevoProveedor.setBounds(10, 11, 414, 31);
		contentPane.add(lblNuevoProveedor);
	}
}
