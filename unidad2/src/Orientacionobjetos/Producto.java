package Orientacionobjetos;

public class Producto {
	String nombre;
	int numunidades;
	double precioventa;
	
	
	
	boolean pedirstock() {
		boolean pedido =false;
		if( numunidades >1) {
			pedido = false;
		} else {
			pedido = true;
		}
		
		
		return pedido;
	}
	
	int aumentounidades(int aumento) {
		int unidaumentada = numunidades+aumento;
		
		return unidaumentada;
	}
	String convierteCadena(){
		String cadena ="Gato1: "+nombre + nivel + tipo;
		return cadena;
	}
	
}