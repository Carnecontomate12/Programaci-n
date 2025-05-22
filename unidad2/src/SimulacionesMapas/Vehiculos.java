package SimulacionesMapas;

import java.util.List;
import java.util.Objects;

public class Vehiculos {
	private String vin;
	private String matricula;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String propietarioActual;
	private List <Rematriculacion>Rematriculaciones;
	
	public Vehiculos(String vin, String matricula, String marca, String modelo, int anioFabricacion,
			String propietarioActual, List<Rematriculacion> rematriculaciones) {
		super();
		this.vin = vin;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.propietarioActual = propietarioActual;
		Rematriculaciones = rematriculaciones;
	
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPropietarioActual() {
		return propietarioActual;
	}
	public void setPropietarioActual(String propietarioActual) {
		this.propietarioActual = propietarioActual;
	}
	public List<Rematriculacion> getRematriculaciones() {
		return Rematriculaciones;
	}
	public void setRematriculaciones(List<Rematriculacion> rematriculaciones) {
		Rematriculaciones = rematriculaciones;
	}
	@Override
	public int hashCode() {
		return Objects.hash(vin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculos other = (Vehiculos) obj;
		return Objects.equals(vin, other.vin);
	}
	@Override
	public String toString() {
		return "Vehiculos [vin=" + vin + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", anioFabricacion=" + anioFabricacion + ", propietarioActual=" + propietarioActual
				+ ", Rematriculaciones=" + Rematriculaciones + "]";
	}
	
	
}
