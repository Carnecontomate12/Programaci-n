package Simulacro3Examen21Marzo;

public class Internacional extends Pilotos{

	
	public Internacional(String nombre, String nacionalidad, int edad, int num_licencia, int horas_vuelos,
			Vuelo[] vuelos_asignados) {
		super(nombre, nacionalidad, edad, num_licencia, horas_vuelos, vuelos_asignados);
	}
	@Override
	public void operarVuelo() {
		System.out.println("Está operando en un vuelo internacional.");
	}
	@Override
	public float getDuracionVuelo() {
		// TODO Auto-generated method stub
		return 3;
	}

}
