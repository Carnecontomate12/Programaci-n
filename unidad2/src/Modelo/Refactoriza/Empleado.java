package Modelo.Refactoriza;

public class Empleado extends PersonaRefactoriza implements IAccion{

	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return "Trabajador que trabaja";
	}

	@Override
	public String toString() {
		return ejecutaAccion();
	}
	
}
