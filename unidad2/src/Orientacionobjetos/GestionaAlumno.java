package Orientacionobjetos;

public class GestionaAlumno {
	public static void main(String[] args) {
		Alumno alum1 = new Alumno();
		alum1.nombre= "Federico";
		alum1.dni= "12345678C";
		alum1.nota= 3;
		
		Alumno alum2 = new Alumno();
		alum2.nombre= "Joselu";
		alum2.dni= "87654321q";
		alum2.nota= 8;
	
		String cadenaalum1 = alum1.pasoCadena();
		System.out.println(cadenaalum1);
		String cadenaalum2 = alum2.pasoCadena();
		System.out.println(cadenaalum2);
		
		boolean apruebaAlum1 = alum1.estaAprobado();
		System.out.println(apruebaAlum1);
		
		alum2.nota = 8;
		boolean apruebaAlum2 = alum2.estaAprobado();
		System.out.println(apruebaAlum2);
	}
}
