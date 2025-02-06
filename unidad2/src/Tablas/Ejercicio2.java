package Tablas;

public class Ejercicio2 {
	public static void main(String[] args) {
		String [] diassemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		int pos = 0;
		while (pos < diassemana.length) {
			if (pos < 5) {
			System.out.println("Laborable" + diassemana[pos]);
			}
			else {
				System.out.println("Festivo" + diassemana [pos]);
				}
		}
			
	}
}
