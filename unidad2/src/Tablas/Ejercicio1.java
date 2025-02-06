package Tablas;

public class Ejercicio1 {
	public static void main(String[] args) {
		String [] diassemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		for (String dia : diassemana)
		{
			System.out.println(dia);
		}	
		for (int pos = 0; pos< diassemana.length; pos++)
			if (pos<5) {
				System.out.println("Laborable");
			}
			else {
			System.out.println("Festivos");
			}
	}

}
