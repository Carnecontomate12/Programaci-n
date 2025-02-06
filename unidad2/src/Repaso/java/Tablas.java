package Repaso.java;
import java.util.Scanner;
public class Tablas {
	public static void main(String[] args) {
		Tablas r = new Tablas();
		int [] resultado = r.calculaTabla();
		for (int valor : resultado) {
			System.out.println(valor);
		}
		int [] calculaTabla(){
			int [] tabla = new int [10];
			Scanner input = new Scanner (System.in);
			for(int i = 0; i < tabla.length; i++) {
				System.out.println("Introduce un numero:");
				tabla [i] = input.nextInt();
			}
			return ;
		}
		boolean buscaelemento (int[]tabla, int numero) {
			boolean encontrado = False;
			int i = 0;
			while (!encontrado && i < tabla.length) {
				if (tabla [i] == numero) {
					encontrado = True ;
				}
				i = i +1;
			}
			return encontrado;
		}
					
	}

}
