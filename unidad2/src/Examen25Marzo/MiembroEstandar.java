package Examen25Marzo;

public class MiembroEstandar extends MiembroBase{
	private static MiembroBase [] maximoAmigos = new MiembroBase [50];
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	public static MiembroBase[] getMaximoAmigos() {
		return maximoAmigos;
	}
	public static void setMaximoAmigos(MiembroBase[] maximoAmigos) {
		MiembroEstandar.maximoAmigos = maximoAmigos;
	}
	@Override
	public String toString() {
		return "MiembroEstandar []";
	}
	public MiembroEstandar(int id, String email, String nombre, int contadorAmigos, int contadorIdentificador,
			int amigos) {
		super(id, email, nombre, contadorAmigos, contadorIdentificador, amigos);
		// TODO Auto-generated constructor stub
	}
	

}
