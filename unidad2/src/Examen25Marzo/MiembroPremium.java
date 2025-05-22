package Examen25Marzo;

import java.util.Arrays;
import java.util.Objects;

public class MiembroPremium extends MiembroBase{
	private static MiembroBase [] maximoAmigos = new MiembroBase [100];
	private TipoPremium tipo;
	public MiembroPremium(int id, String email, String nombre, int contadorAmigos, int contadorIdentificador,
			int amigos, TipoPremium tipo) {
		super(id, email, nombre, contadorAmigos, contadorIdentificador, amigos);
		this.tipo = tipo;
	}
	public static MiembroBase[] getMaximoAmigos() {
		return maximoAmigos;
	}
	public static void setMaximoAmigos(MiembroBase[] maximoAmigos) {
		MiembroPremium.maximoAmigos = maximoAmigos;
	}
	public TipoPremium getTipo() {
		return tipo;
	}
	public void setTipo(TipoPremium tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipo);
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
		MiembroPremium other = (MiembroPremium) obj;
		return tipo == other.tipo;
	}
	@Override
	public String toString() {
		return "MiembroPremium [tipo=" + tipo + "]";
	}
	
	
}
