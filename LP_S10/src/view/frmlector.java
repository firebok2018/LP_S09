package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmlector extends JDialog implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton btnEliminar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmlector dialog = new frmlector();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public frmlector() {
		setBounds(100, 100, 642, 509);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Codigo");
		label.setBounds(55, 73, 46, 14);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(111, 67, 86, 20);
		getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("nombre");
		label_1.setBounds(55, 110, 46, 14);
		getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 107, 203, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 139, 86, 20);
		getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("dni");
		label_2.setBounds(55, 142, 46, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("sexo");
		label_3.setBounds(226, 142, 46, 14);
		getContentPane().add(label_3);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBounds(10, 180, 606, 208);
		getContentPane().add(table);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"masculino", "femenino"}));
		comboBox.setBounds(273, 139, 86, 20);
		getContentPane().add(comboBox);
		
		JLabel label_4 = new JLabel("Mantenimiento de lector");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_4.setBounds(154, 11, 301, 46);
		getContentPane().add(label_4);
		
		JButton btnNuevo = new JButton("nuevo");
		btnNuevo.setBounds(10, 410, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnGrabar = new JButton("grabar");
		btnGrabar.setBounds(108, 410, 89, 23);
		getContentPane().add(btnGrabar);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(396, 410, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(515, 410, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.setBounds(207, 410, 89, 23);
		getContentPane().add(btnCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
