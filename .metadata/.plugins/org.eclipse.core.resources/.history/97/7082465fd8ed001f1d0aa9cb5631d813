package Tarea_evaluable;

import java.util.Objects;

public class Empleado {
	private String nombre;
	private String dni;
	private int salario;

	protected Empleado(String nombre, String dni, int salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = calculaSalario(null, salario);
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected int getSalario() {
		return salario;
	}

	protected int setSalario(int salario) {
		return this.salario = salario;

	}

	public int calculaSalario(Empleado e, int cantidad) {
		e.setSalario(cantidad);
		return cantidad;
	}

	public int calculaSalario(int salario) {
		setSalario(salario);
		return setSalario(salario);

	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && salario == other.salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}

}
