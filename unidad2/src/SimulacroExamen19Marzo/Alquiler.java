package SimulacroExamen19Marzo;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
	private int id;
	private String datos;
	private int permiso;
	private String DNI_persona;
	private LocalDate fechainicio;
	private LocalDate fecharegistro;
	private int dias;
	private Estado estado;
	public Alquiler(int id, String datos, int permiso, String dNI_persona, LocalDate fechainicio,
			LocalDate fecharegistro, int dias, Estado estado) {
		super();
		this.id = id;
		this.datos = datos;
		this.permiso = permiso;
		DNI_persona = dNI_persona;
		this.fechainicio = fechainicio;
		this.fecharegistro = fecharegistro;
		this.dias = dias;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public int getPermiso() {
		return permiso;
	}
	public void setPermiso(int permiso) {
		this.permiso = permiso;
	}
	public String getDNI_persona() {
		return DNI_persona;
	}
	public void setDNI_persona(String dNI_persona) {
		DNI_persona = dNI_persona;
	}
	public LocalDate getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}
	public LocalDate getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Alquiler [id=" + id + ", datos=" + datos + ", permiso=" + permiso + ", DNI_persona=" + DNI_persona
				+ ", fechainicio=" + fechainicio + ", fecharegistro=" + fecharegistro + ", dias=" + dias + ", estado="
				+ estado + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI_persona, datos, dias, estado, fechainicio, fecharegistro, id, permiso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(DNI_persona, other.DNI_persona) && Objects.equals(datos, other.datos)
				&& dias == other.dias && estado == other.estado && Objects.equals(fechainicio, other.fechainicio)
				&& Objects.equals(fecharegistro, other.fecharegistro) && id == other.id && permiso == other.permiso;
	}
	
	
}
