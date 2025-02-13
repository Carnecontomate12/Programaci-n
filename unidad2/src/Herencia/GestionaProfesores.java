package Herencia;

import java.time.LocalDate;

public class GestionaProfesores {
	public static void main(String[] args) {
		ProfesorInterino interino1 = new ProfesorInterino('Pepe', 'Inglés', LocalDate.now().plusMonths(6));
		ProfesorInterino interino2 = new ProfesorInterino('Pepa', 'Historia', LocalDate.now().plusMonths(4));
		
		System.out.println(interino1.getFechaFincontrato());
		ProfesorInterino p3 = (ProfesorInterino)p2;
		System.out.println(interino2.getFechaFincontrato());
		
		ProfesorTitular titular1 = new ProfesorTitular ('Antonio', 'Filosofía', LocalDate.now().minusYears(1));
		System.out.println(titular1.getFechaAdjudicación());
		ProfesorTitular titular2 = new ProfesorTitular ('Antonia', 'Lengua', LocalDate.now().minusYears(1));
		ProfesorTitular p4= (ProfesorTitular) titular2;
		System.out.println(p4.getFechaAdjudicación());
		


	}
}
