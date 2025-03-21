package Modelo.cadenaAlimenticia;

import java.util.Arrays;

public abstract class Animal {
	private String nombreEspecie;
	private String lugarHabita;
	private TipoFamilia tipofamilia;
	private String [] animalesQueCome;
	private String [] animalesComido;
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	public String getLugarHabita() {
		return lugarHabita;
	}
	public void setLugarHabita(String lugarHabita) {
		this.lugarHabita = lugarHabita;
	}
	public TipoFamilia getTipofamilia() {
		return tipofamilia;
	}
	public void setTipofamilia(TipoFamilia tipofamilia) {
		this.tipofamilia = tipofamilia;
	}
	public String[] getAnimalesQueCome() {
		return animalesQueCome;
	}
	public void setAnimalesQueCome(String[] animalesQueCome) {
		this.animalesQueCome = animalesQueCome;
	}
	public String[] getAnimalesComido() {
		return animalesComido;
	}
	public void setAnimalesComido(String[] animalesComido) {
		this.animalesComido = animalesComido;
	}
	@Override
	public String toString() {
		return "Animal [nombreEspecie=" + nombreEspecie + ", lugarHabita=" + lugarHabita + ", tipofamilia="
				+ tipofamilia + ", animalesQueCome=" + Arrays.toString(animalesQueCome) + ", animalesComido="
				+ Arrays.toString(animalesComido) + "]";
	}
	
	public abstract boolean atacar(Animal a);
	public abstract boolean huir(Animal b);
	public Animal(String nombreEspecie, String lugarHabita, TipoFamilia tipofamilia, String[] animalesQueCome,
			String[] animalesComido) {
		super();
		this.nombreEspecie = nombreEspecie;
		this.lugarHabita = lugarHabita;
		this.tipofamilia = tipofamilia;
		this.animalesQueCome = animalesQueCome;
		this.animalesComido = animalesComido;
	}
	
}
