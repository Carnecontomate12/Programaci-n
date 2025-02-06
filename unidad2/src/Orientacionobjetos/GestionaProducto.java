package Orientacionobjetos;

public class GestionaProducto {
	public static void main(String[] args) {
			Producto lapiz = new Producto();
			lapiz.nombre = "lapiz";
			lapiz.numunidades = 0;
			lapiz.precioventa = 0.3;
			
			Producto rotulador = new Producto();
			lapiz.nombre = "rotulador";
			lapiz.numunidades = 10;
			lapiz.precioventa = 0.23;
			
			String cadenamew2 = rotulador.convierteCadena();
			System.out.println(cadenamew2);
			String cadenaPikachu = lapiz.convierteCadena();
			System.out.println(cadenaPikachu);
			boolean gana = lapiz.pedirstock();
			System.out.println(gana);
			cadenaPikachu = lapiz.convierteCadena();
			System.out.println(cadenaPikachu);
			cadenamew2 = rotulador.convierteCadena();
			System.out.println(cadenamew2);
			
			
	}
}