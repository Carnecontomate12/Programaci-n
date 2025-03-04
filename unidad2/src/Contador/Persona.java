package Contador;

import java.util.Objects;

public class Persona {
	private int contador;
	private int identificador;
	private String nombre;
	private int edad;
	public Persona(int contador, int identificador, String nombre, int edad) {
		super();
		this.identificador = contador + 1;
		this.nombre = nombre;
		this.edad = edad;
		contador = contador +1;
	}
	protected int getContador() {
		return contador;
	}
	protected void setContador(int contador) {
		this.contador = contador;
	}
	protected int getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [contador=" + contador + ", identificador=" + identificador + ", nombre=" + nombre + ", edad="
				+ edad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(contador, edad, identificador, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return contador == other.contador && edad == other.edad && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre);
	}
	boolean validaSiDNIvalido (String Dni) {
		boolean valido = false;
		if(Dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		}else {
			System.out.println("Error, el DNI no es válido");
			valido = false;
		}
		return valido;
	}
}
