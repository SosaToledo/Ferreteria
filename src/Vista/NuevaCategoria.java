package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Modelo.Categoria;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NuevaCategoria extends JFrame {

	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	private JTextField tfNombreCategoria;
	private JTextField tfEliminarCategoria;
	
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
		
		tfNombreCategoria = new JTextField();
		tfNombreCategoria.setBounds(10, 61, 114, 19);
		contentPane.add(tfNombreCategoria);
		tfNombreCategoria.setColumns(10);
		
		JButton btnCargarCategoria = new JButton("cargar");
		btnCargarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.insertarCategoria(new Categoria(tfNombreCategoria.getText().trim()));
			}
		});
		btnCargarCategoria.setBounds(7, 97, 117, 25);
		contentPane.add(btnCargarCategoria);
		
		JButton btnMostrar = new JButton("mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ArrayList<Categoria> categorias = miCoordinador.listarCategorias();
				 //Use el FOR para mostrar los datos si llegaban bien hasta acá.
				 //Arreglate vos ahora. Puto.
				 for (int i=0;i<categorias.size();i++){
					 System.out.println(categorias.get(i).getNombre());
				 }
			}
		});
		btnMostrar.setBounds(7, 151, 117, 25);
		contentPane.add(btnMostrar);
		
		tfEliminarCategoria = new JTextField();
		tfEliminarCategoria.setBounds(164, 61, 114, 19);
		contentPane.add(tfEliminarCategoria);
		tfEliminarCategoria.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =  Integer.parseInt(tfEliminarCategoria.getText());
				miCoordinador.eliminarCategoria(new Categoria(id));
			}
		});
		btnEliminar.setBounds(164, 97, 117, 25);
		contentPane.add(btnEliminar);
	}
}
