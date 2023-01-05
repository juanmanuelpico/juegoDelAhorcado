package modelo;

public class Jugador {
	private String nombre;
	private int partidasGanadas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.partidasGanadas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	@Override
	public String toString() {
		return "	Jugador \n	nombre:" + nombre + "			 partidasGanadas:" + partidasGanadas ;
	}
	
	
	

}
