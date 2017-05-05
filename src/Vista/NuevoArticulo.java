package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;

public class NuevoArticulo extends JFrame {
	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	
	//Metodos generados por nosotros
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
	
	//Metodos auto-generados (el constructor por ej)
	public NuevoArticulo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoArticulo = new JLabel("Nuevo Articulo");
		lblNuevoArticulo.setBounds(10, 11, 414, 30);
		contentPane.add(lblNuevoArticulo);
	}
}
