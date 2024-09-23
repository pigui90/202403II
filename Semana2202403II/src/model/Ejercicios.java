package model;

import java.text.ParseException;

import javax.swing.JOptionPane;

/**
 * Clase con los ejercicios de la presentacion de la semana 2
 * 
 * @author Sergio
 * @since 19/09/2024
 */
public class Ejercicios {

	/**
	 * Metodo main para ejecutar el menu de los ejercicios de la semana 2
	 * 
	 * @param args
	 * @author Sergio
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		// String con el menu del sistema
		String menu = "Menu\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Salir";
		do {
			try {
				// Pido la opcion al usuario
				int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (opcion) {
				case 1:
					// En caso de escoger el 1 llamamos al siguiente metodo
					ejercicio1();
					break;
				case 2:
					double rand = (Math.random()) * 50;
					int numeroAdivinar = (int) rand;
					System.out.println(numeroAdivinar);
					ejercicio2(numeroAdivinar);

					break;
				case 3:
					try {
						int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
						int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
						ejercicio3(num1, num2);
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Lo digitado no es un numero", "Error",
								JOptionPane.ERROR_MESSAGE);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal, dio error", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 4:
					try {
						int cantidadCalificaciones = Integer.parseInt(
								JOptionPane.showInputDialog("Indique la cantidad de calificaciones (vector)"));
						int cantidadAIngresar = Integer
								.parseInt(JOptionPane.showInputDialog("Indique la cantidad a ingresar"));
						ejercicio4(cantidadCalificaciones, cantidadAIngresar);
					} catch (NumberFormatException e) {
						// TODO: handle exception
					}
					break;
				case 5:
					// En caso de ser 5 salimos del sistema con un mensaje de advertencia
					JOptionPane.showMessageDialog(null, "Saliendo del sistema", "Salir", JOptionPane.WARNING_MESSAGE);
					flag = false;
					break;
				default:
					// En caso de no existir la opcion escogida mostramos un mensaje de advertencia
					JOptionPane.showMessageDialog(null, "La opcion no existe en el menu", "Opcion Invalida",
							JOptionPane.WARNING_MESSAGE);
					break;
				}
				// Capturamos la excepcion por si algo falla en la ejecucion
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (flag);
	}

	/**
	 * Este es el ejercicio 1 de la presentacion de la semana 2
	 * 
	 * @author Sergio
	 */
	public static void ejercicio1() {
		try {
			int numero;
			// do-while para validar que el numero sea mayor a 0
			do {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				// En caso de que numero sea menor o igual a 0 muestro un mensaje de error al
				// usuario
				if (numero <= 0) {
					JOptionPane.showMessageDialog(null, "El numero debe ser mayor a 0", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (numero <= 0);
			// Si el residuo de la division del numero entre 2 es igual a 0 el numero es par
			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero es par", "Numero Par", JOptionPane.INFORMATION_MESSAGE);
			} else {
				// Si no por defecto el numero seria impar
				JOptionPane.showMessageDialog(null, "El numero es impar", "Numero Impar",
						JOptionPane.INFORMATION_MESSAGE);
			}
			// Capturamos la excepcion por si algo falla en la ejecucion
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al digitar un valor", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Metodo para adivinar un numero random
	 * 
	 * @param random Numero random a adivinar
	 */
	private static void ejercicio2(int random) {

		int numeroUsuario = 0;
		do {
			try {
				numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero entre 1 y 50"));
				if (numeroUsuario != random) {
					JOptionPane.showMessageDialog(null, "No adivino el numero, vuelva a intentarlo", "Falló",
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Error al parsear el valor", "Error al convertir",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (random != numeroUsuario);

		JOptionPane.showMessageDialog(null, "Felicidades adivino el numero");
	}

	/**
	 * 
	 * @param numero1
	 * @param numero2
	 */
	public static void ejercicio3(int numero1, int numero2) {
		try {

			int resultado = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado);
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "Error causa : " + ae.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Algo salio mal, dio error", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 
	 * @param sizeVector
	 * @param cantidadIngresar
	 */
	public static void ejercicio4(int sizeVector, int cantidadIngresar) {
		int calificaciones[] = new int[sizeVector];
		try {
			int valor = 0;
			for (int i = 0; i < cantidadIngresar; i++) {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
				calificaciones[i] = valor;
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			JOptionPane.showMessageDialog(null, "Indice del vector no permitido", "Error", JOptionPane.ERROR_MESSAGE);
		}
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] != 0) {
				JOptionPane.showMessageDialog(null, calificaciones[i]);
			}
		}
	}

}
