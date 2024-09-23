package service;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		System.out.print("Sergio ");
		System.out.print("Campos\n");
		System.out.println("Gerardo ");
		System.out.println("Rodriguez");
		System.out.print(34);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigame un numero");
		int numero = scan.nextInt();
		System.out.println("El numero digitado es: " + numero);
		
		scan.close();
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
		
		JOptionPane.showMessageDialog(null, "El numero digitado es:" + numero2);
		
		
	}

}
