package EjercicioProvincia;

import java.util.LinkedList;
import java.util.List;

public class GestionaProvincia {
		List<Provincia> provincias = new LinkedList<>();
		
		boolean addSinRepetidos(Provincia p) throws ProvinciaException{
			boolean agregado = false;
			if(provincias.contains(p)) {
				throw new ProvinciaException ("Provincia repetida");
		}else {
			agregado = provincias.add(p);
		}
			return agregado;
	}
		Provincia setSinRepetidos (int index, Provincia nuevaProvincia) throws ProvinciaException{
			Provincia actual = provincias.get(index);
			if(provincias.contains(nuevaProvincia)) {
				throw new ProvinciaException ("Provincia repetida");
		}else {
			actual = provincias.set(index, nuevaProvincia);
		}
			return actual;
	}
	public static void main(String[] args) {
		GestionaProvincia listaProvincias = new GestionaProvincia();
		try {
			listaProvincias.addSinRepetidos(new Provincia("Sevilla", 1950000));
			listaProvincias.addSinRepetidos(new Provincia("Cádiz", 520000));
			listaProvincias.addSinRepetidos(new Provincia("Huelva", 750000));
		}
		catch (ProvinciaException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Lista final: ");
		for(Provincia p :listaProvincias.provincias) {
			System.out.println(p);
		}
	}
}
