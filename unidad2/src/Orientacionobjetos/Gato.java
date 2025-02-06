package Orientacionobjetos;

public class Gato {
	String color;
	String raza;
	String sexo;
	int edad;
	float peso;

	void maullar() {
		System.out.println("Miauuuu");

	}

	void ronroneo() {
		System.out.println("Miauuuu");
	}

	void comer(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		} else {
			System.out.println("Buahhh, mejor que no");
		}
	}

	void luchar(Gato g2) {
		if (sexo.equals(g2.sexo)) {
			System.out.println("Ven pa ca que te vas a enterar");
		} else {
			System.out.println("No a la violencia");
		}
	}
	String convierteCadena(){
		String cadena ="Pokemon 1: "+color+raza+sexo+edad+peso;
		return cadena;
		}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}
}