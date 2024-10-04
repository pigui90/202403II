package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

		Date fechaHoy = new Date();

		String fechaStr = sdf.format(fechaHoy);
		String fechaStr2 = sdf2.format(fechaHoy);

		JOptionPane.showMessageDialog(null, fechaStr2);
		JOptionPane.showMessageDialog(null, fechaHoy);
		JOptionPane.showMessageDialog(null, fechaStr);
		
		Date fechaDate = sdf.parse(fechaStr);
		Date fechaDate2 = sdf2.parse("1990-06-13");


		LocalDate localDate = LocalDate.now();
		Date fechaNueva = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Date hoy = new Date();
		LocalDate hoyLD = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		JOptionPane.showMessageDialog(null, hoyLD);
		hoyLD = hoyLD.minusWeeks(4);
		JOptionPane.showMessageDialog(null, hoyLD);

		BigDecimal salario = new BigDecimal(100);
		BigDecimal renta = new BigDecimal(0.5);
		BigDecimal salarioNeto = BigDecimal.ZERO;

		JOptionPane.showMessageDialog(null, salarioNeto);
		JOptionPane.showMessageDialog(null, salario);
		JOptionPane.showMessageDialog(null, renta);
		salarioNeto = salario.divide(renta, MathContext.DECIMAL64);
		JOptionPane.showMessageDialog(null, salarioNeto);

		String menu = "**************************\nBienvenido al menu del Profesor\n1. Ejercio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Salir\n**************************";

		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		JOptionPane.showMessageDialog(null, opcion);

		switch (opcion) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Saliendo del sistema del profesor" , "Salida", JOptionPane.WARNING_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valor incorrecto, no existe en el menú" , "Advertencia", JOptionPane.WARNING_MESSAGE);
			break;
		}
		}catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al convertir en fecha revise el formato" , "Error de Parse Exception", JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Error al convertir en numero revise lo digitado no pueden ser letras ni simbolos ni vacios" , "Error de Number Format Exception", JOptionPane.ERROR_MESSAGE);
		}

	}

}
