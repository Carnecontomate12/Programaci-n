package Simulacro1Orientación;

import java.util.Objects;

public class Equipo {
	private String nombre;
	private String mac;
	private String SO;
	private int numincidentes;
	public Equipo(String nombre, String mac, String sO, int numincidentes) {
		super();
		this.nombre = nombre;
		this.mac = mac;
		this.SO = sO;
		this.numincidentes = numincidentes;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getMac() {
		return mac;
	}
	protected void setMac(String mac) {
		this.mac = mac;
	}
	protected String getSO() {
		return SO;
	}
	protected void setSO(String sO) {
		this.SO = sO;
	}
	protected int getNumincidentes() {
		return numincidentes;
	}
	protected void setNumincidentes(int numincidentes) {
		this.numincidentes = numincidentes;
	}
	@Override
	public String toString() {
		return nombre + " - " + mac + " : " + numincidentes ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(SO, mac, nombre, numincidentes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(mac, other.mac);
	}
	
	
}