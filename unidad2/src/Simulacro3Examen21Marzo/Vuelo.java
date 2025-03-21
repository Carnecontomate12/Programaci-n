package Simulacro3Examen21Marzo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	private String id;
	private String aerolínea;
	private String destino;
	private LocalDate fecha_vuelo;
	private double duracion;
	private Estado estado;
	public Vuelo(String id, String aerolínea, String destino, LocalDate fecha_vuelo, double duracion, Estado estado) {
		super();
		this.id = id;
		this.aerolínea = aerolínea;
		this.destino = destino;
		this.fecha_vuelo = fecha_vuelo;
		this.duracion = duracion;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAerolínea() {
		return aerolínea;
	}
	public void setAerolínea(String aerolínea) {
		this.aerolínea = aerolínea;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFecha_vuelo() {
		return fecha_vuelo;
	}
	public void setFecha_vuelo(LocalDate fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aerolínea, destino, duracion, estado, fecha_vuelo, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", aerolínea=" + aerolínea + ", destino=" + destino + ", fecha_vuelo=" + fecha_vuelo
				+ ", duracion=" + duracion + ", estado=" + estado + "]";
	}
	
	
}
