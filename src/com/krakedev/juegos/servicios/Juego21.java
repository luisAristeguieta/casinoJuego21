package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	private Dealer dealer;
	
	public ArrayList<Jugador> getJugadores() {
	    return jugadores;
	}

	public Dealer getDealer() {
	    return dealer;
	}
	
	public void cargarValores() {
	// Asigna el valor del valorJuego que lo condiciona al valor de la carta en numeros: 
		
	    for (Carta carta : dealer.getNaipe()) {
	    	
	    	String valor = carta.getValor();
	    	
	    	if (valor.equals("A")) {
	    		carta.setValorJuego(11);
	    	} else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
	    		carta.setValorJuego(10);
	    	} else {
	    		carta.setValorJuego(Integer.parseInt(valor));
	    	}
	    	
	    }
	}
	
	public void inicializar() {
		// Esto se pudo colocar como constructor pero se creo un metodo para inicializar el dealer y arrancar el metodo anterior
		dealer = new Dealer();
		cargarValores();
	}
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void repartirCarta(Jugador jugador) {
		Carta cartaEntregada = dealer.entregarCarta();
		jugador.recibirCarta(cartaEntregada);	
	}
	
	public void repartirRonda() {
	    for (Jugador jugador : jugadores) {
	        repartirCarta(jugador);
	        calcularTotal(); // Agregado posterior
	    }
	}
	
	public void calcularTotal() {
		// Operacion aristmetica que acumula el valor total por jugador
	    for (Jugador jugador : jugadores) {
	        int total = 0;
	        for (Carta carta : jugador.getCartas()) {
	            total += carta.getValorJuego();
	        }
	        
	        jugador.setPuntajeCartas(total);
	    }
	}
	
	public ArrayList<Jugador> validarGanador() {
		// Recorre la lista de jugadores y retorna aquellos cuyo puntaje es igual a 21
	    ArrayList<Jugador> ganadores = new ArrayList<>();

	    for (Jugador jugador : jugadores) {
	        if (jugador.getPuntajeCartas() == 21) {
	            ganadores.add(jugador);
	        }
	    }
	    return ganadores;
	}
	
	public ArrayList<Jugador> jugar() {
		// Ejecuta hasta 3 rondas del juego, repartiendo cartas y validando ganadores
		// Si uno o más jugadores alcanzan 21, se detiene y retorna la lista de ganadores
	    ArrayList<Jugador> ganadores = new ArrayList<>();
	    for (int i = 0; i < 3; i++) {
	        repartirRonda();
	        ganadores = validarGanador();
	        if (ganadores.size() > 0) {
	            break;
	        }
	    }
	    return ganadores;
	}
	
		
}
