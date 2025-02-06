package Ejemplosclase;

import java.util.Scanner;

public class arbolnavidad {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el numero de niveles para el árbol");
		int numero = input.nextInt();
		
		int posicion= 0;
		String hoja = "*";
		String espacio = " ";
		String tronco = "_| |_";
		
		while (numero != posicion) {
			System.out.println(hoja);
			hoja = " *" + espacio;
			espacio = " " + espacio;
			posicion = posicion +1;
		}
		System.out.println(tronco);
		
	}

}
