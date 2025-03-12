package Modelo.presentacion;

public class Animal extends SerVivo{

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}
	public void come() {
		System.out.println("El animal come.");
	}
	
	public void respira () {
		System.out.println("El animal respira");
	}
}
