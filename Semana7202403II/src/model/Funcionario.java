package model;

import java.util.Date;

public class Funcionario extends Persona{
	
	String lugarTrabajo;
	String gradoAcademico;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int edad, String nombre, Date fechaNacimiento, int identificacion, String lugarTrabajo, String gradoAcademico) {
		super(edad, nombre, fechaNacimiento, identificacion);
		this.lugarTrabajo = lugarTrabajo;
		this.gradoAcademico = gradoAcademico;
	}
	
	public String getLugarTrabajo() {
		return this.lugarTrabajo;
	}
	
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	
	public String getGradoAcademico() {
		return this.gradoAcademico;
	}
	
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	
	@Override
	public String mostrarInfo() {
		return  "Soy Funcionario: \n" + super.mostrarInfo() + "\nMi lugar de trabajo es: " + lugarTrabajo;
	}
	

}
