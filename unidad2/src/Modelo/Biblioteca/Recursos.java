package Modelo.Biblioteca;

import java.util.Objects;

public abstract class Recursos implements IPrestable{
	private int id;
	private String ubicacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, ubicacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recursos other = (Recursos) obj;
		return id == other.id && Objects.equals(ubicacion, other.ubicacion);
	}
	public Recursos(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}
	

}
