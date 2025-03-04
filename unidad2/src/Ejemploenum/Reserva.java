package Ejemploenum;

public class Reserva {
		public enum Mes {
			ENERO, FEBRERO, MARZO, ABRIL, MAYO,
			JUNIO, JULIO, AGOSTO,SEPTIEMBRE, OCTUBRE, 
			NOVIEMBRE, DICIEMBRE;
		}
		Mes mes = Mes.ENERO;
		
		Mes mes2 = Mes.valueOf("VERANO");
		public static void main(String[] args) {
			Mes mes2 = Mes.valueOf("FEBRERO");
			System.out.println(mes2);
		}
}