package model;

import javax.swing.JOptionPane;

public class EstrategiaAvanzada implements Estrategia{
	
	@Override
	public void calculaImpuestos() {
		
		JOptionPane.showMessageDialog(null, "Avanzada\nSe va a calcular un 15%");
		JOptionPane.showMessageDialog(null, "Se va a sumar un 3% por cada hijo");
		JOptionPane.showMessageDialog(null, "Se va a rebajar un 5% por cada casa");

	}
}
