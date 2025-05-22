package dam.primero.modelos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Prestamos {
private int id_prestamo;
private Usuario usuario;
private Libro libro;
private LocalDate fechaPrestamo;
private LocalDate fechadevolucion;
public Set<Prestamos> listaPrestamos;



public Prestamos(int id_prestamo, Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechadevolucion) {
	super();
	this.id_prestamo = id_prestamo;
	this.usuario = usuario;
	this.libro = libro;
	this.fechaPrestamo = fechaPrestamo;
	this.fechadevolucion = fechadevolucion;
	this.listaPrestamos = new HashSet();
}

public int getId_prestamo() {
	return id_prestamo;
}

public void setId_prestamo(int id_prestamo) {
	this.id_prestamo = id_prestamo;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public Libro getLibro() {
	return libro;
}

public void setLibro(Libro libro) {
	this.libro = libro;
}

public LocalDate getFechaPrestamo() {
	return fechaPrestamo;
}

public void setFechaPrestamo(LocalDate fechaPrestamo) {
	this.fechaPrestamo = fechaPrestamo;
}

public LocalDate getFechadevolucion() {
	return fechadevolucion;
}

public void setFechadevolucion(LocalDate fechadevolucion) {
	this.fechadevolucion = fechadevolucion;
}

public Set<Prestamos> getListaPrestamos() {
	return listaPrestamos;
}

public void setListaPrestamos(Set<Prestamos> listaPrestamos) {
	this.listaPrestamos = listaPrestamos;
}

@Override
public int hashCode() {
	return Objects.hash(id_prestamo);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Prestamos other = (Prestamos) obj;
	return id_prestamo == other.id_prestamo;
}

@Override
public String toString() {
	return "Prestamo [id_prestamo=" + id_prestamo + ", usuario=" + usuario + ", libro=" + libro + ", fechaPrestamo="
			+ fechaPrestamo + ", fechadevolucion=" + fechadevolucion + ", listaPrestamos=" + listaPrestamos + "]";
}


public void registrarPrestamo() {
	
}







}
