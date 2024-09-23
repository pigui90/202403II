package model;

import javax.swing.JOptionPane;

/**
 * Clase principal para ejecutar nuestro programa
 */
public class Main {

	/**
	 * 
	 * Metodo Main para ejecutar las primeras lineas de codigo
	 * 
	 * @param args Parametros por defecto de nuestro metodo main que usa java
	 */
	public static void main(String[] args) {
		try {
			int numero = 5;
			for (int i = 1; i <= 10; i++) {
				JOptionPane.showMessageDialog(null, "La division del numero por i es : " + (numero / i));
				numero = numero + i;
			}
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "Error no se puede dividir entre zero", "Error en la ejecucion",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(), "Error en la ejecucion",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
