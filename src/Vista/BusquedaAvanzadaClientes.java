package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import Controlador.Coordinador;

import java.awt.Color;

public class BusquedaAvanzadaClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private Coordinador miCoordinador;


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	
	public BusquedaAvanzadaClientes() {
		setResizable(false);
		setBounds(100, 100, 895, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBusquedaAvanzadaDe = new JLabel("Busqueda Avanzada de Clientes");
		lblBusquedaAvanzadaDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusquedaAvanzadaDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBusquedaAvanzadaDe.setBounds(10, 11, 869, 24);
		contentPane.add(lblBusquedaAvanzadaDe);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(10, 46, 57, 19);
		contentPane.add(lblNombre);
		
		JLabel lblEstadoDeCuenta = new JLabel("Estado de cuenta:");
		lblEstadoDeCuenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstadoDeCuenta.setBounds(288, 46, 119, 19);
		contentPane.add(lblEstadoDeCuenta);
		
		JLabel lblSegunSuCategoria = new JLabel("Categoria:");
		lblSegunSuCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSegunSuCategoria.setBounds(593, 46, 66, 19);
		contentPane.add(lblSegunSuCategoria);
		
		JLabel lblSegunFormaDe = new JLabel("Forma de pago:");
		lblSegunFormaDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSegunFormaDe.setBounds(10, 76, 105, 19);
		contentPane.add(lblSegunFormaDe);
		
		JLabel lblPeriodoDeCompra = new JLabel("Periodo de compra:");
		lblPeriodoDeCompra.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeriodoDeCompra.setBounds(288, 76, 133, 19);
		contentPane.add(lblPeriodoDeCompra);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(417, 47, 153, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(669, 46, 210, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(125, 77, 153, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"ultimo mes", "ultima semana", "otro"}));
		comboBox_3.setBounds(431, 77, 139, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDesde.setBounds(593, 76, 46, 19);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHasta.setBounds(746, 78, 46, 19);
		contentPane.add(lblHasta);
		
		textField = new JTextField();
		textField.setBounds(649, 76, 77, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(802, 78, 77, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 46, 201, 20);
		contentPane.add(textField_2);
		
		JButton btnGenerarReporte = new JButton("Generar Reporte");
		btnGenerarReporte.setBounds(633, 109, 170, 23);
		contentPane.add(btnGenerarReporte);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(239, 109, 170, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Buscar");
		btnGuardar.setBounds(59, 109, 170, 23);
		contentPane.add(btnGuardar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 143, 869, 9);
		contentPane.add(separator);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 151, 872, 530);
		contentPane.add(table);
	}

}
