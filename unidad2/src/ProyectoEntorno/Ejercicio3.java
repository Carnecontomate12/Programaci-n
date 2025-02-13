package ProyectoEntorno;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random randint = new Random ();
		int opcion;
		String [] opciones = {"Piedra", "Papel", "Tijeras"};
		do {
			System.out.println("Elige una de las opcionesl. 1 Piedra, 2 Papel, 3 Tijeras.");
			opcion = input.nextInt();
			if (opcion == 0) {
				System.out.println("Esta opción no se puede dar");
			}
			int opcionMaquina = input.nextInt(3) +1;
			System.out.println("La máquina ha elegido: "+ opcionMaquina);
			if (opcion == opcionMaquina) {
				System.out.println("Ha sido un empate justo");
			}else if (opcion == 1 && opcionMaquina == 3|| opcion == 2 && opcionMaquina == 1 || opcion == 3 && opcionMaquina == 2) {
				System.out.println("El usuario ha ganado");
			}else {
				System.out.println("La máquina te ha ganado");
			}
		}while (opcion != 0);
		
		}
}
