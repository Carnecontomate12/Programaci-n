package SimulacionesMapas;

import java.time.LocalDate;
import java.util.Objects;

public class Rematriculacion {
	private String vin;
	private String matriculaInicial;
	private LocalDate fechaMatriculacion;
	private String matriculaFinal;
	public Rematriculacion(String vin, String matriculaInicial, LocalDate fechaMatriculacion, String matriculaFinal) {
		super();
		this.vin = vin;
		this.matriculaInicial = matriculaInicial;
		this.fechaMatriculacion = fechaMatriculacion;
		this.matriculaFinal = matriculaFinal;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMatriculaInicial() {
		return matriculaInicial;
	}
	public void setMatriculaInicial(String matriculaInicial) {
		this.matriculaInicial = matriculaInicial;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	public String getMatriculaFinal() {
		return matriculaFinal;
	}
	public void setMatriculaFinal(String matriculaFinal) {
		this.matriculaFinal = matriculaFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fechaMatriculacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rematriculacion other = (Rematriculacion) obj;
		return Objects.equals(fechaMatriculacion, other.fechaMatriculacion);
	}
	@Override
	public String toString() {
		return "Rematriculacion [vin=" + vin + ", matriculaInicial=" + matriculaInicial + ", fechaMatriculacion="
				+ fechaMatriculacion + ", matriculaFinal=" + matriculaFinal + "]";
	} 
	
	
}
