package Ejercicio1Boletin5Orientación;

import java.util.Objects;

public class Personaje {
	private String nombre;
	private String arma;
	private int nivel;
	private int hp;
	public Personaje(String nombre, String arma, int nivel, int hp) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.nivel = nivel;
		this.hp = hp;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getArma() {
		return arma;
	}
	protected void setArma(String arma) {
		this.arma = arma;
	}
	protected int getNivel() {
		return nivel;
	}
	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}
	protected int getHp() {
		return hp;
	}
	protected void setHp(int hp) {
		this.hp = hp;
	}
	public boolean esAtacado(Personaje p) {
		return true;
	}
	public boolean esAtacado(Personaje p, int distancia) {
		return true;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + ", nivel=" + nivel + ", hp=" + hp + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(arma, hp, nivel, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && hp == other.hp && nivel == other.nivel
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
}
