package Orientacionobjetos;

public class Pokemon {
	String nombre;
	int nivel;
	String tipo;
	String convierteCadena(){
		String cadena ="Pokemon 1: "+nombre + nivel + tipo;
		return cadena;
	}
	boolean fight (Pokemon p2) {
		boolean ganar = true;
		if(nivel > p2.nivel) {
			ganar = true;
			nivel = nivel +1;
		} else {
			ganar = false;
			p2.nivel = p2.nivel +1;
		}
		return ganar;
	}
}

