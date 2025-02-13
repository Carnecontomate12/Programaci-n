package Herencia;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
	private LocalDate fechaFincontrato;

	public ProfesorInterino(String nombre, String nomDepartamento, LocalDate fechaFincontrato) {
		super(nombre, nomDepartamento);
		this.fechaFincontrato = fechaFincontrato;
	}

	public LocalDate getFechaFincontrato() {
		return fechaFincontrato;
	}

	public void setFechaFincontrato(LocalDate fechaFincontrato) {
		this.fechaFincontrato = fechaFincontrato;
	}
	
	
}
