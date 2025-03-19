package SimulacroExamen19Marzo;

import java.util.Objects;

public abstract class VehículoCombustible extends VehículoGeneral{
	private String matricula;
	private boolean diesel;
	private String modelo;
	private String marca;
	public VehículoCombustible(int id, boolean alquilado, String matricula, boolean diesel, String modelo,
			String marca) {
		super(id, alquilado);
		this.matricula = matricula;
		this.diesel = diesel;
		this.modelo = modelo;
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isDiesel() {
		return diesel;
	}
	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "VehículoCombustible [matricula=" + matricula + ", diesel=" + diesel + ", modelo=" + modelo + ", marca="
				+ marca + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diesel, marca, matricula, modelo);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehículoCombustible other = (VehículoCombustible) obj;
		return diesel == other.diesel && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
	}
	
}
