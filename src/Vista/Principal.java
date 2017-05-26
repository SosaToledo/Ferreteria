package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Modelo.Categoria;
import Modelo.Conexion;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Coordinador miCoordinador;
	private ArrayList<Categoria> categorias = null;
	private JTextField txtCodNombreCategoria;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCodProvNombre;
	private JTable table_2;
	private JTable Table;
	private JTable table;
	private JTable table_3;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtCategoria;
	private JTextField textField_7;
	private JTable table_4;

	//Metodos declarados por nosotros//
	///////////////////////////////////
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
	
	//Metodos autogenerados y otros, por ejemplo el generador
	public Principal() {
		setTitle("Sistema Gestion Ferreteria");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/Iconos/Maintenance-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 664);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		JPanel tabArticulo = new JPanel();
		tabbedPane.addTab("Articulos", new ImageIcon(Principal.class.getResource("/Iconos/Maintenance-32.png")), tabArticulo, null);
		
		JLabel lblBuscarArticulo = new JLabel("Buscar Articulo:");
		
		txtCodNombreCategoria = new JTextField();
		txtCodNombreCategoria.setText("Cod- nombre- categoria - stock - precio final\r\n");
		txtCodNombreCategoria.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Categoria", "Id"}));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		Table = new JTable();
		Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNuevo = new JButton("Cargar");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnBusquedaAvanzada = new JButton("Busqueda avanzada");
		
		JSeparator separator_10 = new JSeparator();
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		GroupLayout gl_tabArticulo = new GroupLayout(tabArticulo);
		gl_tabArticulo.setHorizontalGroup(
			gl_tabArticulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabArticulo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabArticulo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabArticulo.createSequentialGroup()
							.addComponent(lblBuscarArticulo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCodNombreCategoria, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblBuscarPor, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addComponent(Table, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabArticulo.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBusquedaAvanzada)
						.addComponent(separator_10, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
					.addGap(13))
		);
		gl_tabArticulo.setVerticalGroup(
			gl_tabArticulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabArticulo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabArticulo.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addGroup(gl_tabArticulo.createSequentialGroup()
							.addGroup(gl_tabArticulo.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCodNombreCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBuscarArticulo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBuscarPor))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Table, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
						.addGroup(gl_tabArticulo.createSequentialGroup()
							.addComponent(btnBusquedaAvanzada)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator_10, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addGap(217)
							.addComponent(btnNuevo)
							.addGap(33)
							.addComponent(btnBorrar)))
					.addContainerGap())
		);
		tabArticulo.setLayout(gl_tabArticulo);
		
		JPanel tabCategoria = new JPanel();
		tabbedPane.addTab("Categorias", new ImageIcon(Principal.class.getResource("/Iconos/Open Folder-32.png")), tabCategoria, null);
		
		JLabel lblNewLabel = new JLabel("Buscar Categorias:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setFillsViewportHeight(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"01", "Martillos"},
				{"02", "Destornilladores"},
			},
			new String[] {
				"ID", "NOMBRE"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(137);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNuevaCategoria = new JLabel("Nueva Categoria:");
		lblNuevaCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnGuardar = new JButton("Cargar");
		btnGuardar.setEnabled(false);
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblAgregarCategoria = new JLabel("Agregar categoria.");
		lblAgregarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAgregarCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEditarCategoria = new JLabel("Editar categoria.");
		lblEditarCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setEditable(true);
		
		JButton button = new JButton("Guardar");
		button.setEnabled(false);
		
		JSeparator separator_3 = new JSeparator();
		
		JLabel lblBorrarCategoria = new JLabel("Borrar categoria seleccionada");
		lblBorrarCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnBorrar_1 = new JButton("Borrar categoria seleccionada");
		btnBorrar_1.setEnabled(false);
		
		JSeparator separator_4 = new JSeparator();
		
		JLabel lblBorrarCategoria_1 = new JLabel("Borrar categoria.");
		lblBorrarCategoria_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarCategoria_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_9 = new JSeparator();
		
		JLabel lblCodCategoria = new JLabel("Cod Categoria - Nombre");
		GroupLayout gl_tabCategoria = new GroupLayout(tabCategoria);
		gl_tabCategoria.setHorizontalGroup(
			gl_tabCategoria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabCategoria.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(6)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
						.addComponent(table_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabCategoria.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(lblEditarCategoria)
							.addGap(178))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(lblBorrarCategoria_1)
							.addGap(174))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator_9, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
							.addGap(16))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(lblBorrarCategoria, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnBorrar_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addGap(10))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(16))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button)
							.addGap(10))
						.addGroup(gl_tabCategoria.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_tabCategoria.createSequentialGroup()
								.addComponent(lblAgregarCategoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_tabCategoria.createSequentialGroup()
								.addComponent(lblNuevaCategoria)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGap(10)))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
							.addGap(16))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addComponent(lblCodCategoria, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_tabCategoria.setVerticalGroup(
			gl_tabCategoria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabCategoria.createSequentialGroup()
					.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_tabCategoria.createSequentialGroup()
									.addGap(3)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table_1, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
						.addGroup(gl_tabCategoria.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
								.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
								.addGroup(gl_tabCategoria.createSequentialGroup()
									.addComponent(lblAgregarCategoria, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(11)
									.addGroup(gl_tabCategoria.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnGuardar)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNuevaCategoria))
									.addGap(14)
									.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblEditarCategoria)
									.addGap(9)
									.addGroup(gl_tabCategoria.createParallelGroup(Alignment.BASELINE)
										.addComponent(button)
										.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(14)
									.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblBorrarCategoria_1)
									.addGap(10)
									.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
										.addComponent(btnBorrar_1)
										.addComponent(lblBorrarCategoria))
									.addGap(18)
									.addGroup(gl_tabCategoria.createParallelGroup(Alignment.LEADING)
										.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
										.addComponent(separator_9, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCodCategoria)
									.addGap(306)))))
					.addContainerGap())
		);
		tabCategoria.setLayout(gl_tabCategoria);
		
		JPanel tabProveedores = new JPanel();
		tabbedPane.addTab("Proveedores", new ImageIcon(Principal.class.getResource("/Iconos/Truck-32.png")), tabProveedores, null);
		
		txtCodProvNombre = new JTextField();
		txtCodProvNombre.setText("cod prov, nombre , telefono , estado de cuenta");
		txtCodProvNombre.setColumns(10);
		
		JLabel lblBuscarProveedores = new JLabel("Buscar proveedores:");
		lblBuscarProveedores.setHorizontalAlignment(SwingConstants.CENTER);
		
		table_2 = new JTable();
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_2.setFillsViewportHeight(true);
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNuevo_2 = new JButton("Nuevo");
		btnNuevo_2.setEnabled(false);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setEnabled(false);
		GroupLayout gl_tabProveedores = new GroupLayout(tabProveedores);
		gl_tabProveedores.setHorizontalGroup(
			gl_tabProveedores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabProveedores.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_tabProveedores.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_tabProveedores.createSequentialGroup()
							.addComponent(lblBuscarProveedores, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(txtCodProvNombre, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(btnNuevo_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEliminar_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(8))
						.addComponent(table_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
					.addGap(5))
		);
		gl_tabProveedores.setVerticalGroup(
			gl_tabProveedores.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tabProveedores.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_tabProveedores.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabProveedores.createSequentialGroup()
							.addGap(3)
							.addComponent(lblBuscarProveedores))
						.addGroup(gl_tabProveedores.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtCodProvNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnEliminar_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNuevo_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_2, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
					.addContainerGap())
		);
		tabProveedores.setLayout(gl_tabProveedores);
		
		JPanel tabVentas = new JPanel();
		tabbedPane.addTab("Ventas", new ImageIcon(Principal.class.getResource("/Iconos/Carrito de compras-32.png")), tabVentas, null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"ID"}));
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setEditable(true);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Nombre Cliente", ""}));
		
		JLabel lblTipoFactura = new JLabel("Tipo Documento:");
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Factura A", "Factura B", "Factura C", "Boleta"}));
		
		JLabel lblFacturarDesde = new JLabel("Facturar Desde: ");
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "Remito", "Pedido"}));
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label = new JLabel("$0.00");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnGuardar_2 = new JButton("Grabar");
		
		JButton btnNueva = new JButton("Nueva");
		btnNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnBuscar = new JButton("Buscar");
		
		JLabel lblIva = new JLabel("Iva:");
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_3 = new JLabel("$0.00");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_4 = new JLabel("$0.00");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		
		JLabel label_2 = new JLabel("FECHA DD/MM/AAAA");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCodigoNombre_1 = new JLabel("Codigo - Nombre - Cantidad - PrecioCosto - PrecioFinal - Descuento - Medida");
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblCuit = new JLabel("CUIT: ");
		
		JLabel lblTelefono = new JLabel("Telefono:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblCuit_1 = new JLabel("Categoria:");
		
		txtCategoria = new JTextField();
		txtCategoria.setText("Categoria:");
		txtCategoria.setColumns(10);
		GroupLayout gl_tabVentas = new GroupLayout(tabVentas);
		gl_tabVentas.setHorizontalGroup(
			gl_tabVentas.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_tabVentas.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabVentas.createSequentialGroup()
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_tabVentas.createSequentialGroup()
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_8, 0, 288, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(btnBuscar)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblTipoFactura)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_9, 0, 92, Short.MAX_VALUE)
									.addGap(22)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblCodigoNombre_1, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
									.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
										.addComponent(btnGuardar_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCancelar)
										.addComponent(btnNueva, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addComponent(separator_11, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_tabVentas.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_tabVentas.createSequentialGroup()
											.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_tabVentas.createSequentialGroup()
											.addComponent(lblIva, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_tabVentas.createSequentialGroup()
											.addComponent(lblSubtotal)
											.addGap(10)
											.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_tabVentas.createSequentialGroup()
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblFacturarDesde)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_10, 0, 208, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblCuit, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
							.addGap(274))
						.addGroup(Alignment.TRAILING, gl_tabVentas.createSequentialGroup()
							.addComponent(lblCuit_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(274, Short.MAX_VALUE))))
		);
		gl_tabVentas.setVerticalGroup(
			gl_tabVentas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabVentas.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabVentas.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCliente)
							.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBuscar)
							.addComponent(lblTipoFactura)
							.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tabVentas.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFacturarDesde)
							.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tabVentas.createSequentialGroup()
								.addGap(3)
								.addComponent(lblTelefono))
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabVentas.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombre)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabVentas.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCuit))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabVentas.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCuit_1))
						.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabVentas.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDireccion))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabVentas.createSequentialGroup()
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSubtotal, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIva, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.BASELINE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotal)))
						.addGroup(gl_tabVentas.createParallelGroup(Alignment.TRAILING)
							.addComponent(separator_11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_tabVentas.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCodigoNombre_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_tabVentas.createSequentialGroup()
									.addComponent(btnNueva)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancelar)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnGuardar_2)))))
					.addGap(0))
		);
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "Cod Interno", "Descripcion", "Cantidad" , "$ Lista", "$ Final", "% Dto.", "Importe" });
		tabVentas.setLayout(gl_tabVentas);
		
		JPanel tabCompras = new JPanel();
		tabbedPane.addTab("Compras", new ImageIcon(Principal.class.getResource("/Iconos/Lista-32.png")), tabCompras, null);
		
		JLabel label_1 = new JLabel("FECHA DD/MM/AAAA");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblProveedor = new JLabel("Proveedor:");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nombre de Proveedor"}));
		
		JButton btnBuscar_1 = new JButton("Buscar");
		
		JLabel lblTotal_1 = new JLabel("Total:");
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_5 = new JLabel("$0.00");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblIva_1 = new JLabel("Iva:");
		lblIva_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_7 = new JLabel("$0.00");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_8 = new JLabel("Subtotal:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_9 = new JLabel("$0.00");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		table_3 = new JTable();
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		
		JButton btnNuevo_1 = new JButton("Nuevo");
		
		JButton btnCargar = new JButton("Cargar");
		
		JButton btnBorrar_2 = new JButton("Borrar");
		
		JLabel lblCodigoNombre = new JLabel("Codigo - Nombre - Cantidad - Precio - Importe");
		GroupLayout gl_tabCompras = new GroupLayout(tabCompras);
		gl_tabCompras.setHorizontalGroup(
			gl_tabCompras.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tabCompras.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabCompras.createSequentialGroup()
							.addComponent(lblProveedor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, 0, 169, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnBuscar_1)
							.addGap(200)
							.addComponent(label_1))
						.addGroup(gl_tabCompras.createParallelGroup(Alignment.TRAILING)
							.addComponent(table_3, GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
							.addGroup(gl_tabCompras.createSequentialGroup()
								.addGroup(gl_tabCompras.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_tabCompras.createSequentialGroup()
										.addComponent(lblCodigoNombre, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
										.addComponent(btnNuevo_1))
									.addGroup(gl_tabCompras.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
										.addGroup(gl_tabCompras.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnBorrar_2)
											.addComponent(btnCargar))))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(separator_12, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, gl_tabCompras.createSequentialGroup()
										.addComponent(lblTotal_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.TRAILING, gl_tabCompras.createSequentialGroup()
										.addComponent(lblIva_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.TRAILING, gl_tabCompras.createSequentialGroup()
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))))))
					.addGap(12))
		);
		gl_tabCompras.setVerticalGroup(
			gl_tabCompras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabCompras.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabCompras.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProveedor)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar_1)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_3, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
					.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_tabCompras.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_tabCompras.createSequentialGroup()
									.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING)
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_tabCompras.createParallelGroup(Alignment.LEADING)
										.addComponent(lblIva_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_tabCompras.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTotal_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_tabCompras.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnBorrar_2)
									.addComponent(separator_12, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_tabCompras.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabCompras.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNuevo_1)
								.addComponent(lblCodigoNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCargar)
							.addGap(40)
							.addGap(2))))
		);
		tabCompras.setLayout(gl_tabCompras);
		
		JPanel tabClientes = new JPanel();
		tabbedPane.addTab("Clientes", null, tabClientes, null);
		
		JLabel lblBuscarPorNombre = new JLabel("Buscar por nombre:");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		table_4 = new JTable();
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnBajaClientes = new JButton("Baja Clientes");
		
		JButton btnAltaClientes = new JButton("Alta Clientes");
		
		JButton btnBusquedaAvanzada_1 = new JButton(" busqueda avanzada");
		GroupLayout gl_tabClientes = new GroupLayout(tabClientes);
		gl_tabClientes.setHorizontalGroup(
			gl_tabClientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabClientes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabClientes.createParallelGroup(Alignment.LEADING)
						.addComponent(table_4, GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
						.addGroup(gl_tabClientes.createSequentialGroup()
							.addComponent(lblBuscarPorNombre)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnBusquedaAvanzada_1))
						.addGroup(gl_tabClientes.createSequentialGroup()
							.addComponent(btnBajaClientes, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAltaClientes, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_tabClientes.setVerticalGroup(
			gl_tabClientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabClientes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBuscarPorNombre)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBusquedaAvanzada_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_4, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBajaClientes)
						.addComponent(btnAltaClientes))
					.addContainerGap())
		);
		tabClientes.setLayout(gl_tabClientes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		JLabel lblGenerarReporteDe = new JLabel("Reporte de categorias:");
		lblGenerarReporteDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerarReporteDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setToolTipText("te la robo un abuelo");
		
		JSeparator separator_13 = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(90)
							.addComponent(btnGenerar))
						.addComponent(separator_13, GroupLayout.PREFERRED_SIZE, 833, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGenerarReporteDe))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGenerarReporteDe, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(btnGenerar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_13, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(495, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 998, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public static void main(String[] ar) {
        JFrame f=new Principal();
        f.setBounds(10,10,300,200);
        f.setVisible(true);
    }
}
