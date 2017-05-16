package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.image.IntPixelGetter;

import Controlador.Coordinador;
import Modelo.Articulo;
import Modelo.Categoria;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class NuevoArticulo extends JFrame {
	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	private JTextField tfEliminarArticulo;
	
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
		
		JButton btnCargar = new JButton("cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articulo a = new Articulo(new Categoria("lacteos", 1),"leche", 5, 20, 26, "producto alimenticio");
				miCoordinador.insertarArticulo(a);
			}
		});
		btnCargar.setBounds(24, 88, 117, 25);
		contentPane.add(btnCargar);
		
		JButton btnMostrar = new JButton("mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Articulo> articulo = miCoordinador.listarArticulos();
			}
		});
		btnMostrar.setBounds(25, 149, 117, 25);
		contentPane.add(btnMostrar);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tfEliminarArticulo.getText());
				miCoordinador.eliminarArticulo(id);
			}
		});
		btnEliminar.setBounds(172, 88, 117, 25);
		contentPane.add(btnEliminar);
		
		tfEliminarArticulo = new JTextField();
		tfEliminarArticulo.setBounds(175, 48, 114, 19);
		contentPane.add(tfEliminarArticulo);
		tfEliminarArticulo.setColumns(10);
	}
}
