package MiniSimulacion;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anio_exp;
	
	
	public Conductor(String nombre, int anio_exp) {
		super();
		this.nombre = nombre;
		setAnio_exp(anio_exp);
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected int getAnio_exp() {
		return anio_exp;
	}


	protected void setAnio_exp(int anio_exp) {
		if(anio_exp > 0) {
			this.anio_exp = anio_exp;
		}else {
			this.anio_exp = 0;
		}
	}


	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anio_exp=" + anio_exp + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(anio_exp, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return Objects.equals(anio_exp, other.anio_exp) && Objects.equals(nombre, other.nombre);
	}
	
	
}
