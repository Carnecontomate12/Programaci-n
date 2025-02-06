package Repaso.java;

import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {
		Cadenas r = new Cadenas ();
		String [] palabra = r.cargaTabla ();
		System.out.println(palabra);
		r.imprimeTabla(palabra);
		String [] numero = r.filtraNumeros(palabra);
		r.filtraNumeros(numero);
		System.out.println("Termino");
	}
	String [] cargaTabla() {
		System.out.println("Introduce una frase: ");
		Scanner input = new Scanner (System.in);
		String frase = input.nextLine();
		String [] tabla = frase.split(" ");
		return tabla;
	}
	void imprimeTabla (String[] tabla) {
		for(String elemento : tabla) {
			System.out.println(elemento);
		}
	}
	String [] filtraNumeros (String[] tabla) {
		String [] numeros = new String [tabla.length];
		for(int i = 0; i<tabla.length;i++) {
			if(isCadenaNumero(tabla[i])) {
				numeros [i] = tabla [i];
			}
		}
		return numeros;
	}
	String [] isMinuscula (String [] tabla) {
		String [] minusculas = new String[tabla.length];
		for(int i = 0; i<tabla.length;i++) {
			if(isMinuscula (tabla[i])) {
				minusculas [i] = tabla[i];
			}
		}
		return minusculas;
	}
	boolean isCadenaNumero(String palabra) {
		boolean es = false;
		for (int i = 0; i< palabra.length();i++ ){
			Character c = palabra.charAt(i);
			es = es && Character.isDigit(c);
		}
		return es;
	}
	boolean isMinuscula (String palabra) {
		boolean isMin = true;
		if(Character.isLowerCase(palabra.charAt(0))) {
			  isMin = false;
		}
		return isMin;
	}
	String [] convierteTabla (String[] palabras) {
		String [] convertidas = new String [palabras.length];
		for(int i = 0; i<palabras.length;i++) {
			convertidas [i] = realizaConversion [i];
		}
		return convertidas;
	}
	String [] realizaConversion (String palabra) {
		String palabraConvertida = "";
		char primercaracter = Character.toUpperCase(palabra.charAt(0));
		palabraConvertida += primercaracter;
		for(int i= 0; i< palabra.length() -1; i++) {
			char actual = palabra.charAt(i);
			if (actual == 'o' || actual == 'O') {
				palabraConvertida += 0;
			} else {
				palabraConvertida += actual;
			}
		}
		if(palabra.length() > 1) {
			palabraConvertida += palabra.length();
			}
		return palabraConvertida;
	}
}
