package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField txtPuntuacion;
	private JList<Double> list;
	private JButton btnAadirPuntuacion;

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
		frame.setBounds(100, 100, 441, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 18, 148, 91, 132, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblPuntuacion = new JLabel("Puntuacion:");
		GridBagConstraints gbc_lblPuntuacion = new GridBagConstraints();
		gbc_lblPuntuacion.anchor = GridBagConstraints.WEST;
		gbc_lblPuntuacion.insets = new Insets(10, 10, 5, 5);
		gbc_lblPuntuacion.gridx = 1;
		gbc_lblPuntuacion.gridy = 0;
		frame.getContentPane().add(lblPuntuacion, gbc_lblPuntuacion);

		txtPuntuacion = new JTextField();
		GridBagConstraints gbc_txtPuntuacion = new GridBagConstraints();
		gbc_txtPuntuacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntuacion.insets = new Insets(10, 0, 5, 5);
		gbc_txtPuntuacion.gridx = 2;
		gbc_txtPuntuacion.gridy = 0;
		frame.getContentPane().add(txtPuntuacion, gbc_txtPuntuacion);
		txtPuntuacion.setColumns(10);

		btnAadirPuntuacion = new JButton("A\u00F1adir puntuacion");
		btnAadirPuntuacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double puntuacion = Double.parseDouble(txtPuntuacion.getText());
				if(puntuacion.isNaN()) {
					JOptionPane.showMessageDialog(frame, "Error, el dato es incorrecto");
					return;
				}
				
			}
		});
		GridBagConstraints gbc_btnAadirPuntuacion = new GridBagConstraints();
		gbc_btnAadirPuntuacion.anchor = GridBagConstraints.WEST;
		gbc_btnAadirPuntuacion.insets = new Insets(10, 0, 5, 0);
		gbc_btnAadirPuntuacion.gridx = 3;
		gbc_btnAadirPuntuacion.gridy = 0;
		frame.getContentPane().add(btnAadirPuntuacion, gbc_btnAadirPuntuacion);

		JLabel lblListaDePuntuaciones = new JLabel("Lista de puntuaciones:");
		GridBagConstraints gbc_lblListaDePuntuaciones = new GridBagConstraints();
		gbc_lblListaDePuntuaciones.anchor = GridBagConstraints.WEST;
		gbc_lblListaDePuntuaciones.insets = new Insets(0, 10, 5, 5);
		gbc_lblListaDePuntuaciones.gridx = 1;
		gbc_lblListaDePuntuaciones.gridy = 1;
		frame.getContentPane().add(lblListaDePuntuaciones, gbc_lblListaDePuntuaciones);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		list = new JList<Double>();
		scrollPane.setViewportView(list);

		JButton btnBorrarPuntuacion = new JButton("Borrar puntuacion seleccionada");
		btnBorrarPuntuacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnBorrarPuntuacion = new GridBagConstraints();
		gbc_btnBorrarPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarPuntuacion.gridx = 1;
		gbc_btnBorrarPuntuacion.gridy = 3;
		frame.getContentPane().add(btnBorrarPuntuacion, gbc_btnBorrarPuntuacion);

		JButton btnMedia = new JButton("Calcular Media");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnMedia = new GridBagConstraints();
		gbc_btnMedia.anchor = GridBagConstraints.WEST;
		gbc_btnMedia.insets = new Insets(0, 0, 0, 5);
		gbc_btnMedia.gridx = 1;
		gbc_btnMedia.gridy = 4;
		frame.getContentPane().add(btnMedia, gbc_btnMedia);

		JLabel lblResultado = new JLabel("");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.insets = new Insets(0, 0, 0, 5);
		gbc_lblResultado.gridx = 2;
		gbc_lblResultado.gridy = 4;
		frame.getContentPane().add(lblResultado, gbc_lblResultado);
	}

}
