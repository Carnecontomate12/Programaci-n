package Modelo.Refactoriza;

public class Cliente implements IAccion{

	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return "Cliente que compra";
	}
	@Override
	public String toString() {
		return ejecutaAccion() ;
	}
}
