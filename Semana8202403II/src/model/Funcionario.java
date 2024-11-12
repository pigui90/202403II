package model;
/**
 * Clase que tiene metodos que condiciona 2 numeros para preguntar si es mayor menor o igual del test
 * @author Sergio
 * @since 31/10/2024
 * @version 1
 */
public class Funcionario {
	
	/**
	 * Determina si es mayor
	 * @param numero1 el numero el cual se condiciona si es mayor
	 * @param numero2 el numero contra el que se evalua el primer parametro
	 * @return true si numero1 es mayor a numero2
	 * @author Sergio
	 * @since 31/10/2024
	 */
	public boolean esMayor(int numero1, int numero2) {
		return numero1 > numero2;
	}
	
	/**
	 * Determina si es igual
	 * @param numero1 el numero el cual se condiciona si es igual
	 * @param numero2 el numero contra el que se evalua el primer numero
	 * @return true si son iguales false si son diferentes
	 */
	public boolean esIgual(int numero1, int numero2) {
		return numero1 == numero2;
	}
	
	/**
	 * Determina si es menor
	 * @param numero1 el numero el cual se condiciona si es menor
	 * @param numero2 el numero contra el que se evalua el primer numero
	 * @return true si primer numero es menor, de lo contrario devuelve false
	 */
	public boolean esMenor(int numero1, int numero2) {
		return numero1 < numero2;
	}
}
