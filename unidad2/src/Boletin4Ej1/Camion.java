package Boletin4Ej1;

public class Camion extends Vehiculo {
	private String dueño;
	private int numPuertas;
	private int numRuedas;
	private int tonelajeKilos;
	private int numPasajeros;
	private int numEjes;
	
	public Camion(String dueño, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
		super();
		this.dueño = dueño;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
		this.tonelajeKilos = tonelajeKilos;
		this.numPasajeros = numPasajeros;
		this.numEjes = numEjes;
	}
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
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
	public int getTonelajeKilos() {
		return tonelajeKilos;
	}
	public void setTonelajeKilos(int tonelajeKilos) {
		this.tonelajeKilos = tonelajeKilos;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public int getNumEjes() {
		return numEjes;
	}
	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
	
}
