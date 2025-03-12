package Modelo.Biblioteca;

public class Libro extends Recursos{
	private String autor;
	private String editorial;
	private String generoLiterario;
	private int diasprestamos = 21;
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getGeneroLiterario() {
		return generoLiterario;
	}
	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	public int getDiasprestamos() {
		return diasprestamos;
	}
	public void setDiasprestamos(int diasprestamos) {
		this.diasprestamos = diasprestamos;
	}
	
	public Libro(int id, String ubicacion, String autor, String editorial, String generoLiterario, int diasprestamos) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.generoLiterario = generoLiterario;
		this.diasprestamos = diasprestamos;
	}
	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
