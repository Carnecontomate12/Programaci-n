package Orientacionobjetos;

public class GestionaPokemon {
	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Eléctrico";
		
		Pokemon mew2 = new Pokemon ();
		mew2.nombre = "Mewto";
		mew2.nivel = 20;
		mew2.tipo = "Psiquico";
		
		
		String cadenamew2 = mew2.convierteCadena();
		System.out.println(cadenamew2);
		String cadenaPikachu = pikachu.convierteCadena();
		System.out.println(cadenaPikachu);
		boolean gana = pikachu.fight(mew2);
		System.out.println(gana);
		cadenaPikachu = pikachu.convierteCadena();
		System.out.println(cadenaPikachu);
		cadenamew2 = mew2.convierteCadena();
		System.out.println(cadenamew2);
		
		
	}
}