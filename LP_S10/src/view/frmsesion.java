package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmsesion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPaswo;
	private JButton btnIngresar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmsesion frame = new frmsesion();
					frame.setLocationRelativeTo(frame);
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
	public frmsesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(29, 31, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblClave = new JLabel("clave");
		lblClave.setBounds(29, 66, 46, 14);
		contentPane.add(lblClave);
		
		txtUser = new JTextField();
		txtUser.setBounds(116, 28, 149, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPaswo = new JPasswordField();
		txtPaswo.setBounds(116, 63, 149, 20);
		contentPane.add(txtPaswo);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(101, 116, 89, 23);
		contentPane.add(btnIngresar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(101, 150, 89, 23);
		contentPane.add(btnCancelar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}
	
	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		String user= txtUser.getText();
		char psw[]= txtPaswo.getPassword();
		String contra= new String(psw);
		
		if(user.equals("admin") && contra.equals("123")){
			this.dispose();
			JOptionPane.showMessageDialog(null, "Ingreso Valid");
			frmprincipal p = new frmprincipal();
			p.setLocationRelativeTo(p);
			p.setVisible(true);
		}else{
			JOptionPane.showMessageDialog(null, "error usuario/contraseña");
		}
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		System.exit(0);
	}
}
