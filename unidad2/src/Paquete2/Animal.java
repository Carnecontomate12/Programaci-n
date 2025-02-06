package Paquete2;

class Animal {
	String tipo;
	public String nombre;
	//private int edad; //No es visible en otras clases porque es private.

	public boolean caminar (){
		return true;
	}

	public void comerChucho () {
		if (tipo.equals("perro")) {
			comer();
		}else {
			System.out.println("Te vas a quedar esmallao");
		}
	}
	private void comer () {
		System.out.println("Estoy comiendo");
	}
	
}
