package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicios {

	public static void main(String[] args) {
		try {
		String menu = "**************************\nBienvenido al menu del Profesor\n1. Ejercio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Salir\n**************************";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1:
			
			if(sonAmigos(Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")), Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero")))) {
				JOptionPane.showMessageDialog(null, "Son amigos", "Si son", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "No son amigos", "No son", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			break;
		case 2:
			
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Indique el dia"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Indique el mes"));;
			int year = Integer.parseInt(JOptionPane.showInputDialog("Indique el año"));;
			
			String fechaStr = dia + "/" + mes + "/" + year;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaDigitada = dateFormat.parse(fechaStr);
			Date hoy = new Date();
			hoy = dateFormat.parse(dateFormat.format(hoy));
			if(fechaDigitada.after(hoy)) {
				JOptionPane.showMessageDialog(null, "La fecha digitada es despues de hoy", "After", JOptionPane.INFORMATION_MESSAGE);
			}else {
				if(fechaDigitada.equals(hoy)) {
					JOptionPane.showMessageDialog(null, "La fecha digitada es igual a hoy", "Equals", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "La fecha digitada esta antes de hoy", "Before", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Salir", "Salir", JOptionPane.WARNING_MESSAGE);

			break;
		default:
			break;
		}
		
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Error al digitar un numero", "Error", JOptionPane.ERROR_MESSAGE);
		}catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al digitar el formato de la fecha", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static boolean sonAmigos(int numero1, int numero2) {
		int sumaDivisoresA = 0;
		int sumaDivisoresB = 0;
		
		for(int i = 1; i<numero1; i++) {
			if(numero1 % i == 0) {
				sumaDivisoresA = sumaDivisoresA + i;
			}
		}
		
		for(int i = 1; i<numero2; i++) {
			if(numero2 % i == 0) {
				sumaDivisoresB = sumaDivisoresB + i;
			}
		}
		
		if(numero1 == sumaDivisoresB && numero2 == sumaDivisoresA) {
			return true;
		}else {
		
		return false;
		
		}
	}

}
