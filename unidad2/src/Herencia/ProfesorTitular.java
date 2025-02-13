package Herencia;

import java.time.LocalDate;

public class ProfesorTitular extends  Profesor{
	private LocalDate fechaAdjudicación;

	public ProfesorTitular(String nombre, String nomDepartamento, LocalDate fechaAdjudicación) {
		super(nombre, nomDepartamento);
		this.fechaAdjudicación = fechaAdjudicación;
	}

	public LocalDate getFechaAdjudicación() {
		return fechaAdjudicación;
	}

	public void setFechaAdjudicación(LocalDate fechaAdjudicación) {
		this.fechaAdjudicación = fechaAdjudicación;
	}
	
	
}
