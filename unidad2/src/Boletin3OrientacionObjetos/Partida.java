package Boletin3OrientacionObjetos;

import java.util.Arrays;

public class Partida {
	private String nombreJuego;
	private Participante [] participantes;
	private Participante ganador;
	public Partida(String nombreJuego, Participante[] participantes, Participante ganador) {
		super();
		this.nombreJuego = nombreJuego;
		this.participantes = participantes;
		this.ganador = ganador;
	
	}
	
	@Override
	public String toString() {
		return "Partida [nombreJuego=" + nombreJuego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";
	}
	double jugadorMayorPuntuación () {
		
		return null;
	}
	void imprimeGanador () {
		
	}
}
