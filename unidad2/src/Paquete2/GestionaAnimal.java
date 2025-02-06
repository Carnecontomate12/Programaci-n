package Paquete2;

class GestionaAnimal {
	public static void main(String[] args) {
		Animal perro = new Animal ();
		perro.tipo = "perro";
		perro.nombre = "Rocky";
		//perro.edad = 2; //No se ve porque en la clase animal se ha puesto private
	
		boolean andar = perro.caminar();
		System.out.println(andar);
		
		perro.comerChucho();
	}
}
