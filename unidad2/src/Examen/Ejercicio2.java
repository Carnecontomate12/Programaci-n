package Examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Ejercicio2 r = new Ejercicio2 ();
		String opcion = r.menu(input);
		while (!opcion.equals("F")) {
		    opcion = r.menu(input);
		System.out.println("Seleccione una de estas opciones: ");

		switch (opcion) {
		case "C":
		   r.capturarPokemon(input);
		break;
		case "R":
			r.realizarBatalla(input);
		break;
		case "M":
		//baratoycaro ();
		break;
		case "V":
		//libroMasVendido ();
		break;
		case "F":
		System.out.println("Tu equipo tiene 12 pokemons. Su nivel medio es 18. Han realizado 7 batallas hasta ahora.");
		break;
		default:
		System.out.println("La opcion que has seleccionado no es válida. Intentalo de nuevo.");
		}
	}
}
		String menu(Scanner input){
		System.out.println("C - Capturar Pokemon");
		System.out.println("R - Realizar batalla");
		System.out.println("M - Mostrar Pokedex");
		System.out.println("F - Finalizar");
		String respuestaUsuario = input.next();
		respuestaUsuario = respuestaUsuario.toUpperCase();
		return respuestaUsuario;
	}
		String capturarPokemon (Scanner input) {
			System.out.println("Dime el nombre del Pokemons que has capturado: ");
			String nombre = input.next();
			return nombre;
		}
		int  nivelPokemon (Scanner input) {
			System.out.println("¿Qué nivel tiene tu pokemon?");
			int nivel = input.nextInt();
			return nivel;
		}
		int entrenador (Scanner input) {
			System.out.println("¿Cuantos pokemons tiene el entrenador en sus manos?");
			int pokemon = input.nextInt();
			if (pokemon > 15) {
				System.out.println("El entrenador no puede tener 15 pokemons o mas.");
			}else {
				System.out.println("Sigue con su partida");
		}
			return pokemon;
		}
		int realizarBatalla (Scanner input) {
			System.out.println("Escoge la posicion de uno de tus pokemons: ");
			int posicion = input.nextInt();
			System.out.println("Dime otra posicion para tu contrincante: ");
			int posicion1 = input.nextInt();
			int posiciones = 0;
			if (posicion == posicion1) {
				System.out.println("No pueden estar los dos pokemons en la misma posicion.");
			}else {
				System.out.println("Sigue jugando.");
			}
			return posiciones;
		}
		int calculaResultado (Scanner input) {
			System.out.println("¿Qué nivel tiene tu pokemon?");
			int nivel = input.nextInt();
			int nivelcontrincante = input.nextInt();
			if (nivel == nivelcontrincante) {
				System.out.println("El resultado de vuestra batalla es de empate.");
			} else if (nivel > nivelcontrincante) {
				System.out.println("Has ganado la partida.");
				nivel++;
			}else {
				System.out.println("Has perdido la partida.");
			}
			return nivel;
		}
		int ResultadoBatallas (Scanner input) {

		}
}
