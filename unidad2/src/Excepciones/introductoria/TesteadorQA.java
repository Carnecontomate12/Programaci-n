package Excepciones.introductoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        int numero;
	        try {
		        numero = scanner.nextInt(); 
		        String cadena = "";
		        System.out.println(cadena.charAt(10));
		        System.out.println("Detrás del input");
	        }
	        catch (InputMismatchException adrian) {
	        	System.out.println("Dame otro numero entero: ");
	        	numero = scanner.nextInt();
	        }
	        catch (StringIndexOutOfBoundsException e) {
	        	System.out.println("Entro en el catch 2:" +e.getCause());
	        	System.out.println("Entro en el catch 2:" +e.getMessage());
	        }
	        finally {
	        	System.out.println("Pase lo que pase, salgo");
	        }
	        System.out.println("Sigo detrás del finally");
	    }
	}