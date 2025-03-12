package Modelo.Biblioteca;

public class Pelicula extends Multimedia{
	public Pelicula(int id, String ubicacion, String nombre, String generoLiterario, int diasPrestamos) {
		super(id, ubicacion, nombre, generoLiterario, diasPrestamos);
		// TODO Auto-generated constructor stub
	}

	private int duracionMinutos;

	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	
	
}
