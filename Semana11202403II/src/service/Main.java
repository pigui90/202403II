package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String nombreFile = JOptionPane.showInputDialog("Indique el nombre del archivo con su extension .txt");
		File archivo = new File(nombreFile);
		
		// Si no existe crea el archivo nuevo si no
		if(!archivo.exists()) {
			archivo.createNewFile();
		}
		
		// Leer Archivo
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		String lineaArchivo = br.readLine();
		String cadena = "";
		while(lineaArchivo!=null) {
			i = 0;
			do {
				// Usar un delimitador para separar textos en una misma linea del archivo
				while(i < lineaArchivo.length() && lineaArchivo.charAt(i) != '|') {
					cadena = cadena + lineaArchivo.charAt(i);
					System.out.println(cadena);
					i++;
				}
				i++;
				JOptionPane.showMessageDialog(null, cadena);
				cadena="";
			}while(i < lineaArchivo.length());
			// Se lee la siguiente linea del archivo
			lineaArchivo = br.readLine();
		}
		
		// Escribir el archivo
		FileWriter fw = new FileWriter(archivo, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String dato = JOptionPane.showInputDialog("Indique un valor para agregar en el archivo");
		bw.write(dato);
		bw.newLine();
		bw.close();
		
		
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error con el archivo", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

}
