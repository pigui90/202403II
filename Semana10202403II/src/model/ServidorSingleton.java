package model;

public class ServidorSingleton {
	// Atributos de la clase singleton
	private static ServidorSingleton servidorSingleton;
	private static String ip;
	private static String conexion;
	
	// Constructor privado de la clase ServidorSingleton
	private ServidorSingleton() {
		super();
	}
	
	public static ServidorSingleton getServidorSingleton() {
		if(ServidorSingleton.servidorSingleton == null) {
			servidorSingleton = new ServidorSingleton();
			ip = "127.0.0.9";
			conexion = "127.0.0.9/databases";
		}
		return ServidorSingleton.servidorSingleton;
	}
	
	public static String getIp() {
		return ip;
	}
	
	public static String getConexion() {
		return conexion;
	}
}
