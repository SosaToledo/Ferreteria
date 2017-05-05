package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;

public class NuevaCategoria extends JFrame {

	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	
	//Metodos declarados por nosotros
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	//Metodos generados automaticamente
	public NuevaCategoria() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevaCategoria = new JLabel("Nueva Categoria");
		lblNuevaCategoria.setBounds(10, 11, 414, 38);
		contentPane.add(lblNuevaCategoria);
	}
}
