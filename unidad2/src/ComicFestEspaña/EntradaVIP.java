package ComicFestEspaña;

import java.time.chrono.ChronoLocalDate;
import java.util.Objects;

public class EntradaVIP {
	private String cod_entrada;
	private ChronoLocalDate fechaEntrada;
	private Tipo tipo;
	private Estado estado;
	public EntradaVIP(String cod_entrada, ChronoLocalDate fechaEntrada, Tipo tipo, Estado estado) {
		super();
		this.cod_entrada = cod_entrada;
		this.fechaEntrada = fechaEntrada;
		this.tipo = tipo;
		this.estado = estado;
	}
	public String getCod_entrada() {
		return cod_entrada;
	}
	public void setCod_entrada(String cod_entrada) {
		this.cod_entrada = cod_entrada;
	}
	public ChronoLocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(ChronoLocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_entrada, estado, fechaEntrada, tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaVIP other = (EntradaVIP) obj;
		return Objects.equals(cod_entrada, other.cod_entrada) && estado == other.estado
				&& Objects.equals(fechaEntrada, other.fechaEntrada) && tipo == other.tipo;
	}
	@Override
	public String toString() {
		return "EntradaVIP [cod_entrada=" + cod_entrada + ", fechaEntrada=" + fechaEntrada + ", tipo=" + tipo
				+ ", estado=" + estado + "]";
	}
	
	
}
