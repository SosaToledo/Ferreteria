package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Modelo.Conexion;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Coordinador miCoordinador;

	//Metodos declarados por nosotros//
	///////////////////////////////////
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
	
	//Metodos autogenerados y otros, por ejemplo el generador
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentanaPrincipal = new JLabel("Ventana Principal");
		lblVentanaPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentanaPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVentanaPrincipal.setBounds(10, 11, 402, 29);
		contentPane.add(lblVentanaPrincipal);
		
		JButton btnNuevoArticulo = new JButton("Nuevo Articulo");
		btnNuevoArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.nuevoArticulo();
			}
		});
		btnNuevoArticulo.setBounds(122, 67, 199, 29);
		contentPane.add(btnNuevoArticulo);
		
		JButton btnNuevaCategoria = new JButton("Nueva Categoria");
		btnNuevaCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miCoordinador.nuevaCategoria();
			}
		});
		btnNuevaCategoria.setBounds(122, 109, 199, 29);
		contentPane.add(btnNuevaCategoria);
		
		JButton btnNuevoProveedor = new JButton("Nuevo Proveedor");
		btnNuevoProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCoordinador.nuevoProveedor();
			}
		});
		btnNuevoProveedor.setBounds(122, 149, 199, 29);
		contentPane.add(btnNuevoProveedor);
	}
	
	public static void main(String[] ar) {
        JFrame f=new Principal();
        f.setBounds(10,10,300,200);
        f.setVisible(true);
    }
}
