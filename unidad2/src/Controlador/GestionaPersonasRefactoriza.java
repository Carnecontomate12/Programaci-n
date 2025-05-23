package Controlador;

import Modelo.Refactoriza.*;

public class GestionaPersonasRefactoriza {
	public static void main(String[] args) {

	PersonaRefactoriza carlos = new PersonaRefactoriza ("Carlos R.");
	IAccion[] acciones = carlos.getAcciones();
	acciones[0] = new Estudiante();
	System.out.println(carlos);
	
	PersonaRefactoriza cristina = new PersonaRefactoriza ("Cristina");
	acciones = cristina.getAcciones();
	acciones [1] = new Empleado();
	acciones [0] = new Estudiante();
	System.out.println(cristina);
	
	PersonaRefactoriza fernando = new PersonaRefactoriza ("Fernando");
	acciones = fernando.getAcciones();
	acciones [0] = new Estudiante();
	acciones [1] = new Empleado();
	acciones [2] = new Cliente();
	System.out.println(fernando);
}
}
