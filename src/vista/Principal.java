package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JTextField;

public class Principal {

	private JFrame frame;
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
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 766, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("GENERAR", null, panel, null);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnGenerar = new JButton("GENERAR Y GUARDAR NUEVO NUMERO ALEATORIO");
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 0;
		gbc_btnGenerar.gridy = 1;
		panel_3.add(btnGenerar, gbc_btnGenerar);
		
		JLabel txtNumero = new JLabel("0");
		GridBagConstraints gbc_txtNumero = new GridBagConstraints();
		gbc_txtNumero.anchor = GridBagConstraints.NORTH;
		gbc_txtNumero.gridx = 1;
		gbc_txtNumero.gridy = 1;
		panel_3.add(txtNumero, gbc_txtNumero);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("LISTAR", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel Listado = new JLabel("Listado de numeros aleatorios guardados en la BD");
		scrollPane.setColumnHeaderView(Listado);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnEliminar = new JButton("Eliminar Seleccionado");
		panel_4.add(btnEliminar);
		
		JButton btnRefrescar = new JButton("Refrescar");
		panel_4.add(btnRefrescar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("CONFIGURACION", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblParametrosDeConexion = new JLabel("Parametros de conexion de la BD");
		GridBagConstraints gbc_lblParametrosDeConexion = new GridBagConstraints();
		gbc_lblParametrosDeConexion.insets = new Insets(0, 0, 5, 5);
		gbc_lblParametrosDeConexion.gridx = 0;
		gbc_lblParametrosDeConexion.gridy = 0;
		panel_1.add(lblParametrosDeConexion, gbc_lblParametrosDeConexion);
		
		JLabel lblServidor = new JLabel("Servidor");
		GridBagConstraints gbc_lblServidor = new GridBagConstraints();
		gbc_lblServidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblServidor.anchor = GridBagConstraints.EAST;
		gbc_lblServidor.gridx = 0;
		gbc_lblServidor.gridy = 2;
		panel_1.add(lblServidor, gbc_lblServidor);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Puerto");
		GridBagConstraints gbc_lblPuerto = new GridBagConstraints();
		gbc_lblPuerto.anchor = GridBagConstraints.EAST;
		gbc_lblPuerto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuerto.gridx = 0;
		gbc_lblPuerto.gridy = 3;
		panel_1.add(lblPuerto, gbc_lblPuerto);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 4;
		panel_1.add(lblUsuario, gbc_lblUsuario);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 5;
		panel_1.add(lblPassword, gbc_lblPassword);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 5;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSchemaDb = new JLabel("Schema DB");
		GridBagConstraints gbc_lblSchemaDb = new GridBagConstraints();
		gbc_lblSchemaDb.anchor = GridBagConstraints.EAST;
		gbc_lblSchemaDb.insets = new Insets(0, 0, 5, 5);
		gbc_lblSchemaDb.gridx = 0;
		gbc_lblSchemaDb.gridy = 6;
		panel_1.add(lblSchemaDb, gbc_lblSchemaDb);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 6;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblParametrosGeneracionDe = new JLabel("Parametros generacion de numeros aleatorios");
		GridBagConstraints gbc_lblParametrosGeneracionDe = new GridBagConstraints();
		gbc_lblParametrosGeneracionDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblParametrosGeneracionDe.gridx = 0;
		gbc_lblParametrosGeneracionDe.gridy = 8;
		panel_1.add(lblParametrosGeneracionDe, gbc_lblParametrosGeneracionDe);
		
		JLabel lblValorMximo = new JLabel("Valor m\u00E1ximo");
		GridBagConstraints gbc_lblValorMximo = new GridBagConstraints();
		gbc_lblValorMximo.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorMximo.gridx = 0;
		gbc_lblValorMximo.gridy = 9;
		panel_1.add(lblValorMximo, gbc_lblValorMximo);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 9;
		panel_1.add(spinner, gbc_spinner);
		
		JLabel lblValorMnimo = new JLabel("Valor m\u00EDnimo");
		GridBagConstraints gbc_lblValorMnimo = new GridBagConstraints();
		gbc_lblValorMnimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorMnimo.gridx = 0;
		gbc_lblValorMnimo.gridy = 10;
		panel_1.add(lblValorMnimo, gbc_lblValorMnimo);
		
		JSpinner spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_1.gridx = 1;
		gbc_spinner_1.gridy = 10;
		panel_1.add(spinner_1, gbc_spinner_1);
		
		JButton btnConectarse = new JButton("Conectarse");
		GridBagConstraints gbc_btnConectarse = new GridBagConstraints();
		gbc_btnConectarse.insets = new Insets(0, 0, 0, 5);
		gbc_btnConectarse.gridx = 0;
		gbc_btnConectarse.gridy = 12;
		panel_1.add(btnConectarse, gbc_btnConectarse);
		
		JButton btnDesconectarse = new JButton("Desconectarse");
		GridBagConstraints gbc_btnDesconectarse = new GridBagConstraints();
		gbc_btnDesconectarse.gridx = 1;
		gbc_btnDesconectarse.gridy = 12;
		panel_1.add(btnDesconectarse, gbc_btnDesconectarse);
	}

}
