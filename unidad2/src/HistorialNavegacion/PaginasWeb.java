package HistorialNavegacion;

import java.time.LocalTime;
import java.util.Objects;

public class PaginasWeb implements Comparable <PaginasWeb>{
	private String url;
	private LocalTime fecha;
	public PaginasWeb(String url, LocalTime fecha) {
		super();
		this.url = url;
		this.fecha = fecha;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalTime fecha) {
		this.fecha = fecha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha, url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginasWeb other = (PaginasWeb) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(url, other.url);
	}
	@Override
	public String toString() {
		return "PaginasWeb [url=" + url + ", fecha=" + fecha + "]";
	}
	@Override
	public int compareTo(PaginasWeb o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
