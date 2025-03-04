package Modelo.mascota;

import java.time.LocalDate;

public class Perro extends Mascotas{
	String raza;
	Boolean pulgas;


	@Override
	public String muestra() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}


	@Override
	public boolean hablar() {
		return false;
	}

}
