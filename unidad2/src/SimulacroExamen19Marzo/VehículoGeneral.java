package SimulacroExamen19Marzo;

import java.util.Objects;

public abstract class VehículoGeneral {
	private int id;
	private boolean alquilado;
	public VehículoGeneral(int id, boolean alquilado) {
		super();
		this.id = id;
		this.alquilado = alquilado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	@Override
	public String toString() {
		return "VehículoGeneral [id=" + id + ", alquilado=" + alquilado + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(alquilado, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehículoGeneral other = (VehículoGeneral) obj;
		return alquilado == other.alquilado && id == other.id;
	}
	
	
}
