package Boletin3orientacion;

public class GestionaEquipos {
	public static void main(String[] args) {
		Persona p1 = new Persona ("Andrea", "Perea", "12345678A",18);
		Persona p2 = new Persona ("Luis", "Perea", "12345678B",22);
		Persona p3 = new Persona ("David", "Perez", "12345678C",23);
		Persona p4 = new Persona ("Sebastian", "Rodriguez", "12345678D", 19);

		Persona [] personas1 = {p1,p2};
		Persona [] personas2 = {p3,p4};
		int [] puntuaciones1 = {7, 14, 22};
		int [] puntuaciones2 = {40, 12, 3};
		
		Equipo equipo1 = new Equipo ("equipo1", puntuaciones1, personas1);
		System.out.println(equipo1);
		Persona [] tablaPersona = equipo1.persona;
		for (int i = 0; i<tablaPersona.length;i++ ) {
			Persona p = tablaPersona [i];
			System.out.println(p.DNI);
		}
		Equipo equipo2 = new Equipo ("equipo2", puntuaciones2, personas2);

	}
}
	