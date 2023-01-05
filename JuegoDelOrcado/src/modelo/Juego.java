package modelo;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador ganador;
	private String palabra;
	private String acertados;
	private int vidas;
	
	public Juego(Jugador jugador1, Jugador jugador2, String palabra) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.ganador = null;
		this.palabra = palabra;
		setAcertados();
		this.vidas = 7;
	}



	public Jugador getJugador1() {
		return jugador1;
	}



	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}



	public Jugador getJugador2() {
		return jugador2;
	}



	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}



	public Jugador getGanador() {
		return ganador;
	}



	public void setGanador(Jugador ganador) {
		this.ganador = ganador;
	}



	public String getPalabra() {
		return palabra;
	}



	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}



	public String getAcertados() {
		return acertados;
	}

	
	public void setAcertados() {
		char[] vectorLetras=palabra.toCharArray(); // convertimos la palabra a descubrir en un vector de char
    	for(int i=0; i<vectorLetras.length; i++) {
    		if(vectorLetras[i]!=' ') 
    			vectorLetras[i]='-';
//    		todas las posiciones que no sean espacios, seran suplantadas por un guion
//    		por lo tanto, el vector de caracteres tendra guiones en lugar de letras
    		
    		}
    	
    	
    	this.acertados = String.copyValueOf(vectorLetras); 
//    	el atriuto que representa a las letras acertadas va a ser igual al vector que contiene guiones en lugares especificos
//	    para esto convertimos el vector de char en string y se lo igualamos a "acertados"
	}
	
	

	public int getVidas() {
		return vidas;
	}



	public void setVidas(int vidas) {
		this.vidas = vidas;
	}


   
    public boolean insertarLetra(char c) {
    	boolean retorno = false;
    	List<Integer> posiciones = posicionesDeLaLetra(c);// esta lista nos dará las posiciones en la que se encuentra la letra
        if(posiciones.isEmpty()) { // si la lista no contiene posiciones es falso
        	retorno = false;
        }else {
        	char[] vectorAcertados = acertados.toCharArray();// si se encuentra, creamos un vector de char con las letras que contiene "acertados"
        	for(int i = 0; i < posiciones.size(); i++) {
        		vectorAcertados[posiciones.get(i)]=c;// guardamos la letra en cada posicion que se encuentre
        	}
        	acertados = String.copyValueOf(vectorAcertados); //"acertados" ahora va a tener la nueva letra agregada
        	retorno = true;
         }
     	return retorno;
  }
    
    public List<Integer> posicionesDeLaLetra(char c) {
    	List<Integer> posiciones = new ArrayList<Integer>();
    	for(int i=0; i<palabra.length(); i++) {
    		if(palabra.charAt(i)==c)
    			posiciones.add(i);
    	}
    	return posiciones;	
//    	este metodo nos va a devolver una lista de elementos enteros, cada elemento va a representar la posicion en la que
//    	se encuentra la letra solicitada por parametro
    }



	@Override
	public String toString() {
		return "Juego [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", ganador=" + ganador + ", palabra="
				+ palabra + ", acertados=" + acertados + ", vidas=" + vidas + "]";
	}




}
	
	