package model;

import java.util.Date;

public class Estudiante extends Persona {
	String carrera;
	int carnet;
	String universidad;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(int edad, String nombre, Date fechaNacimiento, int identificacion, String carrera, int carnet, String universidad) {
		super(edad, nombre, fechaNacimiento, identificacion);
		this.carrera = carrera;
		this.carnet = carnet;
		this.universidad = universidad;
	}
	
	public String getCarrera() {
		return this.carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getCarnet() {
		return this.carnet;
	}
	
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	public String getUniversidad() {
		return this.universidad;
	}
	
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		return super.mostrarInfo() + "\nMi carnet: " + carnet + "\nCarrera: " + carrera;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+ getNombre()+ "\nCarnet: " + carnet + "\nCarrera: " + carrera + "\nUniversidad: " + universidad;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Estudiante est = (Estudiante)obj;
		return this.getNombre().equals(est.getNombre()) && this.getCarnet() == est.getCarnet();
	}
}
