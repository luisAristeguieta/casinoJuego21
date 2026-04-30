package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	private Dealer dealer;
	
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
	    }
	}
		
}
