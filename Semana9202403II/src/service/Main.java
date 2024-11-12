package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import model.Estudiante;

public class Main {

	public static void main(String[] args) {
		
		List<String> listMeses = new ArrayList<String>();
		
		for (int i = 0; i < 2; i++) {
			listMeses.add(JOptionPane.showInputDialog("Digite el mes"+ (i+1) +" del año"));
		}
		
		for (Iterator iterator = listMeses.iterator(); iterator.hasNext();) {
			String mes = (String) iterator.next();
			JOptionPane.showMessageDialog(null, mes);
			
		}
		
		List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		
		Estudiante estudiante;
		
		for (int i = 0; i < 2; i++) {
			estudiante = new Estudiante();
			estudiante.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Indique la edad del estudiante")));
			estudiante.setFechaIngreso(new Date());
			estudiante.setNombre(JOptionPane.showInputDialog("Digite el nombre del estudiante"));
			listaEstudiantes.add(estudiante);
		}
		
		for (Estudiante est : listaEstudiantes) {
			JOptionPane.showMessageDialog(null, est.toString());
		}
		

	}

}
