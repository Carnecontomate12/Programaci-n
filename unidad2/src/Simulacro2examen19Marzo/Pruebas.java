package Simulacro2examen19Marzo;

import java.time.LocalDate;
import java.util.Objects;

public class Pruebas {
	private int ID;
	private String lugar;
	private LocalDate fecha;
	private Estado estado;
	
	public Pruebas(String ID, String lugar, LocalDate fecha, Estado estado) {
		super();
		ID = toString();
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = estado;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, estado, fecha, lugar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pruebas other = (Pruebas) obj;
		return ID == other.ID;
	}
	
	
}
