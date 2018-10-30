package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmlibro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTextField txtTitulo;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JTable tbLibro;
	private JButton btnNuevo;
	private JButton btnCerrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmlibro frame = new frmlibro();
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
	public frmlibro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMantenimientoDeLibro = new JLabel("Mantenimiento de libro");
		lblMantenimientoDeLibro.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMantenimientoDeLibro.setBounds(88, 0, 301, 46);
		contentPane.add(lblMantenimientoDeLibro);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(31, 56, 46, 14);
		contentPane.add(lblCodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(87, 50, 86, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		JLabel lblTitulo = new JLabel("titulo");
		lblTitulo.setBounds(31, 93, 46, 14);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(88, 90, 203, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(87, 122, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblPrecio = new JLabel("precio");
		lblPrecio.setBounds(31, 125, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(202, 125, 46, 14);
		contentPane.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setBounds(269, 122, 86, 20);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		tbLibro = new JTable();
		tbLibro.setFillsViewportHeight(true);
		tbLibro.setBounds(10, 164, 565, 208);
		contentPane.add(tbLibro);
DefaultTableModel modelo= new DefaultTableModel();
		
		modelo.addColumn("Codigo");
		modelo.addColumn("Descripcion");
		modelo.addColumn("precio");
		modelo.addColumn("stock");
		
		tbLibro.setModel(modelo);
		
		btnNuevo = new JButton("nuevo");
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(84, 411, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnGrabar = new JButton("grabar");
		btnGrabar.setBounds(225, 411, 89, 23);
		contentPane.add(btnGrabar);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(368, 411, 89, 23);
		contentPane.add(btnEliminar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(486, 411, 89, 23);
		contentPane.add(btnCerrar);
		
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(arg0);
		}
	}
	protected void actionPerformedBtnNuevo(ActionEvent arg0) {
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
