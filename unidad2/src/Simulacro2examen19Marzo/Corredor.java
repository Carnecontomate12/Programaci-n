package Simulacro2examen19Marzo;

public class Corredor extends Deportista{

	public Corredor(String nombre, String pais, float peso, float altura) {
		super(nombre, pais, peso, altura, 0);
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
		return 0.5;
	}

	@Override
	protected double getCaloriasNecesariasDias() {
		// TODO Auto-generated method stub
		return 50*peso;
	}

	@Override
	protected double getHorasEntrenamiento() {
		// TODO Auto-generated method stub
		return 10*24;
	}
}
