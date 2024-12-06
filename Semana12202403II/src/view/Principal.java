package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Principal extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnMostrarNombre;
	private JButton btnNavegarSecundario;
	private JLabel lblMensajes;
	private JTextField tfNumero;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 21, 76, 14);
		contentPane.add(lblNombre);

		textField = new JTextField();
		textField.setBounds(96, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		btnMostrarNombre = new JButton("Mostrar Nombre");
		btnMostrarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				JOptionPane.showMessageDialog(btnMostrarNombre, nombre);
			}
		});
		btnMostrarNombre.setBounds(63, 75, 147, 23);
		contentPane.add(btnMostrarNombre);

		JCheckBox chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxActivo.isSelected()) {
					lblMensajes.setVisible(true);
					lblMensajes.setText("Estoy seleccionado");
					lblMensajes.setForeground(Color.BLUE);
				}else {
					lblMensajes.setVisible(false);
				}
			}
		});
		chckbxActivo.setBounds(60, 118, 97, 23);
		contentPane.add(chckbxActivo);

		JSpinner spNumero = new JSpinner();
		spNumero.setBounds(70, 148, 87, 20);
		contentPane.add(spNumero);

		btnNavegarSecundario = new JButton("Ir a Secundario");
		btnNavegarSecundario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secundario secundario = new Secundario();
				secundario.setVisible(true);
				setVisible(false);
			}
		});
		btnNavegarSecundario.setBounds(245, 32, 133, 23);
		contentPane.add(btnNavegarSecundario);

		lblMensajes = new JLabel("...");
		lblMensajes.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMensajes.setBounds(10, 218, 414, 32);
		lblMensajes.setVisible(false);

		contentPane.add(lblMensajes);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(73, 177, 86, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		btnNewButton = new JButton("Calcular cuadrado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				int numero = Integer.parseInt(tfNumero.getText());
				numero = numero * numero;
				lblMensajes.setText(String.valueOf(numero));
				lblMensajes.setForeground(Color.GREEN);
				lblMensajes.setVisible(true);
				}catch (Exception ex) {
					lblMensajes.setText(ex.getMessage());
					lblMensajes.setVisible(true);
					lblMensajes.setForeground(Color.RED);

				}
			}
		});
		btnNewButton.setBounds(169, 176, 147, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(10, 180, 46, 14);
		contentPane.add(lblNewLabel);
		
		btnNumero2 = new JButton("Suma +10");
		btnNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numeroSuma = (int) spNumero.getValue();
				numeroSuma = numeroSuma + 10;
				JOptionPane.showMessageDialog(spNumero, numeroSuma);
			}
		});
		btnNumero2.setBounds(169, 147, 112, 23);
		contentPane.add(btnNumero2);
	}
}
