package Controlador;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {
	public static void main(String[] args) {
		List <String> lista = new ArrayList<String>();
		String [] tabla  = new String [10];
		lista.add("Hola");
		lista.add("saco de escombros");
		lista.add("Adios");
		lista.remove("Adios9");
		lista.remove(1);
		System.out.println(lista.size());
		
		for (String cadena : tabla) {
			System.out.println(cadena);
		}
	}
}
