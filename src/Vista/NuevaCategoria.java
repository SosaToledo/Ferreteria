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
import java.awt.event.ActionEvent;

public class NuevaCategoria extends JFrame {

	//Atributos
	private JPanel contentPane;
	private Coordinador miCoordinador = new Coordinador();
	private JTextField tfNombreCategoria;
	
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
	}
}
