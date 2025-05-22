package SimulacionGuarderia;

import java.util.Objects;

public class Maestro {
	private String nombre;
	private String apellidos;
	private String DNI;
	private String grupoTutor;
	public Maestro(String nombre, String apellidos, String dNI, String grupoTutor) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.grupoTutor = grupoTutor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getGrupoTutor() {
		return grupoTutor;
	}
	public void setGrupoTutor(String grupoTutor) {
		this.grupoTutor = grupoTutor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maestro other = (Maestro) obj;
		return Objects.equals(DNI, other.DNI);
	}
	
	
}
