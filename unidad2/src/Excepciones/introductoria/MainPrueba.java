package Excepciones.introductoria;

import java.io.IOException;
import java.util.InputMismatchException;

public class MainPrueba {
	public static void main(String[] args) {
		try {
			throw new InputMismatchException("InputMismatchException porque quiero.");
		}
		//catch (IOException e) {
			//System.out.println("Ocurre una excepcion:" + e.getMessage());
		//}
		System.out.println("Llego aquí");
	}
	
	
}
