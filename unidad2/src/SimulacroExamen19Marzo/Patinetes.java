package SimulacroExamen19Marzo;

import java.util.Objects;

public class Patinetes extends VehículoGeneral{
	private int tiempo_autonomia;
	private String marca;
	private String modelo;
	private int fianza;
	private boolean abonada;
	public Patinetes(int tiempo_autonomia, String marca, String modelo, int fianza, boolean abonada) {
		super(fianza, abonada);
		this.tiempo_autonomia = tiempo_autonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.fianza = fianza;
		this.abonada = abonada;
	}
	public int getTiempo_autonomia() {
		return tiempo_autonomia;
	}
	public void setTiempo_autonomia(int tiempo_autonomia) {
		this.tiempo_autonomia = tiempo_autonomia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFianza() {
		return fianza;
	}
	public void setFianza(int fianza) {
		this.fianza = fianza;
	}
	public boolean isAbonada() {
		return abonada;
	}
	public void setAbonada(boolean abonada) {
		this.abonada = abonada;
	}
	@Override
	public String toString() {
		return "Patinetes [tiempo_autonomia=" + tiempo_autonomia + ", marca=" + marca + ", modelo=" + modelo
				+ ", fianza=" + fianza + ", abonada=" + abonada + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(abonada, fianza, marca, modelo, tiempo_autonomia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patinetes other = (Patinetes) obj;
		return abonada == other.abonada && fianza == other.fianza && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && tiempo_autonomia == other.tiempo_autonomia;
	}
	
	
}
