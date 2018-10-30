package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmempleado extends JDialog implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmempleado dialog = new frmempleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmempleado() {
		setBounds(100, 100, 842, 494);
		getContentPane().setLayout(null);
		{
			JLabel lblMantenimientoEmpleado = new JLabel("Mantenimiento Empleado");
			lblMantenimientoEmpleado.setFont(new Font("Tahoma", Font.BOLD, 19));
			lblMantenimientoEmpleado.setBounds(63, 11, 301, 46);
			getContentPane().add(lblMantenimientoEmpleado);
		}
		{
			JLabel lblPaterno = new JLabel("paterno");
			lblPaterno.setBounds(10, 71, 46, 14);
			getContentPane().add(lblPaterno);
		}
		{
			JLabel lblMaterno = new JLabel("materno");
			lblMaterno.setBounds(237, 68, 46, 14);
			getContentPane().add(lblMaterno);
		}
		{
			textField = new JTextField();
			textField.setBounds(63, 68, 164, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(288, 65, 131, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNombres = new JLabel("nombres");
			lblNombres.setBounds(429, 68, 46, 14);
			getContentPane().add(lblNombres);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(485, 65, 96, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblSexo = new JLabel("sexo");
			lblSexo.setBounds(598, 71, 46, 14);
			getContentPane().add(lblSexo);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"masculino", "femenino"}));
			comboBox.setBounds(645, 68, 86, 20);
			getContentPane().add(comboBox);
		}
		{
			JLabel lblDni = new JLabel("dni");
			lblDni.setBounds(10, 107, 46, 14);
			getContentPane().add(lblDni);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(63, 104, 106, 20);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblTelefono = new JLabel("telefono");
			lblTelefono.setBounds(181, 107, 46, 14);
			getContentPane().add(lblTelefono);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(227, 104, 137, 20);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JLabel lblCelular = new JLabel("celular");
			lblCelular.setBounds(374, 107, 46, 14);
			getContentPane().add(lblCelular);
		}
		{
			textField_5 = new JTextField();
			textField_5.setBounds(411, 104, 86, 20);
			getContentPane().add(textField_5);
			textField_5.setColumns(10);
		}
		{
			JLabel lblGrado = new JLabel("grado");
			lblGrado.setBounds(512, 107, 46, 14);
			getContentPane().add(lblGrado);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(568, 104, 96, 20);
			getContentPane().add(comboBox);
		}
		{
			JLabel lblTipo = new JLabel("tipo");
			lblTipo.setBounds(674, 107, 46, 14);
			getContentPane().add(lblTipo);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(715, 104, 86, 20);
			getContentPane().add(comboBox);
		}
		{
			JLabel lblCorrreo = new JLabel("corrreo");
			lblCorrreo.setBounds(10, 143, 46, 14);
			getContentPane().add(lblCorrreo);
		}
		{
			textField_6 = new JTextField();
			textField_6.setBounds(63, 140, 208, 20);
			getContentPane().add(textField_6);
			textField_6.setColumns(10);
		}
		{
			JLabel lblDirreciion = new JLabel("dirreciion");
			lblDirreciion.setBounds(10, 174, 60, 14);
			getContentPane().add(lblDirreciion);
		}
		{
			textField_7 = new JTextField();
			textField_7.setBounds(63, 171, 208, 20);
			getContentPane().add(textField_7);
			textField_7.setColumns(10);
		}
		{
			JLabel lblCondicion = new JLabel("condicion");
			lblCondicion.setBounds(289, 143, 46, 14);
			getContentPane().add(lblCondicion);
		}
		{
			JLabel lblDistrito = new JLabel("distrito");
			lblDistrito.setBounds(288, 174, 46, 14);
			getContentPane().add(lblDistrito);
		}
		{
			textField_8 = new JTextField();
			textField_8.setBounds(578, 140, 86, 20);
			getContentPane().add(textField_8);
			textField_8.setColumns(10);
		}
		{
			textField_9 = new JTextField();
			textField_9.setBounds(578, 171, 86, 20);
			getContentPane().add(textField_9);
			textField_9.setColumns(10);
		}
		{
			JLabel lblUsuario = new JLabel("usuario");
			lblUsuario.setBounds(512, 143, 46, 14);
			getContentPane().add(lblUsuario);
		}
		{
			JLabel lblClave = new JLabel("clave");
			lblClave.setBounds(512, 174, 46, 14);
			getContentPane().add(lblClave);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(345, 140, 117, 20);
			getContentPane().add(comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(344, 171, 117, 20);
			getContentPane().add(comboBox);
		}
		{
			table = new JTable();
			table.setBounds(10, 210, 806, 188);
			getContentPane().add(table);
		}
		{
			btnCerrar = new JButton("cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(686, 409, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			JButton btnNuevo = new JButton("nuevo");
			btnNuevo.setBounds(237, 409, 89, 23);
			getContentPane().add(btnNuevo);
		}
		{
			JButton btnEliminar = new JButton("eliminar");
			btnEliminar.setBounds(348, 409, 89, 23);
			getContentPane().add(btnEliminar);
		}
		{
			JButton btnGrabar = new JButton("grabar");
			btnGrabar.setBounds(469, 409, 89, 23);
			getContentPane().add(btnGrabar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	}
}
