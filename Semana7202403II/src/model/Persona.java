package model;

import java.util.Date;

public class Persona {
	int edad;
	String nombre;
	Date fechaNacimiento;
	int identificacion;
	
	public Persona() {
		super();
	}
	
	public Persona(int edad, String nombre, Date fechaNacimiento, int identificacion) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.identificacion = identificacion;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String mostrarInfo() {
		return "El nombre es: " + nombre + "\nLa edad es: " + edad;
	}
}
