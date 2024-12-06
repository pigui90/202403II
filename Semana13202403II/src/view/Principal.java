package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea taArchivo;
	private JTextField textField;
	private JScrollPane scroll;

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
		setBounds(100, 100, 736, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBuscarArchivo = new JButton("Buscar");
		btnBuscarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(btnBuscarArchivo);
					File archivoSeleccionado = jfc.getSelectedFile();

					FileReader fileReader = new FileReader(archivoSeleccionado);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					String contenido = "";
					String lineaArchivo = bufferedReader.readLine();
					while(lineaArchivo != null) {
						contenido = contenido.concat(lineaArchivo).concat("\n");
						lineaArchivo = bufferedReader.readLine();
					}
					
					taArchivo.setText(contenido);
					bufferedReader.close();
					
				} catch (FileNotFoundException fnfe) {
					JOptionPane.showMessageDialog(btnBuscarArchivo, fnfe.getMessage(), "Error con el archivo",
							JOptionPane.ERROR_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(btnBuscarArchivo, e1.getMessage(), "Error con el archivo",
							JOptionPane.ERROR_MESSAGE);
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(btnBuscarArchivo, e2.getMessage(), "Error con el archivo",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnBuscarArchivo.setBounds(10, 21, 89, 23);
		contentPane.add(btnBuscarArchivo);

		taArchivo = new JTextArea();
		scroll = new JScrollPane(taArchivo);
		scroll.setBounds(45, 55, 351, 183);
		contentPane.add(scroll);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\\') {
					e.consume();
				}
			}
		});
		textField.setBounds(43, 263, 361, 106);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
