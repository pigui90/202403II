package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiante {
	int edad;
	String nombre;
	Date fechaIngreso;
	public int getEdad() {
		return edad;
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
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Estudiante(int edad, String nombre, Date fechaIngreso) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
	}
	public Estudiante() {
		super();
	}	
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "Nombre: " + getNombre()+ "\nEdad: " + getEdad() + "\nFecha Ingreso: " + sdf.format(getFechaIngreso());
	}
	
}
