package Boletin.excepciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
	public static void main(String[] args) {
		Double [] numero = new Double [20];
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			try {
				int ale1 = r.nextInt();
				int ale2 = 0; //r.nextInt();
				
				if (ale2==0) {
					throw new ArithmeticException ("No puedes dividir por cero");
				}
				if (i >= 20) {
					throw new ArrayIndexOutOfBoundsException("Guardando en más de 20");
				}
				numero [i] = (double) (ale1/ale2);
			}
			catch (ArithmeticException e1) {
				System.out.println("Ha salido un 0 de denominador");
				throw e1;
			}
			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
			}
			finally {
				try {
				System.out.println(Arrays.toString(numero));
				}
				catch (NullPointerException e3){
					System.out.println("Posiciones vacías");
				}
			}
		}
	}
}
