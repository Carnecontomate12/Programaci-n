package Ejercicio1Boletin5Orientación;

public class Mago extends Personaje{

	public Mago(String nombre, int nivel, int hp) {
		super(nombre, "hechizo", nivel, hp);
	}
	public boolean esAtacado(Personaje p) {
		return false;
	}
	public boolean esAtacado(Personaje p, int distancia) {
		return false;
	}
}
