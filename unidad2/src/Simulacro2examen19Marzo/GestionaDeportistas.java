package Simulacro2examen19Marzo;

import java.time.LocalDate;

public class GestionaDeportistas {

	public static void main(String[] args) {
		Deportista c = new Corredor ("Juanki", "Rumano", 69, 23541);
		Pruebas p = new Pruebas ("1", "Sevilla", LocalDate.now().plusDays(1), Estado.PLANIFICADA);
		Pruebas p1= new Pruebas ("2", "Villaverde", LocalDate.now().plusDays(10),Estado.PLANIFICADA);
		Pruebas[0] = p;
		Pruebas[0] = p1;
		c.setListapruebas(pruebas);
		System.out.println(c.getPruebaMasCercana());
	}
}
