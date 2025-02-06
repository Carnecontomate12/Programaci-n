package Ejemplosclase;

import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
			
		System.out.println("Introduce tu edad:");
		int edad = input.nextInt();
		
		double descuento = 0.0;
		
		if (edad > 60) {
			descuento = 0.3;
			System.out.println("Puedes obtener descuento");
		}
		else {
			descuento = 0.1;
			System.out.println("Puedes obtener descuento");
		}
		System.out.println("Indica el precio del producto:");
		double precio= input.nextInt();
		
		double p_descuento = precio - precio*descuento;
		
		System.out.println("El precio final tras es el descuento es: "+ p_descuento);

	}
}
