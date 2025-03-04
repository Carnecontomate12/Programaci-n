package Expresionesregulares;

public class ValidaNumero {
	public static void main(String[] args) {
		String num1 = "12345678a";
		String palabra = "1s0";
		
		System.out.println(num1.matches("\\d{8}"));
		System.out.println(num1.matches("[0-9] {8}"));
	}
}
