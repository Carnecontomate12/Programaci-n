package Ejercicio3Boletin1Controladores;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private int ano_publicacion;
	private Estado estado;
	public Libro(String titulo, String autor, String genero, int ano_publicacion, Estado estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano_publicacion = ano_publicacion;
		this.estado = estado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno_publicacion() {
		return ano_publicacion;
	}
	public void setAno_publicacion(int ano_publicacion) {
		this.ano_publicacion = ano_publicacion;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
