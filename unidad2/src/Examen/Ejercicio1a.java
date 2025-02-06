package Examen;

import java.util.Scanner;

public class Ejercicio1a {
	public static void main(String[] args) {
		// Lo que quiero hacer en esta actividad es que el usuario me introduzca una serie de palabras por teclado, creo una variable que se llame 
		// palabras y creo una nueva lista de cadenas de 10 palabras y posteriormente creo una variable d evocales de tipo string entonces lo que 
		// recibe es un input.next, creo la variable contador en la que lo igualo a 0. Hago un for de posicion para que me recorra la lista elemento 
		// por elemento.
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántos palabras quieres introducir?");
		int total = scanner.nextInt();
		String [] palabras  = new String [total];
		String [] vocales  = new String [total];
		int contador = 0;


		for (int i = 0; i < total; i++) {
		System.out.println("Introduzca una palabra:");
		palabras[i] = scanner.next();
		}

		System.out.print("Hay " + contador + " palabras que contengan 3 vocales seguidas. ");
		for (int i = 0; i < contador; i++) {
		System.out.print(vocales[i]);
		if (i < contador - 1) {
		System.out.print(", ");
		}
		}
	}
}