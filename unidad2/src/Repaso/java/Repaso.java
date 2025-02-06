package Repaso.java;
import java.util.Scanner;

public class Repaso {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¿Cuantos numeros desea condiderar?:");
		Repaso r = new Repaso ();
		int num = input.nextInt();
		System.out.println(r.numeroporteclado(num));
	}
		int numeroporteclado (int x) {
			int resultado = 0;
			for (int i = 1; i < x; i++) {
				Scanner scanner = new Scanner (System.in);
				System.out.println("Dame un numero:");
				int num1 = scanner.nextInt();
				if (num1 % 2 == 0) {
					resultado = resultado + x;
					
				}
			}
			return resultado;
		}
	}
