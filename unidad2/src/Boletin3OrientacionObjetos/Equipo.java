package Boletin3OrientacionObjetos;

import java.util.Arrays;

import Boletin3Ej3.Persona;

public class Equipo {
	String nombreEquipo;
	int [] puntuaciones;
	Persona [] persona;
	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] persona) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones) + ", persona="
				+ Arrays.toString(persona) + "]";
	}
	
	float calculaMedia() {
		float mediaEdad = 0f;
		Persona [] tablaPersona = this.persona;
		for (Persona p: tablaPersona) {
			System.out.println(p.edad);
			Object edad = edad + p.edad;
		}
		return mediaEdad;
	}
}
