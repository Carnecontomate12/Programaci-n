package Boletin4Ej1;

import java.util.Objects;

public class Automovil extends Vehiculo{
	private String propietario;
	private int numPuertas;
	private int numRuedas;
	private String calificaionEcologica;
	
	public Automovil(String dueño, int numPuertas, int numRuedas, String calificaionEcologica) {
		super();
		this.propietario = dueño;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
		this.calificaionEcologica = calificaionEcologica;
	}
	public String getDueño() {
		return propietario; 
	}
	public void setDueño(String dueño) {
		this.propietario = dueño;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String getCalificaionEcologica() {
		return calificaionEcologica;
	}
	public void setCalificaionEcologica(String calificaionEcologica) {
		this.calificaionEcologica = calificaionEcologica;
	}
	private enum CalificacionEco{
		ECO, O, B, C;
	}
	CalificacionEco eco = CalificacionEco.ECO;

	public CalificacionEco getEco() {
		return eco;
	}
	public void setEco(CalificacionEco eco) {
		if (CalificacionEco == CalificacionEco.ECO) {
			
		}
		this.eco = eco;
	}
	
}
