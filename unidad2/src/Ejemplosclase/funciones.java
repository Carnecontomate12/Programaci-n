package Ejemplosclase;

import java.util.Scanner;

public class funciones {
	public static void main(String[] args) {
		funciones f = new funciones();
		int resultado = f.sumanum(4, 7);
		System.out.println(resultado);
		funciones f1 = new funciones();
		String[] tablanom = f1.generalista();
		for (int i= 0; i < tablanom.length; i++)
		System.out.println(tablanom [i]);
	}

	int sumanum(int num1, int num2) {
		return num1 + num2;
	}

	String[] generalista() { 
		String[] nombres = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Dime un nombre: ");
		for (int i = 0; i < 5; i++) {
			String nombre = input.nextLine();
			nombres[i] = nombre;
		}
		input.close();
		return nombres;
	}
}
