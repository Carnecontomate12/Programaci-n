package Orientacionobjetos;

public class Alumno {
String nombre;
String dni;
float nota;

String pasoCadena () {
	String cadena = "Nombre: "+nombre+ " "+dni+ " "+nota;
	return cadena;
	}
boolean estaAprobado () {
	boolean aprobado = true;
	if(nota>=5) {
		aprobado = true;
	}else {
		aprobado = false;
	}
	return aprobado;
	}
}
