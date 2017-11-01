package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Principal {

	private JFrame frame;
	private JTextField txtServidor;
	private JTextField txtPuerto;
	private JTextField txtUsuario;
	private JTextField txtPass;
	private JTextField txtSquema;

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
		frame.setBounds(300, 300, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelGenerar = new JPanel();
		panelGenerar.setBackground(Color.WHITE);
		tabbedPane.addTab("GENERAR", null, panelGenerar, null);
		GridBagLayout gbl_panelGenerar = new GridBagLayout();
		gbl_panelGenerar.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelGenerar.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelGenerar.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelGenerar.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelGenerar.setLayout(gbl_panelGenerar);
		
		JButton btnGenerar = new JButton("Generar y guardar nuevo n\u00FAmero aleatorio");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 2;
		gbc_btnGenerar.gridy = 2;
		panelGenerar.add(btnGenerar, gbc_btnGenerar);
		
		JLabel lblNumeroAleatorio = new JLabel("0");
		GridBagConstraints gbc_lblNumeroAleatorio = new GridBagConstraints();
		gbc_lblNumeroAleatorio.gridx = 4;
		gbc_lblNumeroAleatorio.gridy = 2;
		panelGenerar.add(lblNumeroAleatorio, gbc_lblNumeroAleatorio);
		
		JPanel panelListar = new JPanel();
		tabbedPane.addTab("LISTAR", null, panelListar, null);
		panelListar.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelListar.add(scrollPane, BorderLayout.CENTER);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblListadoDeNmeros = new JLabel("Listado de n\u00FAmeros aleatorios guardados en la BD");
		scrollPane.setColumnHeaderView(lblListadoDeNmeros);
		
		JPanel panel = new JPanel();
		panelListar.add(panel, BorderLayout.SOUTH);
		
		JButton btnEliminarSeleccionado = new JButton("ELIMINAR SELECCIONADO");
		panel.add(btnEliminarSeleccionado);
		
		JButton btnRefrescar = new JButton("REFRESCAR");
		panel.add(btnRefrescar);
		
		JPanel panelConfiguracion = new JPanel();
		tabbedPane.addTab("CONFIGURACION", null, panelConfiguracion, null);
		GridBagLayout gbl_panelConfiguracion = new GridBagLayout();
		gbl_panelConfiguracion.columnWidths = new int[]{0, 0, 0};
		gbl_panelConfiguracion.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelConfiguracion.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelConfiguracion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelConfiguracion.setLayout(gbl_panelConfiguracion);
		
		JLabel lblParmetrosDeConexin = new JLabel("Par\u00E1metros de conexi\u00F3n con la base de datos ");
		GridBagConstraints gbc_lblParmetrosDeConexin = new GridBagConstraints();
		gbc_lblParmetrosDeConexin.insets = new Insets(0, 0, 5, 5);
		gbc_lblParmetrosDeConexin.gridx = 0;
		gbc_lblParmetrosDeConexin.gridy = 0;
		panelConfiguracion.add(lblParmetrosDeConexin, gbc_lblParmetrosDeConexin);
		
		JLabel lblServidor = new JLabel("Servidor:");
		GridBagConstraints gbc_lblServidor = new GridBagConstraints();
		gbc_lblServidor.anchor = GridBagConstraints.EAST;
		gbc_lblServidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblServidor.gridx = 0;
		gbc_lblServidor.gridy = 2;
		panelConfiguracion.add(lblServidor, gbc_lblServidor);
		
		txtServidor = new JTextField();
		GridBagConstraints gbc_txtServidor = new GridBagConstraints();
		gbc_txtServidor.insets = new Insets(0, 0, 5, 0);
		gbc_txtServidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtServidor.gridx = 1;
		gbc_txtServidor.gridy = 2;
		panelConfiguracion.add(txtServidor, gbc_txtServidor);
		txtServidor.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Puerto:");
		GridBagConstraints gbc_lblPuerto = new GridBagConstraints();
		gbc_lblPuerto.anchor = GridBagConstraints.EAST;
		gbc_lblPuerto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuerto.gridx = 0;
		gbc_lblPuerto.gridy = 3;
		panelConfiguracion.add(lblPuerto, gbc_lblPuerto);
		
		txtPuerto = new JTextField();
		GridBagConstraints gbc_txtPuerto = new GridBagConstraints();
		gbc_txtPuerto.insets = new Insets(0, 0, 5, 0);
		gbc_txtPuerto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuerto.gridx = 1;
		gbc_txtPuerto.gridy = 3;
		panelConfiguracion.add(txtPuerto, gbc_txtPuerto);
		txtPuerto.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 4;
		panelConfiguracion.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 4;
		panelConfiguracion.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 5;
		panelConfiguracion.add(lblPassword, gbc_lblPassword);
		
		txtPass = new JTextField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.insets = new Insets(0, 0, 5, 0);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 1;
		gbc_txtPass.gridy = 5;
		panelConfiguracion.add(txtPass, gbc_txtPass);
		txtPass.setColumns(10);
		
		JLabel lblSquemaBd = new JLabel("Squema BD:");
		GridBagConstraints gbc_lblSquemaBd = new GridBagConstraints();
		gbc_lblSquemaBd.anchor = GridBagConstraints.EAST;
		gbc_lblSquemaBd.insets = new Insets(0, 0, 5, 5);
		gbc_lblSquemaBd.gridx = 0;
		gbc_lblSquemaBd.gridy = 6;
		panelConfiguracion.add(lblSquemaBd, gbc_lblSquemaBd);
		
		txtSquema = new JTextField();
		GridBagConstraints gbc_txtSquema = new GridBagConstraints();
		gbc_txtSquema.insets = new Insets(0, 0, 5, 0);
		gbc_txtSquema.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSquema.gridx = 1;
		gbc_txtSquema.gridy = 6;
		panelConfiguracion.add(txtSquema, gbc_txtSquema);
		txtSquema.setColumns(10);
		
		JLabel lblParametrosDeGeneracion = new JLabel("Parametros de generacion de n\u00FAmeros aleatorios: ");
		GridBagConstraints gbc_lblParametrosDeGeneracion = new GridBagConstraints();
		gbc_lblParametrosDeGeneracion.insets = new Insets(0, 0, 5, 5);
		gbc_lblParametrosDeGeneracion.gridx = 0;
		gbc_lblParametrosDeGeneracion.gridy = 8;
		panelConfiguracion.add(lblParametrosDeGeneracion, gbc_lblParametrosDeGeneracion);
		
		JLabel lblValorMximo = new JLabel("Valor m\u00E1ximo: ");
		GridBagConstraints gbc_lblValorMximo = new GridBagConstraints();
		gbc_lblValorMximo.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorMximo.gridx = 0;
		gbc_lblValorMximo.gridy = 10;
		panelConfiguracion.add(lblValorMximo, gbc_lblValorMximo);
		
		JSpinner spinnerValorMax = new JSpinner();
		GridBagConstraints gbc_spinnerValorMax = new GridBagConstraints();
		gbc_spinnerValorMax.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerValorMax.gridx = 1;
		gbc_spinnerValorMax.gridy = 10;
		panelConfiguracion.add(spinnerValorMax, gbc_spinnerValorMax);
		
		JLabel lblValorMnimo = new JLabel("Valor m\u00EDnimo: ");
		GridBagConstraints gbc_lblValorMnimo = new GridBagConstraints();
		gbc_lblValorMnimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorMnimo.gridx = 0;
		gbc_lblValorMnimo.gridy = 11;
		panelConfiguracion.add(lblValorMnimo, gbc_lblValorMnimo);
		
		JSpinner spinnerValorMin = new JSpinner();
		GridBagConstraints gbc_spinnerValorMin = new GridBagConstraints();
		gbc_spinnerValorMin.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerValorMin.gridx = 1;
		gbc_spinnerValorMin.gridy = 11;
		panelConfiguracion.add(spinnerValorMin, gbc_spinnerValorMin);
		
		JButton btnConectarse = new JButton("CONECTARSE");
		GridBagConstraints gbc_btnConectarse = new GridBagConstraints();
		gbc_btnConectarse.insets = new Insets(0, 0, 0, 5);
		gbc_btnConectarse.gridx = 0;
		gbc_btnConectarse.gridy = 14;
		panelConfiguracion.add(btnConectarse, gbc_btnConectarse);
		
		JButton btnDesconectarse = new JButton("DESCONECTARSE");
		GridBagConstraints gbc_btnDesconectarse = new GridBagConstraints();
		gbc_btnDesconectarse.gridx = 1;
		gbc_btnDesconectarse.gridy = 14;
		panelConfiguracion.add(btnDesconectarse, gbc_btnDesconectarse);
	}
}
