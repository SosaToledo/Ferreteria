package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class DetalleArticulo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleArticulo frame = new DetalleArticulo();
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
	public DetalleArticulo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 940, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDetalleDeArticulo = new JLabel("Detalle de ARTICULO");
		lblDetalleDeArticulo.setBounds(5, 5, 307, 30);
		lblDetalleDeArticulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetalleDeArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 49, 63, 14);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(15, 80, 63, 14);
		
		JLabel lblPrecioFinal = new JLabel("Precio Final:");
		lblPrecioFinal.setBounds(15, 111, 63, 14);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(15, 204, 63, 14);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setBounds(15, 173, 63, 14);
		
		JLabel lblStockMinimo = new JLabel("Stock Minimo:");
		lblStockMinimo.setBounds(15, 142, 87, 14);
		
		JLabel lblProveedoresQueDan = new JLabel("Proveedores que dan este articulo:");
		lblProveedoresQueDan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProveedoresQueDan.setBounds(547, 11, 307, 19);
		
		table = new JTable();
		table.setBounds(373, 41, 536, 259);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(80, 257, 71, 23);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(211, 257, 71, 23);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(125, 46, 206, 20);
		txtNombre.setText("NOMBRE");
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(125, 77, 206, 20);
		textField.setText("NOMBRE");
		textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 108, 206, 20);
		textField_1.setText("NOMBRE");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 139, 206, 20);
		textField_2.setText("NOMBRE");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 170, 206, 20);
		textField_3.setText("NOMBRE");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(125, 201, 206, 20);
		textField_4.setText("NOMBRE");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(table);
		contentPane.add(btnGuardar);
		contentPane.add(btnEditar);
		contentPane.add(txtNombre);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(textField_4);
		contentPane.add(lblDetalleDeArticulo);
		contentPane.add(lblProveedoresQueDan);
		contentPane.add(lblNombre);
		contentPane.add(lblCosto);
		contentPane.add(lblPrecioFinal);
		contentPane.add(lblCategoria);
		contentPane.add(lblStock);
		contentPane.add(lblStockMinimo);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(344, 5, 8, 295);
		contentPane.add(separator);
	}
}
