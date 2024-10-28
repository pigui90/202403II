package service;

import java.util.Date;

import javax.swing.JOptionPane;

import model.Estudiante;
import model.Funcionario;
import model.Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setEdad(34);
		persona.setFechaNacimiento(new Date());
		persona.setIdentificacion(116512155);
		persona.setNombre("Perez");

		JOptionPane.showMessageDialog(null, persona.mostrarInfo());

		Funcionario funcionario = new Funcionario();
		funcionario.setEdad(32);
		funcionario.setFechaNacimiento(new Date());
		funcionario.setGradoAcademico("Licenciatura");
		funcionario.setIdentificacion(58558845);
		funcionario.setLugarTrabajo("Aqui");
		funcionario.setNombre("Juanito");

		JOptionPane.showMessageDialog(null, funcionario.mostrarInfo());

		Estudiante estudiante = new Estudiante();
		estudiante.setCarnet(2505);
		estudiante.setCarrera("Informatica");
		estudiante.setEdad(25);
		estudiante.setFechaNacimiento(new Date());
		estudiante.setIdentificacion(2599888);
		estudiante.setNombre("Perez");
		
		estudiante.setUniversidad("ULATINA");

		JOptionPane.showMessageDialog(null, estudiante.mostrarInfo());

		String lugarTrabajo = "Alla";
		String gradoAcademico = "Bachiller";
		Funcionario fun2 = new Funcionario(persona.getEdad(), persona.getNombre(), persona.getFechaNacimiento(),
				persona.getIdentificacion(), lugarTrabajo, gradoAcademico);

		JOptionPane.showMessageDialog(null, fun2.mostrarInfo());

		String carrera = "Medicina";
		int carnet = 010101;
		String universidad = "otra";

		Estudiante estudiante2 = new Estudiante(persona.getEdad(), persona.getNombre(), persona.getFechaNacimiento(),
				persona.getIdentificacion(), carrera, carnet, universidad);
		JOptionPane.showMessageDialog(null, estudiante2.mostrarInfo());

		JOptionPane.showMessageDialog(null, estudiante.toString());
		JOptionPane.showMessageDialog(null, estudiante2.toString());

		if (estudiante.equals(estudiante2)) {
			JOptionPane.showMessageDialog(null, "SON IGUALES");
		} else {
			JOptionPane.showMessageDialog(null, "SON DIFERENTES");
		}

	}

}
