package Simulacro2examen19Marzo;

public class Nadador extends Deportista{

	public Nadador(String nombre, String pais, float peso, float altura, Pruebas[] prueba) {
		super(nombre, pais, peso, altura, prueba);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void competir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getTiempoCalentamiento() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	protected double getCaloriasNecesariasDias() {
		// TODO Auto-generated method stub
		return 100*peso;
	}

	@Override
	protected double getHorasEntrenamiento() {
		// TODO Auto-generated method stub
		return 2*24;
	}
	
}
