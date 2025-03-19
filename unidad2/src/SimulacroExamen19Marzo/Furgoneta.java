package SimulacroExamen19Marzo;

import java.util.Objects;

public class Furgoneta extends VehículoCombustible{
	private int numPlazas;
	private int pma;
	public Furgoneta(int id, boolean alquilado, String matricula, boolean diesel, String modelo, String marca,
			int numPlazas, int pma) {
		super(id, alquilado, matricula, diesel, modelo, marca);
		this.numPlazas = numPlazas;
		this.pma = pma;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public int getPma() {
		return pma;
	}
	public void setPma(int pma) {
		this.pma = pma;
	}
	@Override
	public String toString() {
		return "Furgoneta [numPlazas=" + numPlazas + ", pma=" + pma + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numPlazas, pma);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furgoneta other = (Furgoneta) obj;
		return numPlazas == other.numPlazas && pma == other.pma;
	}
	
	
}
