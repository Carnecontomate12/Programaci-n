package Boletin3orientacion;

public class Persona {
	String nombre;
	String Apellido;
	String DNI;
	int edad;
	public Persona(String nombre, String apellido, String dNI, int edad) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", edad=" + edad + "]";
	}
}
