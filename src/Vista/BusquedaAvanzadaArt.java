package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;

public class BusquedaAvanzadaArt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusquedaAvanzadaArt frame = new BusquedaAvanzadaArt();
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
	public BusquedaAvanzadaArt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBusquedaAvanzada = new JLabel("Busqueda Avanzada:");
		lblBusquedaAvanzada.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusquedaAvanzada.setBounds(5, 5, 255, 22);
		lblBusquedaAvanzada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 33, 61, 22);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblBajoStockMinimos = new JLabel("Bajo stock minimos:");
		lblBajoStockMinimos.setBounds(5, 66, 126, 22);
		lblBajoStockMinimos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPorRangoDe = new JLabel("Por rango de stock:");
		lblPorRangoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorRangoDe.setBounds(5, 99, 255, 22);
		lblPorRangoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPorRangoDe_1 = new JLabel("Por rango de precio:");
		lblPorRangoDe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorRangoDe_1.setBounds(5, 167, 255, 22);
		lblPorRangoDe_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("Max:");
		label_1.setBounds(126, 132, 32, 22);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("Min:");
		label_2.setBounds(5, 132, 26, 22);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblCantidadDeGanancia = new JLabel("Ganancia mayor a:");
		lblCantidadDeGanancia.setBounds(7, 227, 115, 22);
		lblCantidadDeGanancia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setBounds(5, 260, 79, 22);
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(94, 260, 166, 25);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(5, 293, 255, 235);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 229, 134, 22);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(36, 134, 86, 22);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 68, 119, 22);
		textField_3.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblBusquedaAvanzada);
		contentPane.add(lblNombre);
		contentPane.add(lblBajoStockMinimos);
		contentPane.add(lblPorRangoDe);
		contentPane.add(lblPorRangoDe_1);
		contentPane.add(lblProveedor);
		contentPane.add(textField);
		contentPane.add(table);
		contentPane.add(label_2);
		contentPane.add(textField_2);
		contentPane.add(label_1);
		contentPane.add(textField_3);
		contentPane.add(lblCantidadDeGanancia);
		contentPane.add(textField_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(36, 197, 86, 22);
		contentPane.add(textField_5);
		
		JLabel label = new JLabel("Min:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(5, 195, 26, 22);
		contentPane.add(label);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 197, 98, 22);
		contentPane.add(textField_6);
		
		JLabel label_3 = new JLabel("Max:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(126, 195, 32, 22);
		contentPane.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(69, 36, 191, 22);
		contentPane.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(168, 135, 92, 22);
		contentPane.add(textField_9);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(15, 539, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(135, 539, 89, 23);
		contentPane.add(btnLimpiar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(270, 5, 7, 558);
		contentPane.add(separator);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(287, 5, 667, 22);
		contentPane.add(lblResultado);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(287, 36, 667, 492);
		contentPane.add(table_1);
		
		JButton btnGenerarReporte = new JButton("Generar Reporte");
		btnGenerarReporte.setBounds(287, 539, 667, 23);
		contentPane.add(btnGenerarReporte);
	}
}
