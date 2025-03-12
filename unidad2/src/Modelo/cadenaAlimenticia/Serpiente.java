package Modelo.cadenaAlimenticia;

public class Serpiente extends Animal{

	public Serpiente(String nombreEspecie, String lugarHabita, TipoFamilia tipofamilia, String[] animalesQueCome,
			String[] animalesComido) {
		super(nombreEspecie, lugarHabita, tipofamilia, animalesQueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean atacar(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean huir(Animal b) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
