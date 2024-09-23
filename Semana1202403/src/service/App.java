package service;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane
					.showInputDialog("1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Salir"));

			switch (opcion) {
			case 1:
				double numero = 0;
				do {
					numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
					if (numero != 0) {

						for (int i = 1; i <= numero; i++) {
							JOptionPane.showMessageDialog(null, "El resultado de la division es: " + (i / numero));
						}

					}

				} while (numero != 0);
				break;
			case 2:
				String palabra = "";
				boolean seguir = true;
				do {
					String deletreada = "";
					palabra = JOptionPane.showInputDialog("Digite una palabra para deletrar");
					if (!palabra.equalsIgnoreCase("fin")) {
						for (int i = 0; i < palabra.length(); i++) {
							deletreada = deletreada + palabra.charAt(i) + " ";
						}
						JOptionPane.showMessageDialog(null, deletreada);
					}else {
						seguir = false;
					}

				} while (seguir);
				break;

			case 3:
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digame el valor del primer numero"));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digame el valor del segundo numero"));
				double suma = (num1 + num2);
				double resta = (num1 - num2);
				double multiplicacion = (num1 * num2);
				double division = (num1 / num2);
				JOptionPane.showMessageDialog(null, "El valor de la suma es: " + suma);
				JOptionPane.showMessageDialog(null, "El valor de la resta es: " + resta);
				JOptionPane.showMessageDialog(null, "El valor de la multiplicacion es: " + multiplicacion);
				JOptionPane.showMessageDialog(null, "El valor de la division es: " + division);
				JOptionPane.showMessageDialog(null, "El valor de la suma de las operaciones es: " + (suma+resta+multiplicacion+division));

				break;
			case 4:

				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Saliendo del sistema, hasta luego");
				break;
			default:
				break;

			}
		} while (opcion != 5);
	}
}
