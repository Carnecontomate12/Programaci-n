package Controlador;

import Modelo.Perro;
import Modelo.Animal;
import Modelo.Gato; 
import Modelo.Pez; 

public class GestionaAnimales {
	public static void main(String[] args) {
		Animal p = new Perro ();
		Animal g = new Gato ();
		Animal pez = new Pez();
		System.out.println(p.getAlimento());
		System.out.println(p.getSonidoQueEmite());
		
		System.out.println(g.getAlimento());
		System.out.println(g.getSonidoQueEmite());
		
		System.out.println(pez.getAlimento());
		System.out.println(pez.getSonidoQueEmite());
		
	}
}
