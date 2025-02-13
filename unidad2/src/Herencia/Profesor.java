package Herencia;

public class Profesor extends Persona{
	protected String nomDepartamento;

	public Profesor(String nombre, String nomDepartamento) {
		super(nombre);
		this.nomDepartamento = nomDepartamento;
	}

	public String getNomDepartamento() {
		return nomDepartamento;
	}

	public void setNomDepartamento(String nomDepartamento) {
		this.nomDepartamento = nomDepartamento;
	}
	
}
