package Simulacro1Orientación;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
	private int ID;
	private String nombre;
	private String descripcion;
	private Estado estado;
	private LocalDate fecharegistro;
	private LocalDate fechacierra;
	private Criticidad criticidad;
	private Equipo equipo;
	public Incidente(int iD, String nombre, String descripcion, Estado estado, LocalDate fecharegistro, LocalDate fechacierra,
			Criticidad criticidad, Equipo equipo) {
		super();
		this.ID = iD;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fecharegistro = fecharegistro;
		this.fechacierra = fechacierra;
		this.criticidad = criticidad;
		this.equipo = equipo;
	}
	protected int getID() {
		return ID;
	}
	protected void setID(int iD) {
		this.ID = iD;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDescripcion() {
		return descripcion;
	}
	protected void setDescripcion(String mac) {
		this.descripcion = mac;
	}
	protected Estado getEstado() {
		return estado;
	}
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	protected LocalDate getFecharegistro() {
		return fecharegistro;
	}
	protected void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	protected LocalDate getFechacierra() {
		return fechacierra;
	}
	protected void setFechacierra(LocalDate fechacierra) {
		this.fechacierra = fechacierra;
	}
	protected Criticidad getCriticidad() {
		return criticidad;
	}
	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}
	protected Equipo getEquipo() {
		return equipo;
	}
	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return nombre + " - "+ estado + " : " + criticidad + " - " + fecharegistro + " - " + equipo.getNombre();
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, criticidad, equipo, estado, fechacierra, fecharegistro, descripcion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return ID == other.ID && criticidad == other.criticidad && Objects.equals(equipo, other.equipo)
				&& estado == other.estado && Objects.equals(fechacierra, other.fechacierra)
				&& Objects.equals(fecharegistro, other.fecharegistro) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(nombre, other.nombre);
	}
	protected boolean comprobarCierre () {
		if (estado != estado.CERRADA) {
			System.out.println(fechacierra.equals(null));
			return false;
		}
		return true;

	}
}
