package service;

import javax.swing.JOptionPane;

import model.Contexto;
import model.EstrategiaAvanzada;
import model.EstrategiaNormal;
import model.ServidorSingleton;

public class Main {

	public static void main(String[] args) {
		// Patron Singleton
		ServidorSingleton ss1 = ServidorSingleton.getServidorSingleton();
		
		JOptionPane.showMessageDialog(null, "La ip del server SS1 es: " + ss1.getIp() + "\ny la conexion es: " + ss1.getConexion());
		
		ServidorSingleton ss2 = ServidorSingleton.getServidorSingleton();
		
		JOptionPane.showMessageDialog(null, "La ip del server SS2 es: " + ss2.getIp() + "\ny la conexion es: " + ss2.getConexion());
		
		// Patron Estrategia
		Contexto contexto1 = new Contexto(new EstrategiaNormal());
		
		contexto1.calcularImpuestos();
		
		EstrategiaAvanzada estrategiaAvanzada = new EstrategiaAvanzada();
		
		Contexto contexto2 = new Contexto(estrategiaAvanzada);
		
		contexto2.calcularImpuestos();
		
		contexto1 = new Contexto(estrategiaAvanzada);
		
		contexto1.calcularImpuestos();

	}

}
