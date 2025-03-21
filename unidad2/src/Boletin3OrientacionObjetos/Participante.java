package Boletin3OrientacionObjetos;

public class Participante {
	private String nick;
	private String nombreParticipante;
	private int edad;
	private int puntuacionTorneo;
	public Participante(String nick, String nombreParticipante, int edad, int puntuacionTorneo) {
		super();
		this.nick = nick;
		this.nombreParticipante = nombreParticipante;
		this.edad = edad;
		this.puntuacionTorneo = puntuacionTorneo;
	}
	@Override
	public String toString() {
		return "Participante [nick=" + nick + ", nombreParticipante=" + nombreParticipante + ", edad=" + edad
				+ ", puntuacionTorneo=" + puntuacionTorneo + "]";
	}
}
