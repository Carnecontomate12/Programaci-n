package ProyectoEntorno;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] numeros = new int [10];
		
		System.out.println("Introduce 10 números: ");
		for (int i = 0; i < 10; i++) {
			numeros [i]= input.nextInt();
		}
		System.out.println("El orden inverso de estos numeros introducidos anteriormente son: ");
		for (int i = 9; i>= 0; i--) {
			System.out.println(numeros[i]+ " ");
		}
	}
}
