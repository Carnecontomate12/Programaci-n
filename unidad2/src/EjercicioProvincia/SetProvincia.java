package EjercicioProvincia;

import java.util.HashSet;
import java.util.Set;

public class SetProvincia {
	public static void main(String[] args) {
		
			Provincia s = new Provincia ("Sevilla", 1950000);
			Provincia c = new Provincia ("Cádiz", 750000);
			Provincia h = new Provincia ("Huelva", 520000);
			Provincia c1 = new Provincia ("Cádiz", 750000);
			
		Set <Provincia> provincias = new HashSet <>();
		System.out.println(provincias.add(s));
		System.out.println(provincias.add(c));
		System.out.println(provincias.add(h));
		System.out.println(provincias.add(c1));
		
		for(Provincia cadena :provincias) {
			System.out.println(cadena);
		}
	}
}
