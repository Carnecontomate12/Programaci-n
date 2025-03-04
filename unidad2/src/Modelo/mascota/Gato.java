package Modelo.mascota;

import java.time.LocalDate;

public class Gato extends Mascotas{
	String color;
	boolean peloLargo; 

	@Override
	public String muestra() {
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}

	@Override
	public boolean hablar() {
		return false;
	}
	
}
