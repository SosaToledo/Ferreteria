package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetalleProveedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleProveedor frame = new DetalleProveedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DetalleProveedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1178, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetalleDeProveedor = new JLabel("Detalle de PROVEEDOR");
		lblDetalleDeProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetalleDeProveedor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetalleDeProveedor.setBounds(10, 11, 1142, 14);
		contentPane.add(lblDetalleDeProveedor);
		
		JLabel lblRazonSocial = new JLabel("Razon social:");
		lblRazonSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRazonSocial.setBounds(10, 47, 83, 19);
		contentPane.add(lblRazonSocial);
		
		textField = new JTextField();
		textField.setBounds(103, 46, 343, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCuit = new JLabel("CUIT:");
		lblCuit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCuit.setBounds(297, 78, 45, 19);
		contentPane.add(lblCuit);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(340, 77, 228, 20);
		contentPane.add(textField_1);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(10, 77, 63, 19);
		contentPane.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBounds(83, 77, 204, 20);
		contentPane.add(comboBox);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccion.setBounds(456, 48, 68, 19);
		contentPane.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(523, 47, 265, 20);
		contentPane.add(textField_2);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN.setBounds(798, 48, 21, 19);
		contentPane.add(lblN);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(829, 47, 63, 20);
		contentPane.add(textField_3);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(578, 75, 63, 19);
		contentPane.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(645, 76, 167, 20);
		contentPane.add(textField_4);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFormaDePago.setBounds(822, 77, 98, 19);
		contentPane.add(lblFormaDePago);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(930, 77, 222, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblCbu = new JLabel("CBU:");
		lblCbu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCbu.setBounds(902, 47, 31, 19);
		contentPane.add(lblCbu);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(943, 48, 209, 20);
		contentPane.add(textField_5);
		
		JLabel lblComprasRealizadas = new JLabel("Compras realizadas");
		lblComprasRealizadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprasRealizadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComprasRealizadas.setBounds(10, 150, 1142, 14);
		contentPane.add(lblComprasRealizadas);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 175, 1142, 345);
		contentPane.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 137, 1142, 2);
		contentPane.add(separator);
		
		JButton btnBuscar = new JButton("Editar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(53, 107, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Guardar");
		btnLimpiar.setBounds(164, 108, 89, 23);
		contentPane.add(btnLimpiar);
	}

}
