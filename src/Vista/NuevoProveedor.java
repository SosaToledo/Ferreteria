package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Modelo.Proveedor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoProveedor extends JFrame {
	
	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	private JTextField tfNombreProveedor;
	private JTextField tfEliminarCategoria;
	
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
		
		tfNombreProveedor = new JTextField();
		tfNombreProveedor.setBounds(20, 54, 114, 19);
		contentPane.add(tfNombreProveedor);
		tfNombreProveedor.setColumns(10);
		
		JButton btnCargarProveedor = new JButton("cargar");
		btnCargarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.insertarProveedor(new Proveedor(tfNombreProveedor.getText().trim()));
			}
		});
		btnCargarProveedor.setBounds(17, 85, 117, 25);
		contentPane.add(btnCargarProveedor);
		
		JButton btnMostrarCategorias = new JButton("mostrar");
		btnMostrarCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.listarProveedores();
			}
		});
		btnMostrarCategorias.setBounds(20, 146, 117, 25);
		contentPane.add(btnMostrarCategorias);
		
		tfEliminarCategoria = new JTextField();
		tfEliminarCategoria.setBounds(163, 54, 114, 19);
		contentPane.add(tfEliminarCategoria);
		tfEliminarCategoria.setColumns(10);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.eliminarProveedor(new Proveedor(Integer.parseInt(tfEliminarCategoria.getText())));
			}
		});
		btnEliminar.setBounds(163, 85, 117, 25);
		contentPane.add(btnEliminar);
	}
}
