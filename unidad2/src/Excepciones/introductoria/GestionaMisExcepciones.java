package Excepciones.introductoria;

public class GestionaMisExcepciones {

	public static void main(String[] args) throws AdrianException {
		try {
		throw new AdrianException ("Lanzando mis excepciones");
		}
		catch (AdrianException a1) {
			System.out.println(a1.getMessage());
			throw a1;
		}
	}
}
