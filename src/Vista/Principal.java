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

public class Principal extends JFrame {

	private JPanel contentPane;
	private Coordinador miCoordinador;
	private ArrayList<Categoria> categorias = null;
	private JTable table;

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
		setBounds(100, 100, 841, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		contentPane.add(tabbedPane, "name_189365754806797");
		
		JPanel tabArticulo = new JPanel();
		tabbedPane.addTab("Articulos", new ImageIcon(Principal.class.getResource("/Iconos/Maintenance-32.png")), tabArticulo, null);
		tabArticulo.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Martillo", new Float(100.0f), new Integer(10), "De Mano"},
				{"Destornillador", new Float(30.0f), new Integer(150), "Portable"},
				{"Pinza", new Float(150.0f), new Integer(35), "Portable"},
			},
			new String[] {
				"Nombre", "Precio", "Stock", "Categoria"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Float.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 11, 215, 365);
		tabArticulo.add(table);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(248, 342, 89, 23);
		tabArticulo.add(btnNuevo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(248, 376, 89, 23);
		tabArticulo.add(btnBorrar);
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		lblNombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombreProducto.setBounds(235, 11, 285, 39);
		tabArticulo.add(lblNombreProducto);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(237, 11, 1, 320);
		tabArticulo.add(separator);
		
		JLabel lblProveedores = new JLabel("Proveedores:");
		lblProveedores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProveedores.setBounds(407, 69, 113, 23);
		tabArticulo.add(lblProveedores);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(248, 69, 113, 23);
		tabArticulo.add(lblPrecio);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCategoria.setBounds(248, 150, 113, 23);
		tabArticulo.add(lblCategoria);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCosto.setBounds(248, 109, 113, 23);
		tabArticulo.add(lblCosto);
		
		JPanel tabCategoria = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) tabCategoria.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Categorias", new ImageIcon(Principal.class.getResource("/Iconos/Open Folder-32.png")), tabCategoria, null);
		
		JPanel tabProveedor = new JPanel();
		FlowLayout flowLayout = (FlowLayout) tabProveedor.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Proveedores", new ImageIcon(Principal.class.getResource("/Iconos/Truck-32.png")), tabProveedor, null);
	}
	
	public static void main(String[] ar) {
        JFrame f=new Principal();
        f.setBounds(10,10,300,200);
        f.setVisible(true);
    }
}
