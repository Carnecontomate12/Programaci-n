package Modelo.Refactoriza;

public class Estudiante extends PersonaRefactoriza implements IAccion{

	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return "Estudiante que estudia";
	}

	@Override
	public String toString() {
		return ejecutaAccion() ;
	}
	
}
