package model;

public class Contexto {
	
	private Estrategia estrategia;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void calcularImpuestos() {
		this.estrategia.calculaImpuestos();
	}
}
