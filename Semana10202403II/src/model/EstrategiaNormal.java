package model;

import javax.swing.JOptionPane;

public class EstrategiaNormal implements Estrategia {
	
	@Override
	public void calculaImpuestos() {
		JOptionPane.showMessageDialog(null, "Normal\nSe va a calcular un 20%");
	}
	
	

}
