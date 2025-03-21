package Simulacro3Examen21Marzo;

public class Comercial extends Pilotos{

	
	public Comercial(String nombre, String nacionalidad, int edad, int num_licencia, int horas_vuelos,
			Vuelo[] vuelos_asignados) {
		super(nombre, nacionalidad, edad, num_licencia, horas_vuelos, vuelos_asignados);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void operarVuelo() {
		System.out.println("Está operando en un vuelo comercial");
	}
	@Override
	public float getDuracionVuelo() {
		// TODO Auto-generated method stub
		return 2;
	}
}
