package Simulacro3Examen21Marzo;

import java.util.Arrays;
import java.util.Objects;

public class Pilotos implements IVuelo{
	private String nombre;
	private String nacionalidad;
	private int edad;
	private int num_licencia;
	private int horas_vuelos;
	private Vuelo [] vuelos_asignados = new Vuelo [30];
	
	
	public Pilotos(String nombre, String nacionalidad, int edad, int num_licencia, int horas_vuelos,
			Vuelo[] vuelos_asignados) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.num_licencia = num_licencia;
		this.horas_vuelos = horas_vuelos;
		this.vuelos_asignados = new Vuelo [30];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNum_licencia() {
		return num_licencia;
	}

	public void setNum_licencia(int num_licencia) {
		this.num_licencia = num_licencia;
	}

	

	public int getHoras_vuelos() {
		return horas_vuelos;
	}

	public void setHoras_vuelos(int horas_vuelos) {
		this.horas_vuelos = horas_vuelos;
	}

	public Vuelo[] getVuelos_asignados() {
		return vuelos_asignados;
	}

	public void setVuelos_asignados(Vuelo[] vuelos_asignados) {
		this.vuelos_asignados = vuelos_asignados;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilotos other = (Pilotos) obj;
		return num_licencia == other.num_licencia;
	}
	
	@Override
	public String toString() {
		return "Pilotos [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", num_licencia="
				+ num_licencia + ", horas_vuelos=" + horas_vuelos + ", vuelos_asignados="
				+ Arrays.toString(vuelos_asignados) + "]";
	}

	@Override
	public void operarVuelo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float getDuracionVuelo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
