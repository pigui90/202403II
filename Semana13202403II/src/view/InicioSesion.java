package view;

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

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUser;
	private JPasswordField pfPass;
	private String user = "admin";
	private String pass = "1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(58, 41, 46, 14);
		contentPane.add(lblNewLabel);

		tfUser = new JTextField();
		tfUser.setBounds(132, 38, 86, 20);
		contentPane.add(tfUser);
		tfUser.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(58, 93, 46, 14);
		contentPane.add(lblNewLabel_1);

		pfPass = new JPasswordField();
		pfPass.setBounds(132, 90, 112, 20);
		contentPane.add(pfPass);

		JButton btnNewButton = new JButton("Inicio Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfUser.getText().equals(user) && new String(pfPass.getPassword()).equals(pass)) {
					setVisible(false);
					Principal principal = new Principal();
					principal.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Problemas con el login",
							"usuario/contraseña incorrecta", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(129, 142, 135, 23);
		contentPane.add(btnNewButton);
	}
}
