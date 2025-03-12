package Modelo.Biblioteca;

public abstract class Multimedia extends Recursos{
	private String nombre;
	private String generoLiterario;
	private int diasPrestamos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGeneroLiterario() {
		return generoLiterario;
	}
	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	public int getDiasPrestamos() {
		return diasPrestamos;
	}
	public void setDiasPrestamos(int diasPrestamos) {
		this.diasPrestamos = diasPrestamos;
	}
	public Multimedia(int id, String ubicacion, String nombre, String generoLiterario) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.generoLiterario = generoLiterario;
		this.diasPrestamos = 10;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return diasPrestamos;
	}

	
}
