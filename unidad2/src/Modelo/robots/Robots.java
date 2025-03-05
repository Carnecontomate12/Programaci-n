package Modelo.robots;

import java.util.Objects;

public abstract class Robots {
	private int id;
	private int contador;
	private String modelo;
	private int bateria;
	private Estado estado;
	private int combustible;
	private String descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bateria, combustible, contador, descripcion, estado, id, modelo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robots other = (Robots) obj;
		return bateria == other.bateria && combustible == other.combustible && contador == other.contador
				&& Objects.equals(descripcion, other.descripcion) && estado == other.estado && id == other.id
				&& Objects.equals(modelo, other.modelo);
	}
	@Override
	public String toString() {
		return "Robots [id=" + id + ", contador=" + contador + ", modelo=" + modelo + ", bateria=" + bateria
				+ ", estado=" + estado + ", combustible=" + combustible + ", descripcion=" + descripcion + "]";
	}
	
	public abstract String ejecutar();
	public abstract String recargar();

}
