package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;

public class frmprincipal extends JFrame implements ActionListener {
	private JMenuItem mntmLibro;
	private JMenuItem mntmEmpleado;
	private JMenuItem mntmLector;
	private JInternalFrame scv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmprincipal frame = new frmprincipal();
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
	public frmprincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 524);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmEmpleado = new JMenuItem("Empleado");
		mntmEmpleado.addActionListener(this);
		mnMantenimiento.add(mntmEmpleado);
		
		mntmLector = new JMenuItem("Lector");
		mntmLector.addActionListener(this);
		mnMantenimiento.add(mntmLector);
		
		JMenuItem mntmUsuario = new JMenuItem("usuario");
		mnMantenimiento.add(mntmUsuario);
		
		mntmLibro = new JMenuItem("libro");
		mntmLibro.addActionListener(this);
		mnMantenimiento.add(mntmLibro);
		
		JMenu mnProceso = new JMenu("Proceso");
		menuBar.add(mnProceso);
		
		JMenuItem mntmBoleta = new JMenuItem("Boleta");
		mnProceso.add(mntmBoleta);
		
		JMenuItem mntmTraslado = new JMenuItem("traslado");
		mnProceso.add(mntmTraslado);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		getContentPane().setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmLector) {
			actionPerformedMntmLector(e);
		}
		if (e.getSource() == mntmEmpleado) {
			actionPerformedMntmEmpleado(e);
		}
		if (e.getSource() == mntmLibro) {
			actionPerformedMntmLibro(e);
		}
	}
	protected void actionPerformedMntmLibro(ActionEvent e) {
		frmlibro lib = new frmlibro();
		lib.setLocationRelativeTo(lib);
		lib.setVisible(true);

	}
	protected void actionPerformedMntmEmpleado(ActionEvent e) {
		frmempleado es = new frmempleado();
		es.setLocationRelativeTo(es);
		es.setVisible(true);
	}
	protected void actionPerformedMntmLector(ActionEvent e) {
		frmlector lec= new frmlector();
		lec.setLocationRelativeTo(lec);
		lec.setVisible(true);
	}
}
