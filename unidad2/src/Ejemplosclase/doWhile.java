package Ejemplosclase;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion;
		do {
			System.out.println("1.Asignar Surtidor");
			System.out.println("2.Consultar estado");
			System.out.println("3.Asignar precio");
			System.out.println("4.Recargar surtidor");
			System.out.println("5.Cerrar");
			
			System.out.println("Elige una opcion:");
			opcion= input.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Seleccione el surtidor");
				break;
			case 2:
				System.out.println("Consulte sobre el estado del surtidor");
				break;
			case 3:
				System.out.println("Asignar el precio del producto");
				break;
			case 4:
				System.out.println("Recarga el surtidor");
				break;
			case 5:
				System.out.println("Cerrando");
			default:
				System.out.println("Inténtalo de nuevo.");
			}
		}
		while (opcion != 5);	
	}
	
}
