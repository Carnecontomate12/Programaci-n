package Orientacionobjetos;

public class GestionaGato {
	public static void main(String[] args) {
		Gato gata1 = new Gato ();
		gata1.sexo = "hembra";
		Gato gata2 = new Gato ();
		gata2.sexo = "hembra";
		Gato gato = new Gato ();
		gato.sexo = "macho";
	
		gata1.maullar();
		gata1.comer("pienso");
		gata1.luchar(gata2);
		
		gata2.ronroneo();
		gata1.comer("pescado");
		
		gato.luchar(gata1 );
	}
}
