package Simulacro2examen19Marzo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Deportista implements ICompeticion{
	private String nombre;
	private String pais;
	protected float peso;
	private float altura;
	private Pruebas[] prueba = new Pruebas [50];
	
	
	public Deportista(String nombre, String pais, float peso, float altura, int i) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Pruebas[] getPrueba() {
		return prueba;
	}

	public void setPrueba(Pruebas[] prueba) {
		this.prueba = prueba;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(prueba);
		result = prime * result + Objects.hash(altura, nombre, pais, peso);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais)
				&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso)
				&& Arrays.equals(prueba, other.prueba);
	}
	

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", peso=" + peso + ", altura=" + altura + ", prueba="
				+ Arrays.toString(prueba) + "]";
	}

	@Override
	public void competir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}
	protected abstract double getTiempoCalentamiento ();
	protected abstract double getCaloriasNecesariasDias ();
	protected double getHorasEntrenamiento (LocalDate fecha) {
		int numDias = 0;
		return numDias;
	}
	public Pruebas getPruebaMasCercana () {
		Pruebas p = prueba[0];
		for (int i = 0; i <prueba.length; i++) {
			if(p != null && prueba[i].equals(Estado.PLANIFICADA)) {
				int diasMinimo = p.getFecha().compareTo(LocalDate.now());
				Pruebas itero = prueba[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMinimo > diasItero){
					p= itero;
				}
			}
		}
		return p;
	}	
}