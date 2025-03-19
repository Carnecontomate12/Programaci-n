package Boletin.excepciones;

public class MiExcepcion extends Exception{
	/**
	 * 
	 */
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "MiExcepcion []";
	}
	
}
